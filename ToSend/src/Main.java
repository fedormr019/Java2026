<<<<<<< Updated upstream
=======
class Main {

    // Метод для демонстрации ситуаций
    public static void process(int type) {
        try {
            if (type == 1) {
                String str = null;
                str.length(); // NullPointerException
            } else if (type == 2) {
                int[] arr = new int[2];
                arr[5] = 10; // ArrayIndexOutOfBoundsException
            } else if (type == 3) {
                Object obj = "String";
                Integer num = (Integer) obj; // ClassCastException
            } else if (type == 4) {
                int result = 10 / 0; // ArithmeticException
            }
        }
        // Ситуация 1: несколько исключений обрабатываются идентично
        catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Идентичная обработка для NullPointer и ArrayIndexOutOfBounds");
            System.out.println("Тип исключения: " + e.getClass().getSimpleName());
            System.out.println("Сообщение: " + e.getMessage());
        }
        // Ситуация 2: иерархия Ex1 <|-- Ex2 <|-- Ex3
        // Объединять их через | нельзя, но можно через отдельные catch
        catch (ArithmeticException e) {
            System.out.println("Обработка ArithmeticException");
            e.printStackTrace();
        }
        catch (RuntimeException e) {
            System.out.println("Обработка RuntimeException (предок ArithmeticException)");
        }
        catch (Exception e) {
            System.out.println("Обработка Exception (предок RuntimeException)");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Случай 1 и 2: NullPointerException ===");
        process(1);

        System.out.println("\n=== Случай 1: ArrayIndexOutOfBoundsException ===");
        process(2);

        System.out.println("\n=== Случай 3: ClassCastException ===");
        process(3);

        System.out.println("\n=== Случай 4: ArithmeticException ===");
        process(4);
    }
}

java
class Main {
    public static void main(String[] args) {

        try {
            String str = null;
            str.length();
        } catch (final Exception e) {
            // final означает, что переменную e нельзя изменить внутри catch
            System.out.println("Исключение перехвачено: " + e.getMessage());

            // e = new Exception(); // Ошибка! Нельзя присвоить новое значение

            // Можно только читать и использовать e
            System.out.println("Класс: " + e.getClass());
            e.printStackTrace();
        }

        // Пример без final (можно изменять)
        try {
            int result = 10 / 0;
        } catch (Exception e) {
            System.out.println("Без final: " + e);
            e = new RuntimeException("Новое исключение"); // Можно изменить
            System.out.println("После изменения: " + e);
        }
    }
}
Переменная исключения становится неизменяемой - ей нельзя присвоить новое значение. Обычно используется для безопасности в многопоточной среде или когда нужно гарантировать, что ссылка на исключение не изменится.
>>>>>>> Stashed changes
