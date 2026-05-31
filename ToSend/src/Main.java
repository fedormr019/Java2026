<<<<<<< Updated upstream
=======
class Main {

    // Метод, который выбрасывает исключение без обработки
    public static void causeCrash() {
        int[] arr = new int[3];
        // Это исключение не перехвачено - программа упадет
        int value = arr[10]; // ArrayIndexOutOfBoundsException
    }

    // Метод, который перехватывает исключение
    public static void handleException() {
        try {
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Исключение перехвачено: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Начало программы");

        // Это исключение будет перехвачено
        handleException();

        System.out.println("Программа продолжает работу после перехвата");

        // Это исключение НЕ будет перехвачено - программа упадет
        causeCrash();

        // Этот код не выполнится
        System.out.println("Это сообщение не будет выведено");
    }
}
>>>>>>> Stashed changes
