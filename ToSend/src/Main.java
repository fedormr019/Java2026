<<<<<<< Updated upstream
=======
public class App {
    final static int START_COUNTER;
    static {
        START_COUNTER = Integer.parseInt("Y-");
    }
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}


Exception in thread "main" java.lang.NumberFormatException: For input string: "Y-"
at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
at java.base/java.lang.Integer.parseInt(Integer.java:668)
at java.base/java.lang.Integer.parseInt(Integer.java:786)
at App.<clinit>(App.java:4)

Статический блок static {} выполняется при загрузке класса ДО вызова метода main
В статическом блоке происходит попытка преобразовать строку "Y-" в число через Integer.parseInt()
Строка "Y-" не может быть преобразована в целое число, так как содержит букву
Возникает исключение NumberFormatException
Исключение не перехвачено, поэтому загрузка класса прерывается
Метод main даже не начинает выполняться, поэтому "Hello" не выводится
Программа завершается аварийно с ошибкой
>>>>>>> Stashed changes
