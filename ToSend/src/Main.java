<<<<<<< Updated upstream
=======
import java.io.FileInputStream;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        // Чтение файла через FileInputStream
        try (FileInputStream fis = new FileInputStream("test.txt")) {
            int data;
            // read() - читает один байт (0-255) или -1 если конец файла
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

import java.io.FileOutputStream;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        String text = "Hello World";

        // Запись в файл через FileOutputStream
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            for (char c : text.toCharArray()) {
                // write(int) - записывает один байт (младшие 8 бит)
                fos.write((int) c);
            }
            System.out.println("Данные записаны");
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

import java.io.*;

class Main {
    public static void main(String[] args) {
        // InputStream/OutputStream - работают с БАЙТАМИ
        // Reader/Writer - работают с СИМВОЛАМИ (поддерживают Unicode)

        // Байтовые потоки (читают байты)
        try (FileInputStream fis = new FileInputStream("test.txt")) {
            int b = fis.read(); // читает байт (0-255)
            System.out.println("Байт: " + b);
        } catch (IOException e) {}

        // Символьные потоки (читают символы)
        try (FileReader fr = new FileReader("test.txt")) {
            int c = fr.read(); // читает символ (0-65535)
            System.out.println("Символ: " + (char) c);
        } catch (IOException e) {}
    }
}

import java.io.*;

// AutoCloseable - позволяет автоматически закрывать ресурсы через try-with-resources

class Main {
    public static void main(String[] args) {

        // Без AutoCloseable (старый способ)
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("test.txt");
            int data = fis.read();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close(); // нужно явно закрывать
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // С AutoCloseable (новый способ)
        // Ресурс закроется автоматически
        try (FileInputStream fis2 = new FileInputStream("test.txt")) {
            int data = fis2.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // fis2 автоматически закрыт

        // Создание своего AutoCloseable ресурса
        try (MyResource res = new MyResource()) {
            res.doSomething();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

class MyResource implements AutoCloseable {

    public void doSomething() {
        System.out.println("Выполнение операции с ресурсом");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Ресурс автоматически закрыт");
    }
}
>>>>>>> Stashed changes
