import java.time.LocalDate;

public class Rental {
    private final Vehicle vehicle;  //Has-a ilişkisi: Rental'ın bir Vehiclesi vardır.
    private final Customer customer;
    private final LocalDate rentDate;
    private LocalDate returnDate;

    public Rental(Vehicle vehicle, Customer customer) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentDate = LocalDate.now(); //otomatik bugünün tarihi
        this.returnDate = null; //henüz teslim edilmedi.
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }
    public LocalDate getReturnDate() {
        return returnDate;
    }

    public LocalDate getRentDate() {
        return rentDate;
    }

    public void returnVehicle() {    //Aracın döndüğünü belirtmek için kullanıyoruz
        this.returnDate = LocalDate.now();
    }
    public boolean isReturned(){
        return returnDate != null;
    }

    @Override
    public String toString() {
        return "Araç başarıyla kiralandı; \nKiralayan: " + customer.getName() +
                " Araç: "+ vehicle.getBrand() +
                " Kiralama tarihi: " + rentDate +
                (isReturned() ? ", Teslim Tarihi: " + returnDate : ",Teslim edilmedi!");
    }
}
