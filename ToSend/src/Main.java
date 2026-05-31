<<<<<<< Updated upstream
=======
class Main {
    public static void main(String[] args) {
        String str = "Hello Java World";

        // 1. length() - возвращает длину строки
        System.out.println("1. length(): " + str.length());

        // 2. charAt() - возвращает символ по индексу
        System.out.println("2. charAt(0): " + str.charAt(0));

        // 3. substring() - возвращает подстроку
        System.out.println("3. substring(6,10): " + str.substring(6, 10));

        // 4. toLowerCase() - преобразует в нижний регистр
        System.out.println("4. toLowerCase(): " + str.toLowerCase());

        // 5. toUpperCase() - преобразует в верхний регистр
        System.out.println("5. toUpperCase(): " + str.toUpperCase());

        // 6. contains() - проверяет наличие подстроки
        System.out.println("6. contains(\"Java\"): " + str.contains("Java"));

        // 7. replace() - заменяет символы
        System.out.println("7. replace('o', '0'): " + str.replace('o', '0'));

        // 8. split() - разбивает строку на массив
        String[] words = str.split(" ");
        System.out.println("8. split(): " + words[0] + " | " + words[1] + " | " + words[2]);

        // 9. indexOf() - ищет индекс первого вхождения
        System.out.println("9. indexOf(\"Java\"): " + str.indexOf("Java"));

        // 10. isEmpty() - проверяет пустая ли строка
        String empty = "";
        System.out.println("10. isEmpty(): " + empty.isEmpty());
        System.out.println("    str.isEmpty(): " + str.isEmpty());
    }
}

import java.util.StringJoiner;

class Main {
    public static void main(String[] args) {
        // Пример 1: базовое использование
        StringJoiner joiner1 = new StringJoiner(", ");
        joiner1.add("Яблоко");
        joiner1.add("Банан");
        joiner1.add("Апельсин");
        System.out.println("Пример 1: " + joiner1);

        // Пример 2: с префиксом и суффиксом
        StringJoiner joiner2 = new StringJoiner(", ", "[", "]");
        joiner2.add("Красный");
        joiner2.add("Синий");
        joiner2.add("Зеленый");
        System.out.println("Пример 2: " + joiner2);

        // Пример 3: объединение двух StringJoiner
        StringJoiner joiner3 = new StringJoiner(", ");
        joiner3.add("Понедельник");
        joiner3.add("Вторник");

        StringJoiner joiner4 = new StringJoiner(", ");
        joiner4.add("Среда");
        joiner4.add("Четверг");
        joiner4.add("Пятница");

        joiner3.merge(joiner4);
        System.out.println("Пример 3 (merge): " + joiner3);

        // Пример 4: обработка пустых значений
        StringJoiner joiner5 = new StringJoiner(" | ", "(", ")");
        joiner5.add("Один");
        joiner5.add("");
        joiner5.add("Три");
        System.out.println("Пример 4: " + joiner5);

        // Пример 5: String.join() - альтернативный способ
        String joined = String.join("-", "2024", "12", "25");
        System.out.println("Пример 5 (String.join): " + joined);
    }
}

class Main {
    public static void main(String[] args) {
        // Три двойные кавычки """ """ - это текстовая блок-строка (Text Block)
        // Появились в Java 15

        // Без текстовых блоков (старый способ)
        String oldWay = "Строка 1\n" +
                "Строка 2\n" +
                "Строка 3";

        // С текстовыми блоками (новый способ)
        String textBlock = """
                           Строка 1
                           Строка 2
                           Строка 3
                           """;

        System.out.println("Текстовый блок:");
        System.out.println(textBlock);

        // Пример 1: HTML код
        String html = """
                      <html>
                          <body>
                              <h1>Заголовок</h1>
                              <p>Текст параграфа</p>
                          </body>
                      </html>
                      """;
        System.out.println("HTML:");
        System.out.println(html);

        // Пример 2: SQL запрос
        String sql = """
                     SELECT id, name, age
                     FROM users
                     WHERE age > 18
                     ORDER BY name
                     """;
        System.out.println("SQL:");
        System.out.println(sql);

        // Пример 3: JSON
        String json = """
                      {
                          "name": "Иван",
                          "age": 30,
                          "city": "Москва"
                      }
                      """;
        System.out.println("JSON:");
        System.out.println(json);
    }
}
>>>>>>> Stashed changes
