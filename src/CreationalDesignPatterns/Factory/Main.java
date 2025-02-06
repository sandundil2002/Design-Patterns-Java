package CreationalDesignPatterns.Factory;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car mustang = carFactory.createCar(CarType.MUSTANG);
        Car audi = carFactory.createCar(CarType.AUDI);
        Car gtr = carFactory.createCar(CarType.GTR);
        Car lambo = carFactory.createCar(CarType.LAMBO);

        System.out.println("Car 1: " + mustang.getDetails());
        System.out.println("Car 2: " + audi.getDetails());
        System.out.println("Car 3: " + gtr.getDetails());
        System.out.println("Car 4: " + lambo.getDetails());
    }
}
