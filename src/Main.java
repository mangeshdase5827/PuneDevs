import java.util.Scanner;

public class Main {

    private static int commonChacters(String str1, String str2, int str1Length, int str2Length) {
        if (str1Length == 0 || str2Length == 0) {
            return 0;
        }
        if (str1.charAt(str1Length - 1) == str2.charAt(str2Length - 1)) {
            return 1 + commonChacters(str1, str2, str1Length - 1, str2Length - 1);
        } else {
            return Math.max(commonChacters(str1, str2, str1Length - 1, str2Length), commonChacters(str1, str2, str1Length, str2Length - 1));
        }
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first String :");
    String str1 = sc.nextLine();
    System.out.println("Enter Second String :");
    String str2 = sc.nextLine();
    int str1Length= str1.length();
    int str2Length = str2.length();

        int count =  str1Length + str2Length - commonChacters(str1, str2, str1Length, str2Length);
        System.out.println("Output : " +count );

    }
}