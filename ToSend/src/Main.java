<<<<<<< Updated upstream
=======
public class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
}

class Main {
    public static void main(String[] args) {
        // Вариант 1: вызов через имя класса
        A.printVars();

        // Вариант 2: вызов через объект (не рекомендуется, но работает)
        A obj = new A();
        obj.printVars();

        // Вариант 3: вызов из другого статического метода того же класса
        AnotherClass.callPrintVars();
    }
}

class AnotherClass {
    public static void callPrintVars() {
        A.printVars();
    }
}
>>>>>>> Stashed changes
