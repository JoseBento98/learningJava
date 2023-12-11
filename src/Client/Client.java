package Client;

public class Client {

   private String name; //encapsulation
    private String childOrAdult;
    private int yearOld;
    private int socialRegistration;

    public Client (String name,String childOrAdult, int yearOld, int socialRegistration){ // constructor
        this.name = name;
        this.childOrAdult = childOrAdult;
        this.yearOld = yearOld;
        this.socialRegistration = socialRegistration;
    }

    public Client (String name,String childOrAdult, int yearOld){ //constructor overloading
        this.name = name;
        this.childOrAdult = childOrAdult;
        this.yearOld = yearOld;
    }

    public void setName(String name) { // setter
        this.name= name;
    }

    public String getName(){ //getter
        return name;
    }


}
