
public class Main {
    public static void main(String[] args) {
        Engine e = new Engine(150, "Benzinli");
        Engine e2 = new Engine(160, "Elektrikli");
        Car c = new Car("Toyota", 2022, e);
        Car c2 = new Car("BMW",2020, e2);

        Bicycle b = new Bicycle("Salcano", 2024, 18);
        b.start();
        b.stop();
        System.out.println(b);

        c.start();
        System.out.println(c);
        System.out.println(c2);
        c2.start();
        c2.stop();
    }
}