<<<<<<< Updated upstream
=======
// Пример 1: Вложенный класс в интерфейсе
interface Drawable {

    void draw();

    // Вложенный статический класс внутри интерфейса
    class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void display() {
            System.out.println("Точка: (" + x + ", " + y + ")");
        }

        public static String getType() {
            return "2D точка";
        }
    }
}

// Пример 2: Интерфейс с несколькими вложенными классами
interface Calculator {

    int calculate(int a, int b);

    // Вложенный класс для операций
    class Operations {
        public static int add(int a, int b) {
            return a + b;
        }

        public static int subtract(int a, int b) {
            return a - b;
        }

        public void showInfo() {
            System.out.println("Калькулятор операций");
        }
    }

    // Вложенный класс для констант
    class Constants {
        public static final double PI = 3.14159;
        public static final double E = 2.71828;

        public void printConstants() {
            System.out.println("PI = " + PI);
            System.out.println("E = " + E);
        }
    }
}

// Пример 3: Вложенный класс для создания объекта интерфейса (адаптер)
interface EventListener {
    void onClick();

    class EmptyAdapter implements EventListener {
        @Override
        public void onClick() {
            // пустая реализация по умолчанию
            System.out.println("Пустая реализация");
        }
    }
}

class Main {
    public static void main(String[] args) {
        // Способ 1: создание объекта вложенного класса
        Drawable.Point point = new Drawable.Point(10, 20);
        point.display();

        // Способ 2: вызов статического метода вложенного класса
        String type = Drawable.Point.getType();
        System.out.println(type);

        // Способ 3: создание объекта другого вложенного класса
        Calculator.Operations ops = new Calculator.Operations();
        ops.showInfo();

        // Способ 4: вызов статических методов
        System.out.println("10 + 5 = " + Calculator.Operations.add(10, 5));
        System.out.println("10 - 5 = " + Calculator.Operations.subtract(10, 5));

        // Способ 5: работа с константами
        Calculator.Constants constants = new Calculator.Constants();
        constants.printConstants();
        System.out.println("PI = " + Calculator.Constants.PI);

        // Способ 6: использование класса-адаптера
        EventListener listener = new EventListener.EmptyAdapter();
        listener.onClick();
    }
}
>>>>>>> Stashed changes
