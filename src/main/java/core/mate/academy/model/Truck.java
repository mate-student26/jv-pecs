package core.mate.academy.model;

public class Truck extends Machine {
    private final int maxCapacity;

    public Truck(String model, String color, int maxCapacity) {
        super(model, color);
        this.maxCapacity = maxCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
