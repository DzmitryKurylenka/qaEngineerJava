class Dog extends Animal {
    private static final int runLimit = 500;
    private static final int swimLimit = 10;
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(getName() + " пробежал " + distance + " метров");
        } else {
            System.out.println(getName() + " не может пробежать " + distance + " метров");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println(getName() + " проплыл " + distance + " метров");
        } else {
            System.out.println(getName() + " не может проплыть " + distance + " метров");
        }
    }
}