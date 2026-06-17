
import java.util.Scanner;

class CompareNum {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter no of user :- ");
      int n = sc.nextInt();

      int[] arr = new int[n];

      for(int i = 0 ; i < arr.length; i++){
        arr[i] = sc.nextInt();
      }

      for(int i = 0 ; i < arr.length ; i++){
        if(arr[i] > 0){
          System.out.println("Element at position " + i + " is positive");
          if(arr[i] % 2 == 0){
            System.out.println("this no is even ");
          }else{
            System.out.println("this no is odd ");
          }
        }else if(arr[i] < 0){
          System.out.println("Element at position " + i + " is Negative");
        }else{
          System.out.println("Element at position " + i + " is Zero");
        }


        
      }

      if(arr[0] == arr[arr.length - 1]){
          System.out.println("First and last element is equal ");
        }else{
          System.out.println("First and last are not equal ");
        }


  }
}
