package core.mate.academy.model;

public class Excavator extends Machine {
    private final int maxWorkingHours;

    public Excavator(String model, String color, int maxWorkingHours) {
        super(model, color);
        this.maxWorkingHours = maxWorkingHours;
    }

    public int getMaxWorkingHours() {
        return maxWorkingHours;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
