//Создать класс Сотрудник (Employee).
//        У класса должны быть следующие поля:
//        1. Возраст (int)
//        2. Имя (String)
//        3. Фамилия (String)
//        4. Зарплата (double)
//        5. ... можно придумать свои поля
//
//        У класса должно быть 2 конструктора:
//        1. Конструктор, который принимает все аргументы
//        2. Констуктор, который принимает все аргументы КРОМЕ зарплаты; значение зарплаты должно быть задано значением по умолчанию (50.0)
//
//        Переопределить:
//        1. Методы equals и hashCode (поля, которые должны там участвовать, нужно определить самостоятельно)
//        2. Метод toString (в любом формате)
//
//        Реализовать методы:
//        String getFullName() - возвращает полное имя сотрудника
//        boolean olderThan(Employee e) - возвращает true, если текущий сотрудник старше чем тот, который передали в метод.
//        void upgrade(double salary) - повышает зарплату сотрудника НА salary единиц. Пример: Было 50.0, upgrade(20.0) -> стало 70.0
import java.util.Objects;
public class Employee {
    int id;
    int age;
    String name;
    String surname;
    double salary;
    {
        salary = 5000.90;
    }

    public Employee() {
        // Инициализация объекта, который является экземпляром класса Employee, со значением полей по умолчанию
    }
    public Employee(int id, int age, String name, String surname) {
        // Инициализация объекта, который является экземпляром класса Employee, с 4-мя аргументами.
        // 5-ое поле(salary) этого экземпляра является значением по умолчанию определённым в классе Employee
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("id: %d, age: %d, name: %s, surname: %s, salary: %.2f", id, age, name, surname, salary);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee employee) {
            return salary == employee.salary;
        }
        return false;
    }

    @Override
    public int hashCode() { return Objects.hash(id, surname); }

    public String getFullName() {
        return String.format("Полное имя сотрудника: %s %s", name, surname);
    }

    boolean olderThan(Employee e) {
        if (age > e.age) {
            return true;
        } else {
            return false;
        }
    }

    void upgrade(double salary) {
        this.salary = this.salary + salary;
    }
}

