<<<<<<< Updated upstream
=======
class Parent {
    protected String name = "Родитель";
    protected int value = 10;

    public Parent() {
        System.out.println("Конструктор Parent без параметров");
    }

    public Parent(String name) {
        this.name = name;
        System.out.println("Конструктор Parent с параметром: " + name);
    }

    public void show() {
        System.out.println("Метод show из Parent");
    }
}

class Child extends Parent {
    private String name = "Ребенок";

    public Child() {
        super(); // 1. обращение к конструктору суперкласса
        System.out.println("Конструктор Child");
    }

    public Child(String name) {
        super(name); // 2. обращение к конструктору суперкласса с параметром
        System.out.println("Конструктор Child с параметром");
    }

    public void print() {
        System.out.println("super.name = " + super.name); // 2. доступ к полю суперкласса
        System.out.println("this.name = " + this.name);
        System.out.println("super.value = " + super.value);
    }

    @Override
    public void show() {
        super.show(); // 3. доступ к методу суперкласса
        System.out.println("Метод show из Child");
    }
}

class Main {
    public static void main(String[] args) {
        Child child1 = new Child();
        child1.print();
        child1.show();

        System.out.println();
        Child child2 = new Child("Новое имя");
        child2.print();
    }
}

class A {
    int a = 10;
    void method() {
        System.out.println("Метод method из класса A");
    }
}

class B extends A {
    // переменная a и метод method не определены здесь
    // они наследуются от класса A
}

class C extends B {
    void method() {
        int a = super.a;      // обращение к переменной a из класса A
        super.method();       // обращение к методу method из класса A
        System.out.println("Метод method из класса C");
        System.out.println("super.a = " + a);
    }
}

class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.method();
    }
}
Ничего не случится. Код будет работать корректно, потому что класс C наследуется от B, а B наследуется от A. Если в B нет переменной a и метода method, поиск идет выше по цепочке наследования до класса A, где они определены.

class A {
    int a;
    int b;
    int c;
    int z;

    public A() {
        this(0, 0, 0); // вызов конструктора с тремя параметрами
    }

    public A(int a) {
        this(a, 0, 0);
    }

    public A(int a, int b) {
        this(a, b, 0);
    }

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.z = 1;
    }

    public void print() {
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", z = " + z);
    }
}

class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A(5);
        A obj3 = new A(5, 10);
        A obj4 = new A(5, 10, 15);

        obj1.print();
        obj2.print();
        obj3.print();
        obj4.print();
    }
}
>>>>>>> Stashed changes
