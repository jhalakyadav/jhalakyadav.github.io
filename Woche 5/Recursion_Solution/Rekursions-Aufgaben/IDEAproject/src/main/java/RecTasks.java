public class RecTasks {

    public static void main(String[] args) {
        System.out.println("sum([2, 5, 1]): erwartet 8, erhalten "
                + sum(new int[]{2, 5, 1}));
        System.out.println("count('a', \"banane\"): erwartet 2, erhalten "
                + count('a', "banane"));
        System.out.println("isSorted([1, 2, 2, 5]): erwartet true, erhalten "
                + isSorted(new int[]{1, 2, 2, 5}));
        System.out.println("dedupRuns(\"aabbcca\"): erwartet \"abca\", erhalten \""
                + dedupRuns("aabbcca") + "\"");
        System.out.println("isBalanced(\"{a{}}\"): erwartet true, erhalten "
                + isBalanced("{a{}}"));
    }

    // Aufgabe 1: Summe der Elemente
    public static int sum(int[] xs) {
        // TODO: Berechnen Sie die Summe rekursiv und ohne Schleife.
        return help1(xs, 0);
    }

    public static int help1(int[] a, int i){
        //Base Case
        if(i == a.length) return 0;
        //Recursion
        return help1(a, i+1) + a[i];
    }

    // Aufgabe 2: Zeichen zaehlen
    public static int count(char c, String s) {
        // TODO: Zaehlen Sie die Vorkommen rekursiv mit substring(1).
        //Base Case
        if(s.equals("")) return 0;
        //Recursion
        if(s.charAt(0) == c) return 1 + count(c, s.substring(1));
        return count(c, s.substring(1));
    }

    // Aufgabe 3: Sortiertes Array
    public static boolean isSorted(int[] xs) {
        // TODO: Pruefen Sie die Reihenfolge rekursiv und ohne Schleife.
        return help2(xs, 0);
    }

    public static boolean help2(int[] a, int i){
        //Base Case
        if(i >= a.length-1) return true;
        //Recursion
        return a[i] <= a[i+1] && help2(a, i+1);

    }

    // Aufgabe 4: Wiederholungen entfernen
    public static String dedupRuns(String s) {
        // TODO: Entfernen Sie aufeinanderfolgende Wiederholungen rekursiv.
        if(s.equals("")) return "";
        return s.charAt(0) + help3(s.substring(1), s.charAt(0));
    }

    public static String help3(String s, char c){
        //Base Case
        if(s.equals("")) return "";
        //Recursion
        if(s.charAt(0) == c) return help3(s.substring(1), c);
        return s.charAt(0) + help3(s.substring(1), s.charAt(0));

    }

    // Aufgabe 5: Klammern pruefen
    public static boolean isBalanced(String s) {
        // TODO: Pruefen Sie die Klammern rekursiv und ohne Schleife.
        return help3(s, 0);
    }

    public static boolean help3(String s, int i){
        //Base Case
        if(s.equals("")) return i == 0;
        //Recursion
        if(i < 0) return false;
        char c = s.charAt(0);
        if(c == '{') return help3(s.substring(1), i+1);
        else if(c == '}') return help3(s.substring(1), i-1);
        else if(c == '<' || c == '>' || c == '(' || c == ')') return false;
        return help3(s.substring(1), i);
    }
}
