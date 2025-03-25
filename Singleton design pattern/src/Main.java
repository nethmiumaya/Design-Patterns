public class Main {
    public static void main(String[] args) {

        GlobleHandler globleHandler1 = Singleton.getInstance().getGlobleHandler();
        GlobleHandler globleHandler2 = Singleton.getInstance().getGlobleHandler();
        GlobleHandler globleHandler3 = Singleton.getInstance().getGlobleHandler();

        System.out.println(globleHandler1.equals(globleHandler2));
        System.out.println(globleHandler2.equals(globleHandler3));

        System.out.println(globleHandler1.hashCode());
        System.out.println(globleHandler2.hashCode());
    }
}