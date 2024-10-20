public class Objective5Lab4 {
	public static void main(String[] args) {
		  java.util.Scanner scanner = new java.util.Scanner(System.in);
		  int num = 6;
		  System.out.println("Please Enter a number: ");
		  int num2 = scanner.nextInt();
		  if(num2 % 2 == 0) {
		  	System.out.println("The number is even.");
		  }
		  else{
		  	System.out.println("The number is odd.");
		  }
	}
}