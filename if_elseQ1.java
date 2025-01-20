import java.util.Scanner;
public class if_elseQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int bonus ;

        if(salary<=10000) {
            bonus = sc.nextInt();     /// HERE IF I WANT TO ADD CUSTOM BONUS ALASO I CAN ADD BY bonus = 1000; 
            System.out.println(salary+bonus);
        } else {
            bonus = sc.nextInt();    /// HERE IF I WANT TO ADD CUSTOM BONUS ALASO I CAN ADD BY bonus = 2000; 
            System.out.println(salary+bonus);
        }
        sc.close();

    }

    
}
