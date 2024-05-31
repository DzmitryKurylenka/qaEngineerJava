class Animal {
    private String name;
    private static int animalCount = 0; // Счетчик всех животных

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }
    public String getName() {
        return name;
    }
    public static int getAnimalCount() {
        return animalCount;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " метров");
    }

    public void swim(int distance) {
        System.out.println(name + " пробежал " + distance + " метров");
    }
}