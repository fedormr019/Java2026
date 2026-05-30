<<<<<<< Updated upstream
=======
// Перегрузка методов (overloading) - внутри одного класса
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

    public String add(String a, String b) {
        return a + b;
    }
}

// Переопределение методов (override) - в подклассе
class Animal {
    public void makeSound() {
        System.out.println("Животное издает звук");
    }

    public void move() {
        System.out.println("Животное двигается");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Собака лает: Гав-гав");
    }

    @Override
    public void move() {
        System.out.println("Собака бегает на четырех лапах");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Кошка мяукает: Мяу-мяу");
    }
}

class Main {
    public static void main(String[] args) {
        // Перегрузка
        Calculator calc = new Calculator();
        System.out.println("add(int,int): " + calc.add(5, 3));
        System.out.println("add(int,int,int): " + calc.add(5, 3, 2));
        System.out.println("add(double,double): " + calc.add(5.5, 3.2));
        System.out.println("add(String,String): " + calc.add("Hello", " World"));

        System.out.println();

        // Переопределение
        Animal animal = new Animal();
        animal.makeSound();
        animal.move();

        Dog dog = new Dog();
        dog.makeSound();
        dog.move();

        Cat cat = new Cat();
        cat.makeSound();

        // Полиморфизм
        Animal myPet = new Dog();
        myPet.makeSound();
    }
}
>>>>>>> Stashed changes
