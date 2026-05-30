class Main {
    public static void main(String[] args) {
        Integer dec = Integer.decode("123");
        Integer hex = Integer.decode("0x7B");
        Integer oct = Integer.decode("0173");
        Integer neg = Integer.decode("-123");

        System.out.println("dec: " + dec);
        System.out.println("hex: 0x7B = " + hex);
        System.out.println("oct: 0173 = " + oct);
        System.out.println("neg: " + neg);
    }
}

class Main {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(100);
        Integer b = Integer.valueOf("100");
        int c = Integer.parseInt("100");
        Integer d = Integer.decode("100");

        System.out.println("valueOf(100): " + a);
        System.out.println("valueOf(\"100\"): " + b);
        System.out.println("parseInt(\"100\"): " + c);
        System.out.println("decode(\"100\"): " + d);
    }
}

class Main {
    public static void main(String[] args) {
        // NullPointerException при автоупаковке не бывает (null присвоить примитиву нельзя)
        // NullPointerException возникает при автораспаковке null-объекта

        Integer nullInteger = null;
        int value = nullInteger; // NullPointerException здесь!
    }
}

class Main {
    public static void main(String[] args) {
        int i1 = 128;
        Integer a1 = i1;
        Integer b1 = i1;
        System.out.println("a1==i1 " + (a1 == i1));      // true
        System.out.println("b1==i1 " + (b1 == i1));      // true
        System.out.println("a1==b1 " + (a1 == b1));      // false
        System.out.println("a1.equals(i1) -> " + a1.equals(i1));   // true
        System.out.println("b1.equals(i1) -> " + b1.equals(i1));   // true
        System.out.println("a1.equals(b1) -> " + a1.equals(b1));   // true

        int i2 = 127;
        Integer a2 = i2;
        Integer b2 = i2;
        System.out.println("a2==i2 " + (a2 == i2));      // true
        System.out.println("b2==i2 " + (b2 == i2));      // true
        System.out.println("a2==b2 " + (a2 == b2));      // true
        System.out.println("a2.equals(i2) -> " + a2.equals(i2));   // true
        System.out.println("b2.equals(i2) -> " + b2.equals(i2));   // true
        System.out.println("a2.equals(b2) -> " + a2.equals(b2));   // true
    }
}
IntegerCache — это внутренний кэш Java, который хранит объекты Integer для диапазона чисел от -128 до 127 по умолчанию.
Для 128 создается 2 объекта поэтому будет false