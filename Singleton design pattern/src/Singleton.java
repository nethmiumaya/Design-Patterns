public class Singleton {
    private static Singleton singleton;
    private GlobleHandler globleHandler; //like connection

    private Singleton() {
        System.out.println("Singleton object created");
        globleHandler = new GlobleHandler();
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public GlobleHandler getGlobleHandler() {
        return globleHandler;
    }
}
