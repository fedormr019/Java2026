<<<<<<< Updated upstream
=======
class Main {
    public static void main(String[] args) {
        // = 
        int a = 10;

        // +=
        int x = 5;
        x += 3;
        x -= 6;
        x *= 3;
        x /= 2; // x = 3
        x %= 2; // x = 1

        // += с String
        String str = "Java";
        str += " Course";

        // ?:
        int age = 18;
        String result = (age >= 18) ? "Совершеннолетний" : "Несовершеннолетний";

        // || и &&
        boolean b1 = (5 > 3) || (2 > 10);
        boolean b2 = (5 > 3) && (2 > 10);

        // | ^ &
        int bitOr = 5 | 3;
        int bitXor = 5 ^ 3;
        int bitAnd = 5 & 3;

        // == !=
        int num1 = 10, num2 = 10;
        boolean isEqual = (num1 == num2);
        boolean isNotEqual = (num1 != 5);

        // > < >= <=
        boolean greater = (10 > 5);
        boolean less = (3 < 7);

        // >> >>> <<
        int rightShift = 16 >> 2;
        int unsignedRightShift = -16 >>> 2;
        int leftShift = 4 << 2;

        // + - * / %
        int sum = 10 + 5;
        int diff = 10 - 5;
        int product = 10 * 5;
        int quotient = 10 / 5;
        int remainder = 10 % 3;

        // Конкатенация String
        String text = "Число: " + 42;

        // ++ --
        int count = 5;
        int postInc = count++;
        int preInc = ++count;

        // ! и ~
        boolean bool = true;
        boolean notBool = !bool;
        int bitNot = ~5;

        // () и []
        int priority = (2 + 3) * 4;
        int[] array = {1, 2, 3};
        int element = array[0];

        System.out.println(str);
        System.out.println(result);
        System.out.println(text);
    }
}

class Main {
    public static void main(String[] args) {
        // instanceof с классом String
        String str = "Hello";
        boolean isString = str instanceof String;
        System.out.println("str instanceof String: " + isString);

        // instanceof с наследованием
        Animal animal = new Dog();
        boolean isDog = animal instanceof Dog;
        boolean isAnimal = animal instanceof Animal;
        boolean isCat = animal instanceof Cat;

        System.out.println("animal instanceof Dog: " + isDog);
        System.out.println("animal instanceof Animal: " + isAnimal);
        System.out.println("animal instanceof Cat: " + isCat);

        // instanceof с null-объектом
        String nullString = null;
        boolean nullCheck = nullString instanceof String;
        System.out.println("null instanceof String: " + nullCheck);

        Object nullObj = null;
        boolean nullObjCheck = nullObj instanceof Object;
        System.out.println("null instanceof Object: " + nullObjCheck);
    }
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
>>>>>>> Stashed changes
