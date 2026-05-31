<<<<<<< Updated upstream
=======
class Main {
    public static void main(String[] args) {
        // Используем StringBuilder (аналогично для StringBuffer)
        StringBuilder sb = new StringBuilder();

        // 1. append() - добавляет строку в конец
        sb.append("Hello");
        System.out.println("1. append: " + sb);

        // 2. insert() - вставляет строку в указанную позицию
        sb.insert(5, " World");
        System.out.println("2. insert: " + sb);

        // 3. replace() - заменяет часть строки
        sb.replace(6, 11, "Java");
        System.out.println("3. replace: " + sb);

        // 4. delete() - удаляет часть строки
        sb.delete(4, 6);
        System.out.println("4. delete: " + sb);

        // 5. reverse() - переворачивает строку
        sb.reverse();
        System.out.println("5. reverse: " + sb);

        // 6. length() - возвращает длину
        sb.reverse(); // возвращаем обратно
        System.out.println("6. length: " + sb.length());

        // 7. charAt() - возвращает символ по индексу
        System.out.println("7. charAt(0): " + sb.charAt(0));

        // 8. setCharAt() - заменяет символ по индексу
        sb.setCharAt(0, 'h');
        System.out.println("8. setCharAt: " + sb);

        // 9. substring() - возвращает подстроку
        String sub = sb.substring(0, 5);
        System.out.println("9. substring: " + sub);

        // 10. capacity() - возвращает текущую вместимость
        System.out.println("10. capacity: " + sb.capacity());

        // Дополнительные методы:
        // 11. indexOf() - поиск подстроки
        System.out.println("11. indexOf('Java'): " + sb.indexOf("Java"));

        // 12. deleteCharAt() - удаляет символ по индексу
        sb.deleteCharAt(0);
        System.out.println("12. deleteCharAt: " + sb);

        // 13. setLength() - устанавливает новую длину
        sb.setLength(4);
        System.out.println("13. setLength(4): " + sb);
    }
}

class Main {
    public static void main(String[] args) {

        // 1. String -> StringBuilder
        String str = "Hello World";
        StringBuilder sb = new StringBuilder(str);
        System.out.println("String -> StringBuilder: " + sb);

        // 2. String -> StringBuffer
        String str2 = "Hello Java";
        StringBuffer sbf = new StringBuffer(str2);
        System.out.println("String -> StringBuffer: " + sbf);

        // 3. StringBuilder -> String
        StringBuilder sb2 = new StringBuilder("Hello from StringBuilder");
        String str3 = sb2.toString();
        System.out.println("StringBuilder -> String: " + str3);

        // 4. StringBuffer -> String
        StringBuffer sbf2 = new StringBuffer("Hello from StringBuffer");
        String str4 = sbf2.toString();
        System.out.println("StringBuffer -> String: " + str4);

        // 5. StringBuilder -> StringBuffer
        StringBuilder sb3 = new StringBuilder("Convert to StringBuffer");
        StringBuffer sbf3 = new StringBuffer(sb3.toString());
        System.out.println("StringBuilder -> StringBuffer: " + sbf3);

        // 6. StringBuffer -> StringBuilder
        StringBuffer sbf4 = new StringBuffer("Convert to StringBuilder");
        StringBuilder sb4 = new StringBuilder(sbf4.toString());
        System.out.println("StringBuffer -> StringBuilder: " + sb4);

        // 7. Использование конструктора String(StringBuilder)
        StringBuilder sb5 = new StringBuilder("Direct conversion");
        String str5 = new String(sb5);
        System.out.println("String(StringBuilder): " + str5);

        // 8. Использование метода append() для конвертации
        StringBuilder sb6 = new StringBuilder();
        sb6.append("String to ");
        sb6.append(new StringBuffer("StringBuffer"));
        System.out.println("Append conversion: " + sb6);
    }
}
>>>>>>> Stashed changes
