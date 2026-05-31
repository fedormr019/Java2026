<<<<<<< Updated upstream
=======
// Собственное исключение для недостаточного баланса
class InsufficientBalanceException extends Exception {

    // 1. Конструктор без параметров
    public InsufficientBalanceException() {
        super("Недостаточно средств на счете");
    }

    // 2. Конструктор с сообщением
    public InsufficientBalanceException(String message) {
        super(message);
    }

    // 3. Конструктор с сообщением и причиной
    public InsufficientBalanceException(String message, Throwable cause) {
        super(message, cause);
    }
}

// Собственное исключение для неверного возраста
class InvalidAgeException extends Exception {

    public InvalidAgeException() {
        super("Недопустимый возраст");
    }

    public InvalidAgeException(String message) {
        super(message);
    }

    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}

// Собственное исключение для пустого поля
class EmptyFieldException extends Exception {

    public EmptyFieldException() {
        super("Поле не может быть пустым");
    }

    public EmptyFieldException(String fieldName) {
        super("Поле '" + fieldName + "' не может быть пустым");
    }

    public EmptyFieldException(String message, Throwable cause) {
        super(message, cause);
    }
}

// Использование собственных исключений
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new InsufficientBalanceException("Сумма снятия должна быть положительной");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Запрошено: " + amount + ", доступно: " + balance);
        }
        balance -= amount;
        System.out.println("Снято: " + amount + ", остаток: " + balance);
    }
}

class User {
    private String name;
    private int age;

    public void setName(String name) throws EmptyFieldException {
        if (name == null || name.trim().isEmpty()) {
            throw new EmptyFieldException("name");
        }
        this.name = name;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Возраст должен быть от 0 до 150, передано: " + age);
        }
        this.age = age;
    }
}

class Main {
    public static void main(String[] args) {
        // Тестирование InsufficientBalanceException
        BankAccount account = new BankAccount(100);
        try {
            account.withdraw(200);
        } catch (InsufficientBalanceException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Тестирование EmptyFieldException
        User user = new User();
        try {
            user.setName("");
        } catch (EmptyFieldException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Тестирование InvalidAgeException
        try {
            user.setAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
>>>>>>> Stashed changes
