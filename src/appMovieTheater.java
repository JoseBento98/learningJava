import java.util.Scanner;

public class appMovieTheater {
    public static void main(String[] args) {

        System.out.println("Program initialization");
        Scanner sc = new Scanner(System.in);
        int localCode;
        localCode = sc.nextInt();

        while (localCode != 0) {
            System.out.println("initialized program");
            localCode = sc.nextInt();
        }

        System.out.println("program closed");

        sc.close();
    }
}