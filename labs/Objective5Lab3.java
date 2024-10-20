public class Objective5Lab3 {
    public static void main(String[] args) {
      java.util.Scanner scanner = new java.util.Scanner(System.in);
      int userNum;
      int userNum2 = scanner.nextInt();
      System.out.println("Please enter a number: ");
      if(userNum2 % 2 != 0) {
        System.out.println("The number is odd");
      }
      else{
        System.out.println("The number is positive");
      }

      scanner.close();
  }
}