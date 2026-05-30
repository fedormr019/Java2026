<<<<<<< Updated upstream
=======
class Main {
    public static void main(String[] args) {
        // Бесконечный while
        while (true) {
            System.out.println("Бесконечный while");
        }

        // Бесконечный do-while
        do {
            System.out.println("Бесконечный do-while");
        } while (true);
    }
}

class Main {
    public static void main(String[] args) {
        // break и continue в цикле for
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                continue; // пропускаем 3
            }
            if (i == 7) {
                break; // выходим на 7
            }
            System.out.print(i + " "); // 1 2 4 5 6
        }

        System.out.println();
    }
}
>>>>>>> Stashed changes
