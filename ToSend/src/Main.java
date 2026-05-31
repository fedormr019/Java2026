<<<<<<< Updated upstream
=======
Throwable - родительский класс для всех исключений и ошибок. Все, что может быть "выброшено" (throw), наследуется от него.

        Error - серьезные проблемы, которые обычно не должны обрабатываться программой. Возникают на уровне JVM (например, нехватка памяти). Программа не может их обработать.

        Exception - исключения, которые могут быть обработаны программой. Делится на checked (проверяемые) и unchecked (непроверяемые).

RuntimeException - исключения времени выполнения (unchecked). Возникают из-за ошибок программиста и не требуют обязательной обработки.

class Main {
    public static void main(String[] args) {

        // 1. ArithmeticException - арифметическая ошибка (деление на ноль)
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        // 2. ArrayIndexOutOfBoundsException - выход за границы массива
        try {
            int[] arr = new int[5];
            int value = arr[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // 3. IllegalArgumentException - неверный аргумент метода
        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

        // 4. ClassCastException - неверное приведение типов
        try {
            Object obj = "Это строка";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }

        // 5. NullPointerException - обращение к null объекту
        try {
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }

    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным: " + age);
        }
        System.out.println("Возраст: " + age);
    }
}
>>>>>>> Stashed changes
