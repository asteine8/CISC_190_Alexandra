public class TemperatureTooLow extends Exception {
    public TemperatureTooLow() {
        super("The temperature is too low");
    }

    public TemperatureTooLow(int temp) {
        super("The temperature is "+temp+" degrees, which is too low");
    }
}
