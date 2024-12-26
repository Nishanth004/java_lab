import java.util.Scanner;

public class StrCmp {

    public static int cmp(String s1, String s2) {
        for (int i = 0; i < s1.length() && i < s2.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return s1.charAt(i) - s2.charAt(i);
        }
        return s1.length() - s2.length();
    }

    public static int cmp(String s1, String s2, int n) {
        for (int i = 0; i < n && i < s1.length() && i < s2.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return s1.charAt(i) - s2.charAt(i);
        }
        if (s1.length() < n && s2.length() < n) return 0;
        return s1.length() < n ? -1 : (s2.length() < n ? 1 : 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        
        System.out.println("Full comparison: " + cmp(s1, s2));
        
        System.out.print("Enter number of chars to compare: ");
        int n = sc.nextInt();
        
        System.out.println("Partial comparison: " + cmp(s1, s2, n));
        
        sc.close();
    }
}
