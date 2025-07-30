
public class Main {
    public static void main(String[] args) {
        Engine e = new Engine(150, "Benzinli");
        Engine e2 = new Engine(160, "Elektrikli");
        Car c = new Car("Toyota", 2022, e);
        Car c2 = new Car("BMW",2020, e2);

        Engine engine = new Engine(200, "Dizel");
        Car car = new Car("Toyota", 2020, engine);

        Bicycle b = new Bicycle("Salcano", 2024, 18);
        b.start();
        b.stop();
        System.out.println(b);

        c.start();
        System.out.println(c);
        System.out.println(c2);
        c2.start();
        c2.stop();


        Customer customer2 = new Customer("Kerem Akkale", "keremakkale@hotmail.com");
        Customer customer = new Customer("Mustafa Cengiz", "cengizmustafa@gmail.com");
        System.out.println(customer);


        Rental r = new Rental(b, customer);
        r.returnVehicle(); //bu komut döndüğü tarihi bildirir.

        Rental r2 = new Rental(car, customer2);

        System.out.println(r2);
        System.out.println(r);
    }
}