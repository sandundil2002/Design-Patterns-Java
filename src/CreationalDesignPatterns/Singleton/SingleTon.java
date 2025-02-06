package CreationalDesignPatterns.Singleton;

public class SingleTon {
    private static SingleTon instance;

    private SingleTon() {
        System.out.println("SingleTon instance created");
    }

    public static SingleTon getInstance() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }

}
