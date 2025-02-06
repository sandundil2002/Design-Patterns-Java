package CreationalDesignPatterns.Factory;

public class CarFactory {
    public Car createCar(CarType carType) {
        return switch (carType) {
            case GTR -> new Gtr();
            case LAMBO -> new Lambo();
            case MUSTANG -> new Mustang();
            case AUDI -> new Audi();
            default -> null;
        };
    }
}
