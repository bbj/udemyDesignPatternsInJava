public class PetrolCar extends Vehicle {

    //parent class constructor must be called as there is no default constructor in parent
    public PetrolCar(String type, int age) {
        super(type, age);
    }

    //we can (optional) override parent methods
    @Override
    protected void speedUp() {
        super.speedUp();
        System.out.println("PetrolCar is speeding up...");
    }

    @Override
    protected void slowDown() {
        super.slowDown();
        System.out.println("PetrolCar is slowing down...");
    }

    @Override
    //protected void fuel() {
    public void fuel() {
        System.out.println("PetrolCar is fueling with gaz...");
    }
}
