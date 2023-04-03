import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Palindromic :");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str =filterString(str);
        String rvs = reverse(str);
        boolean result = compare(str,rvs);
        OutputPalindromic(result);
    }
    public static void OutputPalindromic(boolean result){
        if(result){
            System.out.println("It is a palindrome");
        }
        else {
            System.out.println("It is not a palindrome");
        }
    }
    public static String reverse(String str) {
        StringBuilder builder =new  StringBuilder(str);
        builder.reverse();
        return builder.toString();

    }

    public static boolean compare(String str,String rvs){
        return str.matches(rvs);
    }

    public static String filterString(String str){
        String [] parts = str.split("\\W");
        StringBuilder strBuilder = new StringBuilder();
        for(String part:parts){
            strBuilder.append(part);
        }
        str = strBuilder.toString();
        return str;
    }
}

