<<<<<<< Updated upstream
=======
public class A {
    public final int a;

    // Вариант 1: через конструктор
    public A() {
        a = 10;
    }

    // Вариант 2: через другой конструктор с параметром
    public A(int value) {
        a = value;
    }
}

// Вариант 3: инициализация при объявлении
public class B {
    public final int a = 5;
}

// Вариант 4: через блок инициализации
public class C {
    public final int a;
    {
        a = 7;
    }
}

// Вариант 5: через статический блок (для static final)
public class D {
    public static final int a;
    static {
        a = 20;
    }
}
>>>>>>> Stashed changes
