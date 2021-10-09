import org.omg.PortableInterceptor.NON_EXISTENT;

public class Fridge {
    private int temperature;

    public Fridge() {

    }

    public void setTemp(int temp) {
        temperature = temp;
    }
    public boolean tempNormal(int temp) {
        try {
            if (temp < 10) {
                throw new TemperatureTooLow(temp);
            }
        } catch(Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    // Felt that I should add this, even though it was not specified
    public int getTemp() {
        return temperature;
    }
}
