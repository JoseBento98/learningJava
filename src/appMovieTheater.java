

import java.util.Scanner;
import Client.Client;


public class appMovieTheater {
    public static void main(String[] args) {

        System.out.println("Program initialization");
        System.out.println("Enter a Code");
        System.out.println("[0] --- Exite Program");
        System.out.println("[1] --- New Client");
        Scanner sc = new Scanner(System.in);
        int localCode;
        localCode = sc.nextInt();

        while (localCode != 0) {
            System.out.println("initialized program");

            if (localCode == 1){
                //Client 1 = new Client();
                System.out.println("testing");
            }

            System.out.println("Enter [0] to exit or enter another code");
            localCode = sc.nextInt();
        }

        System.out.println("program closed");

        sc.close();
    }
}