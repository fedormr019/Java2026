// Без спецификатора - доступен только внутри пакета (package-private)
interface Interface {
    void method();
}
// Доступен только классам в том же пакете
// Классы из других пакетов не могут реализовать этот интерфейс


// public - доступен везде (из любого пакета)
public interface Interface {
    void method();
}
// Доступен любому классу в любом пакете
// Может быть реализован любым классом в любом пакете


// protected НЕ может быть использован для интерфейса верхнего уровня
// Ошибка компиляции: illegal modifier for the interface
protected interface Interface {
    void method();
}
// protected допустим только для вложенных интерфейсов (внутри класса)


// private НЕ может быть использован для интерфейса верхнего уровня
// Ошибка компиляции: illegal modifier for the interface
private interface Interface {
    void method();
}
// private допустим только для вложенных интерфейсов (внутри класса)