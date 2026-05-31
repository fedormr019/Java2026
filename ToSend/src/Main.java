<<<<<<< Updated upstream
=======
// 1. @Override - проверяет, что метод действительно переопределяет метод суперкласса
// Помогает обнаружить ошибки на этапе компиляции

class Parent {
    public void show() {
        System.out.println("Parent show");
    }

    public void print() {
        System.out.println("Parent print");
    }
}

class Child extends Parent {

    // Правильное переопределение
    @Override
    public void show() {
        System.out.println("Child show");
    }

    // Ошибка! Метод display не существует в Parent
    // Компилятор выдаст ошибку
    // @Override
    // public void display() {
    //     System.out.println("Child display");
    // }

    // Ошибка! Неправильное имя метода
    // @Override
    // public void printt() {
    //     System.out.println("Child print");
    // }
}

// 2. @Deprecated - помечает элемент как устаревший
// Компилятор выдает предупреждение при использовании

class OldClass {

    @Deprecated
    public void oldMethod() {
        System.out.println("Этот метод устарел, используйте newMethod()");
    }

    public void newMethod() {
        System.out.println("Новый метод");
    }

    @Deprecated
    public static final int OLD_CONSTANT = 100;
}

// 3. @SuppressWarnings - подавляет предупреждения компилятора

class WarningExample {

    @SuppressWarnings("unchecked")
    public void suppressUnchecked() {
        // Подавляет предупреждение о непроверяемом приведении типа
        java.util.List rawList = new java.util.ArrayList();
        java.util.List<String> stringList = rawList; // unchecked warning suppressed
    }

    @SuppressWarnings({"unchecked", "deprecation"})
    public void suppressMultiple() {
        // Подавляет несколько типов предупреждений
        OldClass obj = new OldClass();
        obj.oldMethod(); // deprecation warning suppressed

        java.util.List raw = new java.util.ArrayList();
        java.util.List<String> strings = raw; // unchecked warning suppressed
    }

    @SuppressWarnings("all")
    public void suppressAll() {
        // Подавляет все предупреждения
        OldClass obj = new OldClass();
        obj.oldMethod();
    }
}

class Main {
    public static void main(String[] args) {
        // Использование @Deprecated
        OldClass obj = new OldClass();
        obj.oldMethod(); // выдает предупреждение при компиляции
        obj.newMethod();

        System.out.println(OldClass.OLD_CONSTANT); // тоже предупреждение

        Child child = new Child();
        child.show();
    }
}

import java.lang.annotation.*;

// Target - указывает, где можно использовать аннотацию
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
// Retention - как долго хранить аннотацию (RUNTIME - доступна в процессе выполнения)
@Retention(RetentionPolicy.RUNTIME)
@interface Version {
    int major();
    int minor();
    String author() default "Unknown";
}

@Version(major = 1, minor = 0, author = "Ivanov")
class MyClass {

    @Version(major = 2, minor = 1, author = "Petrov")
    public void myMethod() {
        System.out.println("My method");
    }

    @Version(major = 1, minor = 0)
    private String name = "test";
}

class Main2 {
    public static void main(String[] args) {
        Class<MyClass> clazz = MyClass.class;
        Version version = clazz.getAnnotation(Version.class);

        if (version != null) {
            System.out.println("Class version: " + version.major() + "." + version.minor());
            System.out.println("Author: " + version.author());
        }
    }
}
>>>>>>> Stashed changes
