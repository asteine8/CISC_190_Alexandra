public class Car extends Vehicle {
    private int number_of_cylinders;
    private float cost_per_cylinder_per_hour = 0.25f; // Project specifications is ambiguous on if this should be final or not.

    public Car(String _name, int _max_speed, int _number_of_cylinders, float cost_per_cylinder_per_hour) {
        super(_name, _max_speed);
        setNumCylinders(_number_of_cylinders);
        this.cost_per_cylinder_per_hour = cost_per_cylinder_per_hour;
    }

    public int getNumCylinders() {
        return number_of_cylinders;
    }
    public void setNumCylinders(int _number_of_cylinders) {
        number_of_cylinders = _number_of_cylinders;
    }

    public float runningCost(int hours_of_operation) {
        return hours_of_operation * cost_per_cylinder_per_hour;
    }

    public float maintenanceCost (float cost_per_unit) {
        return cost_per_unit * number_of_cylinders;
    }
    public String toString() {
        return super.toString()+", number of cylinders: "+this.number_of_cylinders+", cost per cylinder per hour: "+VehicleDemo.DollarsToString(this.cost_per_cylinder_per_hour);
    }
}
