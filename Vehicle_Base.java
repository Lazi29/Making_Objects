public class Vehicle_Base{
    public int speed;
    private double fuel;

        //This is my Constuctor//
    public Vehicle_Base(int speed, double fuel){
        this.speed = speed;
        this.fuel = fuel;
    }

    //this is my Stop, Star, and Dysplay Methods//
    public void start(){
        System.out.println("The vehicle has stared"); 
    }
    public void stop(){
        System.out.println("The vehicle has stopped");         
    }
    public final void displyFuel(){
        System.out.println("Fuel Level:" + fuel );
    }

        //Geter//
     public int getSpeed(){
        return speed;
     }
      public double getFuel(){
        return fuel;
     }

        //Setter//
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setFue(Double fuel){
        this.fuel = fuel;
    }

    public void displayDetails(){
        System.out.println("Speed: " + speed + "Km/H");
        System.out.println("fuel: "+ fuel + "Litres");
    }
    public static void main(String[] args){
        Vehicle_Base myCar = new Vehicle_Base(120,50.9);
   
    }

}

