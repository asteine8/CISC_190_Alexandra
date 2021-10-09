public class TestTemp {

    private static final int TEMP_1 = 35;
    private static final int TEMP_2 = 8;
    public static void main(String[] args) {
        Fridge myFridge = new Fridge();

        // Do stuff for 35 degrees
        System.out.println("Setting temperature to "+TEMP_1+" degrees");
        myFridge.setTemp(TEMP_1);
        System.out.println("Temperature is "+(!myFridge.tempNormal(TEMP_1)?"not ":"")+"normal");

        // Do stuff for 35 degrees
        System.out.println("Setting temperature to "+TEMP_2+" degrees");
        myFridge.setTemp(TEMP_2);
        System.out.println("Temperature is "+(!myFridge.tempNormal(TEMP_2)?"not ":"")+"normal");
    }
}
