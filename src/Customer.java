public class Customer {
    private static int idCounter = 1;

    private final String id;
    private  String name;
    private String email;

    public Customer(String name, String email){
        this.name = name;
        this.email = email;
        this.id = "CUST-" + idCounter++;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString(){
        return "[" + id + "] " + name + "("+ email + ")";
    }
}
