package Client;

public class Client {

    String name;
    String childOrAdult;
    int yearOld;
    int socialRegistration;

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

}
