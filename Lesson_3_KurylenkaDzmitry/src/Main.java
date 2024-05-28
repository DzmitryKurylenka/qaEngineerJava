/*
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
2. Создать массив из 5 сотрудников.
 */

public class Main {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Иванов Иван", "Директор", "ivivan@mail.com", "+555222", 5000, 40);
        employeesArray[1] = new Employee("Петров Петр", "Аналитик", "petrov@mail.com", "+666333", 2000, 30);
        employeesArray[2] = new Employee("Сидоров Максим", "Рководитель", "sidorov@mail.com", "+444111", 3000, 45);
        employeesArray[3] = new Employee("Потапов Андрей", "Бухгалтер", "potapov@mail.com", "+777555", 2000, 40);
        employeesArray[4] = new Employee("Гончаров Николай", "Экономист", "goncharov@mail.com", "+999000", 2000, 35);

        for (Employee emp : employeesArray) {
            emp.informationAboutEmployee();
        }
    }
}
*/

/*
3. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию
об аттракционах, времени их работы и стоимости.
 */

public class Main {
    public static void main(String[] args) {
        Park gorkyPark = new Park("Парк Горького", 2);
        gorkyPark.addAttraction(0, "Колесо обозрения", "10:00 - 20:00", 50);
        gorkyPark.addAttraction(1, "Американские горки", "10:00 - 20:00", 30);

        gorkyPark.displayAttractions();
    }
}
