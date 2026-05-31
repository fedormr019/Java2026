<<<<<<< Updated upstream
=======
class Outer {

    // public - доступен везде
    public class PublicInner {
        public void show() {
            System.out.println("PublicInner");
        }
    }

    // private - доступен только внутри Outer
    private class PrivateInner {
        public void show() {
            System.out.println("PrivateInner");
        }
    }

    // protected - доступен в пакете и подклассам
    protected class ProtectedInner {
        public void show() {
            System.out.println("ProtectedInner");
        }
    }

    // default - доступен только в пакете
    class DefaultInner {
        public void show() {
            System.out.println("DefaultInner");
        }
    }

    public void test() {
        // из внешнего класса доступны все внутренние
        PublicInner p = new PublicInner();
        PrivateInner pr = new PrivateInner();
        ProtectedInner prot = new ProtectedInner();
        DefaultInner d = new DefaultInner();

        p.show();
        pr.show();
        prot.show();
        d.show();
    }
}

class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();

        // public - доступен
        Outer.PublicInner publicInner = outer.new PublicInner();
        publicInner.show();

        // private - НЕ доступен из другого класса
        // Outer.PrivateInner privateInner = outer.new PrivateInner(); // ошибка

        // protected - доступен (в том же пакете)
        Outer.ProtectedInner protectedInner = outer.new ProtectedInner();
        protectedInner.show();

        // default - доступен (в том же пакете)
        Outer.DefaultInner defaultInner = outer.new DefaultInner();
        defaultInner.show();
    }
}

class Outer {
    private String privateField = "Приватное поле";
    public String publicField = "Публичное поле";
    protected String protectedField = "Защищенное поле";
    String defaultField = "Поле по умолчанию";

    private void privateMethod() {
        System.out.println("Приватный метод");
    }

    public void publicMethod() {
        System.out.println("Публичный метод");
    }

    class Inner {
        public void accessOuter() {
            // Внутренний класс имеет доступ ко ВСЕМ полям и методам внешнего класса
            // независимо от спецификаторов доступа
            System.out.println(privateField);
            System.out.println(publicField);
            System.out.println(protectedField);
            System.out.println(defaultField);

            privateMethod();
            publicMethod();
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        inner.accessOuter();
    }
}

class Outer {

    class Inner {
        private String innerPrivate = "Приватное поле inner";
        public String innerPublic = "Публичное поле inner";
        protected String innerProtected = "Защищенное поле inner";
        String innerDefault = "Поле inner по умолчанию";

        private void innerPrivateMethod() {
            System.out.println("Приватный метод inner");
        }

        public void innerPublicMethod() {
            System.out.println("Публичный метод inner");
        }
    }

    public void accessInner() {
        Inner inner = new Inner();

        // Внешний класс имеет доступ к ЛЮБЫМ полям и методам внутреннего класса
        // спецификаторы доступа НЕ ограничивают доступ
        System.out.println(inner.innerPrivate);
        System.out.println(inner.innerPublic);
        System.out.println(inner.innerProtected);
        System.out.println(inner.innerDefault);

        inner.innerPrivateMethod();
        inner.innerPublicMethod();
    }
}

class AnotherClass {
    public void tryAccess() {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        // из другого класса спецификаторы работают
        // System.out.println(inner.innerPrivate); // ошибка
        System.out.println(inner.innerPublic);     // работает
        // System.out.println(inner.innerProtected); // ошибка (разный пакет)
        // System.out.println(inner.innerDefault);   // ошибка (разный пакет)
    }
}
>>>>>>> Stashed changes
