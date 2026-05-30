<<<<<<< Updated upstream
=======
class Parent {
    protected int number = 10;
    protected String name = "Parent";

    public Parent() {
        System.out.println("Конструктор Parent");
    }

    public Parent(String name) {
        this.name = name;
        System.out.println("Конструктор Parent с параметром");
    }

    public void show() {
        System.out.println("Метод show из Parent");
    }
}

class Child extends Parent {
    private int number = 20;
    private String childName = "Child";

    public Child() {
        super(); // вызов конструктора родителя
        System.out.println("Конструктор Child");
    }

    public Child(String name) {
        super(name); // вызов конструктора родителя с параметром
        System.out.println("Конструктор Child с параметром");
    }

    public void print() {
        // super - обращение к родительскому классу
        System.out.println("super.number = " + super.number); // 10
        System.out.println("super.name = " + super.name);     // Parent

        // this - обращение к текущему классу
        System.out.println("this.number = " + this.number);   // 20
        System.out.println("this.childName = " + this.childName); // Child
    }

    public void testMethod() {
        super.show(); // вызов метода родителя
        this.show();  // вызов метода текущего класса
    }

    @Override
    public void show() {
        System.out.println("Метод show из Child");
    }
}

class Main {
    public static void main(String[] args) {
        Child child1 = new Child();
        child1.print();
        child1.testMethod();

        System.out.println();
        Child child2 = new Child("NewName");
        child2.print();
    }
}

class A {
    int a1;           // default - доступен в том же пакете
    public int a2;    // public - доступен везде
    protected int a3; // protected - доступен в пакете и подклассам
    private int a4;   // private - доступен только в классе A

    void method1() {           // default
        System.out.println("method1 из A");
    }

    public void method2() {    // public
        System.out.println("method2 из A");
    }

    protected void method3() { // protected
        System.out.println("method3 из A");
    }

    private void method4() {   // private
        System.out.println("method4 из A");
    }
}

class B extends A {
    public void test() {
        a1 = 1;    // доступно (default, B в том же пакете)
        a2 = 2;    // доступно (public)
        a3 = 3;    // доступно (protected)
        // a4 = 4; // НЕ доступно (private)

        method1(); // доступно
        method2(); // доступно
        method3(); // доступно
        // method4(); // НЕ доступно
    }
}

class C extends B {
    public void test() {
        a1 = 1;    // доступно
        a2 = 2;    // доступно
        a3 = 3;    // доступно
        // a4 = 4; // НЕ доступно

        method1(); // доступно
        method2(); // доступно
        method3(); // доступно
        // method4(); // НЕ доступно
    }
}
>>>>>>> Stashed changes
