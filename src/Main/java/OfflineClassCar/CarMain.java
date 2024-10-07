package OfflineClassCar;

public class CarMain {
    public static void main(String[] args) {
        Car car=new Car();
        Car car1=new Benz();
        Suzuki suzuki=new Suzuki();
        Benz benz=new Benz();

        car.startCar();			// used its own startCar() Method
        suzuki.startCar();		// inherited the startCar() Method from Car class
        benz.startCar();		// used its own startCar() Method

        car1.startCar();		// run time polymorphism
//		car1.applyBrake();		// compile time polymorphism
        car1.method();

    }
}
