// Задание 1

public class Main {
    public static void main(String[] args) {

        Dog dogSharik = new Dog("Шарик");
        Cat catVasiliy = new Cat("Василий");
        Cat catGennadiy = new Cat("Геннадий");

        System.out.println();
        System.out.println("-- Задание 1 --");
        System.out.println();

        dogSharik.run(500);
        dogSharik.swim(10);

        catVasiliy.run(100);
        catVasiliy.swim(10);

        catGennadiy.run(201);
        catGennadiy.swim(0);

        System.out.println("Создано животных: " + Animal.getAnimalCount());
        System.out.println("Создано собак: " + Dog.getDogCount());
        System.out.println("Создано котов: " + Cat.getCatCount());

        Bowl bowl = new Bowl(25);
        Cat[] cats = {catVasiliy, catGennadiy};

        for (Cat cat : cats) {
            cat.eat(bowl, 10);
        }

        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сыт: " + cat.isSatiety());
        }

        System.out.println("Еды в миске осталось: " + bowl.getFood());
        System.out.println();

// Задание 2

        Circle circle = new Circle(5);
        circle.setFillColor("Red"); // Установка цвета заливки
        circle.setBorderColor("Black"); // Установка цвета границы

        Rectangle rectangle = new Rectangle(5, 10);
        rectangle.setFillColor("Blue"); // Установка цвета заливки
        rectangle.setBorderColor("Green"); // Установка цвета границы

        Triangle triangle = new Triangle(5, 6, 7);
        triangle.setFillColor("Yellow"); // Установка цвета заливки
        triangle.setBorderColor("Purple"); // Установка цвета границы

        System.out.println("-- Задание 2 --");
        System.out.println();

        System.out.println("Характеристики круга:");
        circle.printCharacteristics();
        System.out.println();

        System.out.println("Характеристики прямоугольника:");
        rectangle.printCharacteristics();
        System.out.println();

        System.out.println("Характеристики треугольника:");
        triangle.printCharacteristics();
    }
}
