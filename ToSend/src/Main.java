<<<<<<< Updated upstream
=======
class Parent {
    public void simpleMethod() {
        System.out.println("Обычный метод");
    }

    public final void finalMethod() {
        System.out.println("Этот метод нельзя переопределить");
    }
}

class Child extends Parent {

    @Override
    public void simpleMethod() {
        System.out.println("Обычный метод переопределен");
    }

    // Ошибка! Нельзя переопределить final метод
    // public void finalMethod() {
    //     System.out.println("Попытка переопределить");
    // }
}

class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.simpleMethod();
        obj.finalMethod();
    }
}

final class FinalClass {
    public void show() {
        System.out.println("Метод из final класса");
    }
}

// Ошибка! Нельзя наследоваться от final класса
// class ChildClass extends FinalClass {
//     
// }

// Можно использовать final класс без наследования
class Main {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.show();
    }
}
>>>>>>> Stashed changes
