

import java.util.Locale;
import java.util.Scanner;
import Client.Client;
import Payments.Payments;
import test.testprint;


public class appMovieTheater {

    public static void main(String[] args) {

        testprint tp;


        Locale.setDefault(Locale.US);

        System.out.println("Program initialization");
        System.out.println("Enter a Code");
        System.out.println("[0] --- Exite Program");
        System.out.println("[1] --- New Client");
        System.out.println("[2] --- Payments.Payments");
        System.out.println("[3] --- Data Client");
        System.out.println("[4] --- Check list");
        System.out.println("[5] --- Nt");
        Scanner sc = new Scanner(System.in);
        int localCode;
        localCode = sc.nextInt();

        while (localCode != 0) {
            System.out.println("initialized program");

            if (localCode == 1){


                System.out.println("Enter a text: ");
                String txt = sc.nextLine();

                tp = new testprint(txt);
                System.out.println(tp);
                
            }

            System.out.println("Enter [0] to exit or enter another code");
            localCode = sc.nextInt();
        }

        System.out.println("program closed");

        sc.close();
    }
}