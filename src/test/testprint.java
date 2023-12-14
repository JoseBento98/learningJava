package test;

public class testprint {

    String txt;


    public testprint (String txt){
        this.txt = txt;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }


    public String toString() {
        return txt
                + "This text";
    }
}
