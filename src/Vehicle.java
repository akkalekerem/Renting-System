public abstract class Vehicle {
    protected String brand;
    protected int year;
    private final String id; // Her araçta değişmeyen benzersiz ID
    private static int idCounter = 1; //Static sayaç
    private boolean rented;

    //Constructor
    public Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
        this.id = "VHC-" + idCounter++;
        this.rented = false;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public boolean isRented(){
        return rented;
    }

    public void setRented(boolean rented){
        this.rented = rented;
    }

    //soyut method -> Alt sınıflar abstract edecek.
    public abstract void start();
    public abstract void stop();

    @Override
    public String toString() {
        return "[" + id + "] " + brand + " (" + year + ")" +
                (rented ? " (KİRADA)" : " (BOŞTA)");
    }
}
