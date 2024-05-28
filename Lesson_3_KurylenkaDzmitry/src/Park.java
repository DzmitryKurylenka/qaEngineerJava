/*
3. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию
об аттракционах, времени их работы и стоимости.
 */

public class Park {
    private String name;
    private Attraction[] attractions;

    public Park(String name, int numberOfAttractions) {
        this.name = name;
        this.attractions = new Attraction[numberOfAttractions];
    }

    public class Attraction {
        private String attractionName;
        private String workingHours;
        private int price;

        public Attraction(String attractionName, String workingHours, int price) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void displayInfo() {
            System.out.println("Аттракцион: " + attractionName);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price);
        }
    }

    public void addAttraction(int index, String name, String hours, int price) {
        if (index >= 0 && index < attractions.length) {
            attractions[index] = new Attraction(name, hours, price);
        }
    }

    public void displayAttractions() {
        for (Attraction attraction : attractions) {
            if (attraction != null) {
                attraction.displayInfo();
            }
        }
    }
}
