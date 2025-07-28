public class Car extends Vehicle {
    private Engine engine;

    public Car(String brand, int year, Engine engine) {
        super(brand, year); //Car sınıfının miras aldığı üst sınıf olan Vehicle sınıfının yapıcı metodunu çağırır.
        this.engine = engine;
    }

    public Engine getEngine(){
        return engine;
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }

    @Override
    public void start() {
        System.out.println(getBrand() + " çalıştı. Motor: " + engine.toString());
    }

    @Override
    public void stop() {
        System.out.println(getBrand() + " durduruldu.");
    }

    @Override
    public String toString() {
        return super.toString() + " & Engine: " + engine.toString();
    }
}
