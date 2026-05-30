<<<<<<< Updated upstream
=======
class Main {
    public static void main(String[] args) {
        // 1. int
        int value1 = 1;
        switch(value1) {
            case 1: System.out.println("int"); break;
            default: break;
        }

        // 2. byte
        byte value2 = 2;
        switch(value2) {
            case 2: System.out.println("byte"); break;
            default: break;
        }

        // 3. short
        short value3 = 3;
        switch(value3) {
            case 3: System.out.println("short"); break;
            default: break;
        }

        // 4. char
        char value4 = 'A';
        switch(value4) {
            case 'A': System.out.println("char"); break;
            default: break;
        }

        // 5. String (начиная с Java 7)
        String value5 = "hello";
        switch(value5) {
            case "hello": System.out.println("String"); break;
            default: break;
        }

        // 6. enum
        enum Color { RED, GREEN }
        Color value6 = Color.RED;
        switch(value6) {
            case RED: System.out.println("enum"); break;
            default: break;
        }
    }
}

class Main {
    public static void main(String[] args) {
        int i = 0;
        int value = 2;

        switch(value) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
            case 3:
                i = 3;
                break;
        }

        System.out.println(i); // Результат: 3

        // при value = 2 выполняется case 2,
        // но так как нет break, программа "проваливается" в case 3,
        // перезаписывая i значением 3
    }
}
>>>>>>> Stashed changes
