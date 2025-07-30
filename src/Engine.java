public class Engine {
    private int horsepower;
    private String type; //Benzinli, Dizel, Elektrikli

    public Engine(int horsepower, String type){
        this.horsepower = horsepower;
        this.type = type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return horsepower + "HP  &" + type;
    }
}
