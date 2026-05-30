<<<<<<< Updated upstream
=======
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        List<Integer> listInteger = new ArrayList<>();

        // instanceof с параметризованными классами
        boolean b1 = listString instanceof List;
        System.out.println("listString instanceof List: " + b1);

        boolean b2 = listInteger instanceof List;
        System.out.println("listInteger instanceof List: " + b2);

        // нельзя проверить instanceof с конкретным типом параметра
        // так писать нельзя: listString instanceof List<String>
        // компилятор выдаст ошибку

        // обход через raw type
        List rawList = listString;
        if (rawList instanceof List) {
            System.out.println("Это List, но тип параметра неизвестен");
        }
    }
}

import java.util.ArrayList;
import java.util.List;

class Animal {
    public void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Bark");
    }
}

class Puppy extends Dog {
    public void weep() {
        System.out.println("Weep");
    }
}

class Main {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());

        List<Puppy> puppies = new ArrayList<>();
        puppies.add(new Puppy());

        // extends T - можно читать как T, но нельзя писать
        System.out.println("=== extends Dog ===");
        printAnimals(dogs);
        // printAnimals(animals); // ошибка, Animal не является Dog или подклассом
        printAnimals(puppies); // работает, Puppy наследник Dog

        // super T - можно писать T и его подклассы, читать как Object
        System.out.println("=== super Dog ===");
        addDog(animals);
        addDog(dogs);
        // addDog(puppies); // ошибка, Puppy не является Dog или суперклассом
    }

    // ? extends T - принимает T и любые его подклассы
    // нужен когда нужно только читать данные
    public static void printAnimals(List<? extends Dog> list) {
        for (Dog dog : list) {
            System.out.println(dog);
        }
        // list.add(new Dog()); // нельзя добавить, тип неизвестен
    }

    // ? super T - принимает T и любые его суперклассы
    // нужен когда нужно только писать данные
    public static void addDog(List<? super Dog> list) {
        list.add(new Dog());
        list.add(new Puppy());
        // Dog dog = list.get(0); // нельзя прочитать как Dog, только как Object
        Object obj = list.get(0);
    }
}
>>>>>>> Stashed changes
