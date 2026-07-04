//Ravi just joined a coding guild. Store his name, age, rank, salary, and
//membership fee (float) using correct data types. Compute his
//annual bonus (12% of salary), cast it to int, and print a formatted
//welcome card.
import java.util.*;
public class ravi_welcome_card {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name=sc.nextLine();
        System.out.println("Enter his age: ");
        int age=sc.nextInt();
        System.out.println("Enter his salary: ");
        float salary=sc.nextInt();
        System.out.println("Enter the membership fee: ");
        float fee=sc.nextFloat();
        double Annual_bonus=0.12*salary;
        int bonus=(int)Annual_bonus;
        System.out.println("WELCOME " + name + " WE ARE GLAD TO WELCOME YOU\n" + "Name: "+name + "\nAge: "+ age+"\nSalary: "+ salary + "\nBonus: "+ bonus + "\nWITH A MEMBERSHIP FEE: "+ fee);
     }
}
