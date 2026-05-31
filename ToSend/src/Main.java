<<<<<<< Updated upstream
=======
// Интерфейс с default и static методами
interface Vehicle {

    // Абстрактный метод (должен быть реализован)
    void start();

    // Неабстрактный (default) метод
    default void stop() {
        System.out.println("Транспорт остановлен");
    }

    // Статический метод
    static void info() {
        System.out.println("Это интерфейс Vehicle");
    }

    // Еще один default метод
    default void honk() {
        System.out.println("Сигнал: Бип-бип");
    }
}

// Класс, реализующий интерфейс
class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Машина завелась");
    }

    // Переопределяем default метод (по желанию)
    @Override
    public void stop() {
        System.out.println("Машина остановилась");
    }
}

class Main {
    public static void main(String[] args) {
        Car car = new Car();

        // Способы вызова методов

        // 1. Вызов абстрактного метода (реализован в классе)
        car.start();

        // 2. Вызов default метода через объект
        car.stop();

        // 3. Вызов другого default метода
        car.honk();

        // 4. Вызов статического метода через имя интерфейса
        Vehicle.info();

        // 5. Вызов через переменную типа интерфейса
        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.stop();
        vehicle.honk();
    }
}

// Первый интерфейс с default методом
interface A {
    default void print() {
        System.out.println("Метод из интерфейса A");
    }
}

// Второй интерфейс с таким же default методом
interface B {
    default void print() {
        System.out.println("Метод из интерфейса B");
    }
}

// Класс реализует оба интерфейса - конфликт!
class MyClass implements A, B {

    // Обязательно нужно переопределить конфликтующий метод
    @Override
    public void print() {
        // Способ 1: своя реализация
        System.out.println("Своя реализация");

        // Способ 2: вызвать метод из интерфейса A
        A.super.print();

        // Способ 3: вызвать метод из интерфейса B
        B.super.print();
    }
}

// Пример без конфликта
interface C {
    default void show() {
        System.out.println("C");
    }
}

interface D {
    default void display() {
        System.out.println("D");
    }
}

class NormalClass implements C, D {
    // Конфликта нет, методы разные
    // Можно не переопределять
}

class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.print();

        System.out.println();

        NormalClass normal = new NormalClass();
        normal.show();
        normal.display();
    }
}
>>>>>>> Stashed changes
