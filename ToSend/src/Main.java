<<<<<<< Updated upstream
=======
byte byteVar = 127;
short shortVar = 32000;
int intVar = 1000000;
long longVar = 9000000000L;
float floatVar = 3.14f;
double doubleVar = 3.1415926535;
char charVar = 'A';
boolean boolVar = true;

public class Main {
    public static void main(String[] args) {
        System.out.println("\u0424\u0435\u0434\u043E\u0440");
    }
}

Ошибка компиляции. b недоступна за пределами {}

String text = "Результат: ";
int number = 10;
double pi = 3.14;
String result = text + number + " и " + pi;
System.out.println(result);

byte b = 10;
int i = 20;
int result1 = b + i; // byte расширяется до int, результат int
int x = 5;
double y = 2.5;
double result2 = x + y; // int расширяется до double, результат double
short s = 100;
long l = 1000L;
long result3 = s + l; // short расширяется до long, результат long

double d = 123.456;
int i = (int) d;        // 123

long l = 10000000000L;
int smallInt = (int) l; // возможна потеря данных
int bigInt = 300;
byte b = (byte) bigInt; // 44 (потеря старших битов)
float f = 5.99f;
int intFromFloat = (int) f; // 5(отбрасывается дробная часть)

int a = 120;
byte b = a + 10;    // Ошибка компиляции: int не может быть преобразован в byte
byte c = (byte)(a + 10); // 130, но в byte помещается -126 (из-за переполнения)
byte d = a + 1;     // Ошибка компиляции: int не может быть преобразован в byte

var name = "Федор";        // выводится String
var age = 20;             // выводится int
var pi = 3.1415;         // выводится double
var list = new ArrayList<String>(); // выводится ArrayList<String>
var result = name + " " + age; // выводится String
>>>>>>> Stashed changes
