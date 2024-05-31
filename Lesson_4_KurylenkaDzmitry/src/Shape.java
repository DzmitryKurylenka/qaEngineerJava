interface Shape { // Интерфейс Shape для определения базовых методов геометрических фигур

    double getPerimeter();

    double getArea();

    void setFillColor(String color);

    void setBorderColor(String color);

    String getFillColor();

    String getBorderColor();

    default void printCharacteristics() {
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Площадь: " + getArea());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
    }
}
