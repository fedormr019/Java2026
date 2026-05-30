<<<<<<< Updated upstream
=======
class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));
        System.out.println(calc.add(2, 3, 4));
        System.out.println(calc.add(2.5, 3.7));
    }
}

class Animal {
    public String sound() {
        return "Животное издает звук";
    }

    public Animal getInstance() {
        return new Animal();
    }
}

class Dog extends Animal {
    @Override
    public String sound() {
        return "Собака лает: Гав-гав";
    }

    // Ошибка! Нельзя изменить тип возвращаемого значения
    // public int getInstance() {
    //     return 10;
    // }

    // Можно вернуть подкласс (ковариантный тип)
    @Override
    public Dog getInstance() {
        return new Dog();
    }
}

class Main {
    public static void main(String[] args) {
        Animal myPet = new Dog();
        System.out.println(myPet.sound());
    }
}

class Parent {
    public void show(int number) {
        System.out.println("Parent show: " + number);
    }
}

class Child extends Parent {

    // Без @Override ошибки не будет, но это перегрузка, а не переопределение
    public void show(String text) {
        System.out.println("Child show: " + text);
    }

    // Используем @Override - компилятор укажет на ошибку
    // Параметр не совпадает с родительским методом
    @Override
    public void show(String text) {
        System.out.println("Child show: " + text);
    }

    // Правильное переопределение
    @Override
    public void show(int number) {
        System.out.println("Child show: " + number);
    }
}

class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.show(10);
    }
}
Аннотация @Override помогает обнаружить ошибку, когда разработчик думает, что переопределяет метод, но на самом деле ошибается в имени, параметрах или типе возвращаемого значения. Без этой аннотации код скомпилируется (как перегрузка или новый метод), но поведение программы будет неожиданным. С @Override компилятор сразу выдаст ошибку.
>>>>>>> Stashed changes
