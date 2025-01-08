package Java;

public class Palindrome {

	public static void main(String[] args) {
      String input="madam";
      String reversed=new StringBuilder(input).reverse().toString();
      if(reversed.equals(input))
      {
    	  System.out.println("its a palindrome");
      }
      else
      {
    	  System.out.println("not a palindrome");
      }
	}

}

//StringBuilder(input): Creates a new StringBuilder object initialized with the value of input.
//.reverse(): Reverses the characters in the StringBuilder.
//.toString(): Converts the reversed StringBuilder back into a String and assigns it to the variable reversed.