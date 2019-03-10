public class Car {
    String model;
    String city;
    int age;

    public Car(String model, String city, int age){
        this.model = model;
        this.city = city;
        this.age = age;
    }

    public String getCity(){
        return this.city;
    }
}
