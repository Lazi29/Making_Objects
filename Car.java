//this my car class//
public class Car extends Vehicle_Base {
    private int numbersOfDoors;

    public Car(int speed, int fuel, int numbersOfDoors){
        super(speed, fuel);
        this.numbersOfDoors = numbersOfDoors;
    }
 
        //this is ,y @Override//
    @Override
    public void star(){
        System.out.println("The car has stared");
    }
    public void honk(){
        System.out.println("Beep Beep!!!");
    }
}