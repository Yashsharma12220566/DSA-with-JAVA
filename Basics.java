import java.util.Scanner;
class Basics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();

        System.out.println("Enter your marks");
        int b = sc.nextInt();
        
        int c = a+b;
        System.out.println(c);



    }
}