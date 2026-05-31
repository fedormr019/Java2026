<<<<<<< Updated upstream
=======
import java.util.Objects;

class Person {
    private String name;
    private int age;
    private String passportId;

    public Person(String name, int age, String passportId) {
        this.name = name;
        this.age = age;
        this.passportId = passportId;
    }

    @Override
    public boolean equals(Object obj) {
        // 1. Проверка на идентичность ссылок
        if (this == obj) {
            return true;
        }

        // 2. Проверка на null
        if (obj == null) {
            return false;
        }

        // 3. Проверка на совпадение классов
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        // 4. Приведение типа
        Person other = (Person) obj;

        // 5. Сравнение значимых полей
        return age == other.age &&
                Objects.equals(name, other.name) &&
                Objects.equals(passportId, other.passportId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, passportId);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Иван", 25, "1234");
        Person p2 = new Person("Иван", 25, "1234");
        Person p3 = new Person("Петр", 30, "5678");

        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.equals(p3)); // false
        System.out.println(p1.equals(null)); // false
        System.out.println(p1.equals(p1)); // true
    }
}
>>>>>>> Stashed changes
