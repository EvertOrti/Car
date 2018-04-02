package ee.khk.ikt;

public class Car {
    private boolean engine;
    private String name;
    private int cylinder;
    private int maxSpeed;

    public Car(boolean engine; String name; int cylinder, int maxSpeed) {
        this.engine = engine;
        this.name = name;
        this.cylinder = cylinder;
        this.maxSpeed = maxSpeed;
    }

public String getName()    {
        return name;
}

public void setName() {
        this.name=name;
}

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


}
