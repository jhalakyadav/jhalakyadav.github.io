public class Calculations {

    public static void main(String[] args) {
        int x = 258;

        System.out.println("Fuer x = " + x + " sollte checksum(x) den Wert 15 zurueckgeben.");
        System.out.println("checksum(" + x + ") gibt " + checksum(x) + " zurueck.");
    }

    public static int checksum(int x) {
        // TODO: Berechnen Sie die Quersumme von x, ohne eine Schleife zu verwenden.
        //Base Case
        if (x < 10) {
            return x;
        }
        //Recursion
        return x % 10 + checksum(x / 10);
    }
}
