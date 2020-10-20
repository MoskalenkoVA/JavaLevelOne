package Lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] emplArray = new Employee[5]; // Вначале объявляем массив объектов
        emplArray[0] = new Employee("Серёжа", "Manager", "cergei@mail.ru", 880020060, 20000, 33);
        emplArray[1] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30000, 30); // потом для каждой ячейки массива задаем объект
        emplArray[2] = new Employee("Пупкин Иван Иванович", "Director", "pupkin@mail.ru", 8800200, 1000000, 42);
        emplArray[3] = new Employee("Андрей Иванович", "Architect", "arhitector@mail.ru", 1234567890, 50000, 40);
        emplArray[4] = new Employee("Марья Васильевна", "CleanManager", "сleanManager@mail.ru", 555555, 25000, 51);

        for (int i = 0; i < emplArray.length; i++) {
            if (emplArray[i].GetAge() > 40) {
                emplArray[i].info();
            }
        }
//            emplArray[].info(); вызов инфо
    }
}

class Employee {
    private String full_name;
    private String position;
    private String email;
    private long phone;
    private int salary;
    private int age;

    public int GetAge () {
        return age;
    }

    public Employee(String full_name, String position, String email, long phone, int salary, int age) {
        this.full_name = full_name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("Ф.И.О. - " + full_name + "; Должность - " + position + "; Почта - " + email + "; Телефон - " + phone + "; Зарплата" + salary + "; Возвраст - " + age);
    }

}


