<<<<<<< Updated upstream
=======
/**
 * Класс для демонстрации работы утилиты javadoc
 * @author Студент
 * @version 1.0
 * @since 2026
 */
public class Calculator {

    /**
     * Вычисляет сумму двух целых чисел
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма a и b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Вычисляет частное двух чисел
     * @param dividend делимое
     * @param divisor делитель
     * @return результат деления
     * @throws ArithmeticException если делитель равен нулю
     */
    public double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return dividend / divisor;
    }
}
>>>>>>> Stashed changes
