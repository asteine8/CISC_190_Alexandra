public class VehicleDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Maki Car Car", 2, 1);
        Airplane myAirplane = new Airplane("Kaya Airplane 7", 600, 0);

        System.out.println("Created a car called '"+myCar.getName()+"' with a max speed of "+myCar.getMaxSpeed()+"kph. This car has an engine with "+myCar.getNumCylinders()+" cylinder(s).");

        System.out.println("Created an airplane called '"+myAirplane.getName()+"' with a max speed of "+myAirplane.getMaxSpeed()+"kph. This airplane has "+myAirplane.getNumEngines()+" engine(s).");

        if (myCar.getMaxSpeed() > myAirplane.getMaxSpeed()) {
            System.out.println("The fastest vehicle is the car which travels at "+myCar.getMaxSpeed()+"kph");
        }
        else {
            System.out.println("The fastest vehicle is the airplane which travels at "+myAirplane.getMaxSpeed()+"kph");
        }
    }
}
