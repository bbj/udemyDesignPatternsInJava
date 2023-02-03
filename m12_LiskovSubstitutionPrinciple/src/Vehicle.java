public abstract class Vehicle implements Fuel {
//public abstract class Vehicle {

    protected String type;
    protected int age;

    public Vehicle(String type, int age) {
        this.type = type;
        this.age = age;
    }

    protected void speedUp() {
        System.out.println("Vehicle is speeding up...");
    }

    protected void slowDown() {
        System.out.println("Vehicle is slowing down...");
    }

    //1 ----------------
    //THE PROBLEM: fuel() cannot be called with ElectricCar
    //    protected void fuel() {
    //        System.out.println("Vehicle is fueling...");
    //    }
    //2 ----------------
    //Let's make it abstract (no implementation) => class must be abstract too!
    //the child classes can decide how to implement it
    //protected abstract void fuel();
    //3 ----------------
    //fuel() will be define in child classes
}
