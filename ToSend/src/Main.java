<<<<<<< Updated upstream
=======
import java.util.Formatter;

class Main {
    public static void main(String[] args) {
        // 1. %d - десятичное целое
        System.out.printf("1. Число: %d%n", 100);

        // 2. %f - число с плавающей точкой
        System.out.printf("2. PI: %.2f%n", 3.14159);

        // 3. %s - строка
        System.out.printf("3. Привет, %s!%n", "Мир");

        // 4. %b - логическое значение
        System.out.printf("4. Результат: %b%n", (10 > 5));

        // 5. %n - новая строка
        System.out.printf("5. Первая строка%nВторая строка%n");

        // Дополнительно: %% - знак процента
        System.out.printf("Скидка 50%%%n");

        // Использование Formatter
        Formatter formatter = new Formatter();
        formatter.format("Имя: %s, Возраст: %d", "Иван", 25);
        System.out.println("Formatter: " + formatter);
        formatter.close();
    }
}

import java.io.*;

class Main {
    public static void main(String[] args) {
        // flush() - принудительно записывает данные из буфера в выходной поток

        // Пример 1: с PrintStream
        System.out.print("Текст без flush");
        System.out.flush(); // принудительный вывод

        // Пример 2: с FileWriter
        try (FileWriter fw = new FileWriter("test.txt")) {
            fw.write("Привет мир");
            fw.flush(); // данные записываются в файл сразу
            System.out.println("Данные записаны");
        } catch (IOException e) {
            System.out.println("Ошибка");
        }

        // Пример 3: с Formatter
        try (Formatter fmt = new Formatter(new FileWriter("log.txt"))) {
            fmt.format("Лог: %s", "Запуск программы");
            fmt.flush(); // принудительная запись
            System.out.println("Лог сохранен");
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
    }
}
При записи данных в файл или поток данные сначала накапливаются в буфере, а потом записываются. flush() заставляет записать все накопленные данные немедленно, не дожидаясь заполнения буфера.

        import java.util.Date;
import java.util.Calendar;

class Main {
    public static void main(String[] args) {
        Date now = new Date();
        Calendar cal = Calendar.getInstance();

        // 1. %tH - час (00-23)
        System.out.printf("1. Час (24-часовой): %tH%n", now);

        // 2. %tM - минуты
        System.out.printf("2. Минуты: %tM%n", now);

        // 3. %tS - секунды
        System.out.printf("3. Секунды: %tS%n", now);

        // 4. %tY - год (4 цифры)
        System.out.printf("4. Год: %tY%n", now);

        // 5. %tB - полное название месяца
        System.out.printf("5. Месяц: %tB%n", now);

        // Дополнительные примеры
        System.out.printf("6. Полная дата: %tA, %td %tB %tY%n", now, now, now, now);
        System.out.printf("7. Время: %tH:%tM:%tS%n", now, now, now);

        // Форматирование с Calendar
        System.out.printf("8. Час (12-часовой): %tI%n", cal);
        System.out.printf("9. День недели: %tA%n", cal);
        System.out.printf("10. Месяц (цифра): %tm%n", cal);
    }
}
>>>>>>> Stashed changes
