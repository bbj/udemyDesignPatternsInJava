public class ElectricCar extends Vehicle {

    //parent class constructor must be called as there is no default constructor in parent
    public ElectricCar(String type, int age) {
        super(type, age);
    }

    //we can (optional) override parent methods
    @Override
    protected void speedUp() {
        super.speedUp();
        System.out.println("ElectricCar is speeding up...");
    }

    @Override
    protected void slowDown() {
        super.slowDown();
        System.out.println("ElectricCar is slowing down...");
    }

    @Override
    //protected void fuel() {
    public void fuel() {
        //cannot call super.fuel() as it is an electric car
        //throw new Error("ElectricCar cannot fuel!!!!...");
        System.out.println("ElectricCar is being charged...");
    }
}
