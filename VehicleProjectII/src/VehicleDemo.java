public class VehicleDemo {

    static final int hoursOfOperation = 24;
    static final float carMaintenanceCostPerCylinder = 75f; // Cost per cylinder
    static final float airplaneMaintenanceCostPerEngine = 3000f; // Cost per engine
    public static void main(String[] args) {

        // Initialize objects
        Car myCar = new Car("Maki Car Car", 2, 1, 0.5f);
        Airplane myAirplane = new Airplane("Kaya Airplane 7", 600, 0, 200f);

        // Vehicle info
        System.out.println("Created a new car with "+myCar.toString());
        System.out.println("Created a new airplane with "+myAirplane.toString());

        System.out.println("");

        // Running cost info
        System.out.println("The running cost of the car over "+hoursOfOperation+" hours is "+DollarsToString(myCar.runningCost(hoursOfOperation)));
        System.out.println("The running cost of the airplane over "+hoursOfOperation+" hours is "+DollarsToString(myAirplane.runningCost(hoursOfOperation)));

        // Maintanance cost info
        System.out.println("The maintanance cost for the car at a shop with a cost of "+DollarsToString(carMaintenanceCostPerCylinder)+" per cylinder is "+DollarsToString(myCar.maintenanceCost(carMaintenanceCostPerCylinder)));
        System.out.println("The maintanance cost for the airplane at a hangar with a cost of "+DollarsToString(airplaneMaintenanceCostPerEngine)+" per engine is "+DollarsToString(myAirplane.maintenanceCost(airplaneMaintenanceCostPerEngine)));

        System.out.println("");

        // Show that the Car class is a sub-class of Vehicle and demonstate dynamic method binding
        Vehicle v1 = new Car("Neko-co Car", 2000, 2, 250f);
        System.out.println("Created a new Vehicle and assigned a car to it with "+v1.toString());

        /**
         * Variables of type Vehicle can be assigned a car object since the Car class is a sub-class of the Vehicle class. Because java supports dynamic method binding, and because v1 has been assigned a car object, java knows to select the toString method from the Car class rather than the Airplane class. If v1 had been assigned an Airplane, the toString method from Airplane would have been called.
         */
    }

    public static String DollarsToString(float dollars) {
        return String.format("$%.2f", dollars);
    }
}
