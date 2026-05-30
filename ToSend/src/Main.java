<<<<<<< Updated upstream
=======
class Calculator {

    // метод с одним int параметром
    public void print(int a) {
        System.out.println("Один int: " + a);
    }

    // метод с переменным числом int
    public void print(int... numbers) {
        System.out.print("Несколько int: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // метод с переменным числом String
    public void print(String... strings) {
        System.out.print("Несколько String: ");
        for (String str : strings) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    // метод с переменным числом Object
    public void print(Object... objects) {
        System.out.print("Несколько Object: ");
        for (Object obj : objects) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    // метод с фиксированным параметром и переменным числом
    public void print(String prefix, int... numbers) {
        System.out.print(prefix + ": ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.print(5);
        calc.print(1, 2, 3);
        calc.print(10, 20, 30, 40, 50);

        calc.print("Hello", "World");
        calc.print("A", "B", "C", "D");

        calc.print(1, "Hello", 3.14);
        calc.print("Числа:", 100, 200, 300);
    }
}
>>>>>>> Stashed changes
