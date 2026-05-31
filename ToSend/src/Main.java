<<<<<<< Updated upstream
=======
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Способ 1: чтение файла через File объект
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);

            // Чтение всего файла построчно
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }

        // Способ 2: чтение разных типов данных из файла
        try {
            Scanner scanner = new Scanner(new File("data.txt"));

            // Чтение целого числа
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                System.out.println("Число: " + number);
            }

            // Чтение строки
            if (scanner.hasNext()) {
                String word = scanner.next();
                System.out.println("Слово: " + word);
            }

            // Чтение double
            if (scanner.hasNextDouble()) {
                double d = scanner.nextDouble();
                System.out.println("Double: " + d);
            }

            // Чтение всей строки с пробелами
            scanner.nextLine(); // очистка буфера
            if (scanner.hasNextLine()) {
                String fullLine = scanner.nextLine();
                System.out.println("Строка: " + fullLine);
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Способ 3: чтение файла с указанием кодировки
        try {
            Scanner scanner = new Scanner(new File("text.txt"), "UTF-8");

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        // Способ 4: использование try-with-resources (автозакрытие)
        try (Scanner scanner = new Scanner(new File("test.txt"))) {
            StringBuilder content = new StringBuilder();
            while (scanner.hasNextLine()) {
                content.append(scanner.nextLine()).append("\n");
            }
            System.out.println("Содержимое файла:\n" + content);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
>>>>>>> Stashed changes
