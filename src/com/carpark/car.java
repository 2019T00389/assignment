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
