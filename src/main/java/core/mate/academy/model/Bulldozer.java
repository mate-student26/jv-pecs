package core.mate.academy.model;

public class Bulldozer extends Machine {
    private final int height;

    public Bulldozer(String model, String color, int height) {
        super(model, color);
        this.height = height;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
