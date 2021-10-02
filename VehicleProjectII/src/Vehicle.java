abstract class Vehicle implements Maintainable {
    private String name;
    private int max_speed;

    public Vehicle(String _name, int _max_speed) {
        setName(_name);
        setMaxSpeed(_max_speed);
    }

    abstract float runningCost(int hours_of_operation);

    public String getName() {
        return name;
    }
    public void setName(String _name) {
        name = _name;
    }

    public int getMaxSpeed() {
        return max_speed;
    }
    public void setMaxSpeed(int _max_speed) {
        max_speed = _max_speed;
    }

    public String toString() {
        return "name: "+this.name+", max speed: "+this.max_speed;
    }
}
