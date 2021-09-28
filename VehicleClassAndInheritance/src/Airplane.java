public class Airplane extends Vehicle {
    private int number_of_engines;

    public Airplane(String _name, int _max_speed, int _number_of_engines) {
        super(_name, _max_speed);
        setNumEngines(_number_of_engines);
    }

    public int getNumEngines() {
        return number_of_engines;
    }
    public void setNumEngines(int _number_of_engines) {
        number_of_engines = _number_of_engines;
    }
}
