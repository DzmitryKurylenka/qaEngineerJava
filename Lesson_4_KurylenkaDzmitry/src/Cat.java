
class Cat extends Animal {
    private static final int runLimit = 200;
    private static int catCount = 0;
    private boolean satiety;

    public Cat(String name) {
        super(name);
        this.satiety = false;
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
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
        if (distance == 0) {
            System.out.println(getName() + " не нужно плыть");
        } else {
            System.out.println(getName() + " не умеет плавать");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Bowl bowl, int foodAmount) {
        if (bowl.decreaseFood(foodAmount)) {
            this.satiety = true;
            System.out.println(getName() + " покушал и сыт");
        } else {
            System.out.println(getName() + " не хватает еды в миске");
        }
    }
}