public class Bicycle extends Vehicle {
    private int gearCount; //Vites sayısı

    public Bicycle(String brand, int year, int gearCount) {
        super(brand, year);
        this.gearCount = gearCount;
    }

    public int getGearCount(){
        return gearCount;
    }

    public void setGearCount(int gearCount){
        this.gearCount = gearCount;
    }


    //Vehicle olduğu için start & stop komutlarını Override etmek zorundayız.
    @Override
    public void start() {
        System.out.println(getBrand() + " bisikleti yola çıktı.");
    }
    @Override
    public void stop() {
        System.out.println(getBrand() + " bisikleti durdu.");
    }

    @Override
    public String toString(){
        return super.toString() + " & Vites Sayısı: "+ getGearCount();
    }
}
