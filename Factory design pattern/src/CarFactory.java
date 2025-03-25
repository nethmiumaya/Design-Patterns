public class CarFactory {
    public void createCar(CarType carType){
        switch (carType){
            case GTR -> new Gtr();
            case MUSTANG -> new Mustang();
            case LAMBO -> new Lambo();
            case AUDI -> new Audi();
        }

    }
}