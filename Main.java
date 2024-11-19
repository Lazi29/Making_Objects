//this si my Driver Class//
Public class Main{
    public static void ain(String[] args){
        Car myCar = new Car(100,150,30);
        myCar.start();
        myCar.displayFuel();
        myCar.honk();

        Bicycle myBicycle = new Bicycle(30,95 true);

        myBicycle.Start();
        myBicycle.displayFuel();
        myBicycle.ringBell();

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