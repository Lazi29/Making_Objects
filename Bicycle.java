//this is my Bicycle Subclass//
public class Bicycle extends Vehicle_Base{
    private boolean hasBell;

    public Bicycle(int speed, int fuel, boolean hasBell){
        super(speed, fuel);
        this.hasbell = hasBell;

    }

    @Override public void star(){
        System.out.println("Pedal Away!!");
    }

    public void ringBell(){
        if(hasBell){
            System.out.println("Ring Ring!!");
             } else {
                System.out.println("This bicycle has no bell");
             }

        public boolean isHasBell(){
            return hasBell;
        }
        public void setHasBell(boolean hasBell) {
            this.hasBell = hasBell;
        }
      
    }
}