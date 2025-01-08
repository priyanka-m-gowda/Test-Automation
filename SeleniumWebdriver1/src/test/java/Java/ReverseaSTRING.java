package Java;

public class ReverseaSTRING {

	public static void main(String[] args) {
      String input="SELENIUM";
      String reversed=new StringBuilder(input).reverse().toString();
      System.out.println("string reversed:"+reversed);
     
	}

}

//import java.util.Scanner;
//
//public class ReverseString {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a string: ");
//        String str = scanner.nextLine();
//        
//        String reversed = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reversed += str.charAt(i);
//        }
//        
//        System.out.println("Reversed string: " + reversed);
//    }
//}

