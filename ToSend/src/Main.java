<<<<<<< Updated upstream
=======
class A {
    public static void method() {
        System.out.println("Статический метод из A");
    }

    public void nonStaticMethod() {
        System.out.println("Нестатический метод из A");
    }
}

class B extends A {
    // Ошибка! Нельзя переопределить статический метод
    // @Override
    public static void method() {
        System.out.println("Статический метод из B");
    }

    @Override
    public void nonStaticMethod() {
        System.out.println("Нестатический метод из B");
    }
}

class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new B();

        // Вызов статических методов - по типу ссылки, а не по типу объекта
        obj1.method(); // "Статический метод из A"
        obj2.method(); // "Статический метод из A" (не B!)

        // Вызов нестатических методов - по типу объекта (динамический полиморфизм)
        obj1.nonStaticMethod(); // "Нестатический метод из A"
        obj2.nonStaticMethod(); // "Нестатический метод из B"

        // Правильный вызов статических методов - через имя класса
        A.method();   // "Статический метод из A"
        B.method();   // "Статический метод из B"
    }
}
>>>>>>> Stashed changes
