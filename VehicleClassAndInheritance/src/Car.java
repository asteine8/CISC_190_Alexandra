public class Car extends Vehicle {
    private int number_of_cylinders;

    public Car(String _name, int _max_speed, int _number_of_cylinders) {
        super(_name, _max_speed);
        setNumCylinders(_number_of_cylinders);
    }

    public int getNumCylinders() {
        return number_of_cylinders;
    }
    public void setNumCylinders(int _number_of_cylinders) {
        number_of_cylinders = _number_of_cylinders;
    }
}
