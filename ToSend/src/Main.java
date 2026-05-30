<<<<<<< Updated upstream
=======
// Файл: pkg1/A.java
package pkg1;

public class A {
    private int privateVar = 1;
    int defaultVar = 2;
    protected int protectedVar = 3;
    public int publicVar = 4;

    public void showSameClass() {
        System.out.println("=== Внутри того же класса A ===");
        System.out.println("privateVar: " + privateVar);
        System.out.println("defaultVar: " + defaultVar);
        System.out.println("protectedVar: " + protectedVar);
        System.out.println("publicVar: " + publicVar);
    }
}

// Файл: pkg1/B.java
package pkg1;

public class B {
    public void showSamePackage() {
        A obj = new A();
        System.out.println("=== Внутри того же пакета (B) ===");
        // System.out.println(obj.privateVar);
        System.out.println("defaultVar: " + obj.defaultVar);
        System.out.println("protectedVar: " + obj.protectedVar);
        System.out.println("publicVar: " + obj.publicVar);
    }
}

// Файл: pkg1/C.java
package pkg1;

class C extends A {
    public void showSubclassSamePackage() {
        System.out.println("=== Подкласс в том же пакете (C) ===");
        // System.out.println(privateVar);
        System.out.println("defaultVar: " + defaultVar);
        System.out.println("protectedVar: " + protectedVar);
        System.out.println("publicVar: " + publicVar);
    }
}

// Файл: pkg2/D.java
package pkg2;
import pkg1.A;

public class D {
    public void showOtherPackage() {
        A obj = new A();
        System.out.println("=== Другой пакет (D) ===");
        // System.out.println(obj.privateVar);
        // System.out.println(obj.defaultVar);
        // System.out.println(obj.protectedVar);
        System.out.println("publicVar: " + obj.publicVar);
    }
}

// Файл: pkg2/E.java
package pkg2;
import pkg1.A;

class E extends A {
    public void showSubclassOtherPackage() {
        System.out.println("=== Подкласс в другом пакете (E) ===");
        // System.out.println(privateVar);
        // System.out.println(defaultVar);
        System.out.println("protectedVar: " + protectedVar);
        System.out.println("publicVar: " + publicVar);
    }
}
>>>>>>> Stashed changes
