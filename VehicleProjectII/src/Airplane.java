public class Airplane extends Vehicle {
    private int number_of_engines;
    private float cost_per_engines_per_hour = 150f; // Project specifications is ambiguous on if this should be final or not.

    public Airplane(String _name, int _max_speed, int _number_of_engines, float cost_per_engines_per_hour) {
        super(_name, _max_speed);
        setNumEngines(_number_of_engines);
        this.cost_per_engines_per_hour = cost_per_engines_per_hour;
    }

    public int getNumEngines() {
        return number_of_engines;
    }
    public void setNumEngines(int _number_of_engines) {
        number_of_engines = _number_of_engines;
    }

    public float runningCost(int hours_of_operation) {
        return hours_of_operation * cost_per_engines_per_hour;
    }

    public float maintenanceCost (float cost_per_unit) {
        return cost_per_unit * number_of_engines;
    }

    public String toString() {
        return super.toString()+", number of engines: "+this.number_of_engines+", cost per engine per hour: "+VehicleDemo.DollarsToString(this.cost_per_engines_per_hour);
    }
}
