class Vehicle {
    private String name;
    private int max_speed;

    public Vehicle(String _name, int _max_speed) {
        setName(_name);
        setMaxSpeed(_max_speed);
    }

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
}
