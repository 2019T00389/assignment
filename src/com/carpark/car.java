public class Vehicle {

    private String model;
    private String color;
    private int numOfWheels;
    private String transmission;


    public Vehicle(){

    }


    public Vehicle(String model, String color, int numOfWheels, String transmission){
        this.model = model;
        this.color = color;
        this.numOfWheels = numOfWheels;
        this.transmission = transmission;
    }


    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

    public int NumOfWheels(){
        return numOfWheels;
    }

    public String transmission(){
        return transmission;
    }


    public void setNumOfWheels (int numOfWheels){
        this.numOfWheels = numOfWheels;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setTransmission(String transmission){
        this.transmission = transmission;
    }


    public void printDetails(){
        System.out.println("The color of this vehicle is " + this.color);
        System.out.println("The model of this vehicle is " + this.model);
        System.out.println("The transmission for this vehicle is " + this.transmission);
        System.out.println("The number of wheels in this vehicle is "+ this.numOfWheels);
    }

}
public class Bike extends Vehicle {

    private boolean suspension;

    public Bike(){
        super();
    }

    public Bike(String model, String color, int numOfWheels, boolean suspension){
        super( model, color, numOfWheels, "na");
        this.suspension = suspension;
    }


    public boolean getSuspension(){
        return suspension;
    }


    public void setSuspension(){
        this.suspension = suspension;
    }


    public void printBikeDetails(){
        super.printDetails();
        System.out.println("Does this bike have suspension ?? " + this.suspension);
    }
}
public class Car extends Vehicle{

    private Boolean roof;


    public Car(){
        super();
    }

    public Car(String model, String color, int numOfWheels, String transmission, Boolean roof){

        super(model, color, numOfWheels, transmission);
        this.roof = roof;

    }


    public boolean getRoof(){
        return roof;
    }

    public void setRoof(boolean roof){
        this.roof=roof;
    }


    public void printdetailscar(){
        super.printDetails();
        System.out.println(" does this car has a roof: " + this.roof);
    }
}
<strong></strong>

        import java.util.ArrayList;




public class CarPark {

    private static final int maxCapacity = 3;
    private ArrayList <Vehicle>carParkArray;


    public CarPark(){

        this.carParkArray = new ArrayList<Vehicle>(maxCapacity);

    }


    public static int getMaxCapacity(){
        return maxCapacity;
    }


    public int numOfAvailableSpots(){
        return this.maxCapacity - this.carParkArray.size();
    }


    public int numOfOccupiedSpots(){
        return this.carParkArray.size();
    }


    public void addVehicles(Vehicle vehicle){

        if(this.numOfAvailableSpots() > 0){
            this.carParkArray.add(vehicle);
            vehicle.printDetails();
            System.out.println("++++++++++++ \n");
        }else {
            System.out.println("Car Park is full");
        }

    }
    public void printParkedVehicleDetails(){

        for(Vehicle vehicle: this.carParkArray){
            vehicle.printDetails();
            System.out.println("++++++++++++++++ \n");

        }

    }
}
public class CarParkManagement {

    public static void main(String[] args) {

        Car BMW = new Car("Z4", "red",4, "Auto",false);

        Bike Superfly = new Bike("XTR", "Black",2,true );

        Car Hyundai = new Car("i30","Light Blue",4,"Auto",true);

        CarPark myCarPark = new CarPark();


        myCarPark.addVehicles(BMW);
        myCarPark.addVehicles(Hyundai);
        myCarPark.addVehicles(Mercedes);
        myCarPark.addVehicles(Superfly);


        System.out.println(" No. of Parked vehicles: " + myCarPark.numOfOccupiedSpots());

        System.out.println("No. of Available Spots: "+ myCarPark.numOfAvailableSpots());


        System.out.println("====================\n");
        System.out.println("List of All Parked Vehicles is as folows: ");
        myCarPark.printParkedVehicleDetails();
