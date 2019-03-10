import java.util.ArrayList;

public class CarsLibrary {
    static ArrayList<Car> arrlist;

    public static ArrayList<Car> getCarsFromCity(String city){
        ArrayList<Car> cars = new ArrayList<Car>();

        for(Car car: arrlist){
            if(car.getCity().equals(city)){
                cars.add(car);
            }
        }
        return cars;
    }



}
