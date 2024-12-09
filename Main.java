//this si my Driver Class//
Public class Main{
    public static void main(String[] args){
        Car car = new Car(120,50.0,4);
        car.start();
        car.honk();

        Bicycle bicycle = new Bicycle(20, 0.0, true);
        bicycle.start();
        bicycle.ringBell();

        Car anotherCar = new Bicycle(23,0,100);
        anotherCar.start();
        anotherCar.displayFuel();
        anotherCar.honk();

        Bicycle anotherBicycle = new Bicycle(25,0, false);
        anotherBicycle.start();
        anotherBicycle.displayFuel();
        anotherBicycle.ringBell();

        
    }
}