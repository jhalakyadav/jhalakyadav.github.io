import java.util.Scanner;

public class Reihe {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N: ");
        int n = in.nextInt();

        System.out.println("Für N = 4 sollte das Programm ca. 1.42 ausgeben.");
        System.out.println("Die Methode reihe(" + n + ") gibt " + reihe(n) + " aus.");
    }

    public static double reihe(int n) {
        // TODO: Berechnen Sie 1/1^2 + 1/2^2 + ... + 1/n^2.
        double res = 0.0;

        for(int i = 1; i <= n; i++){
            res = res + 1 / Math.pow(i, 2);
        }

        return res;
    }
}
