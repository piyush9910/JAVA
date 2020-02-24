import java.util.Scanner;
public class Three {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int number ,ld;
        System.out.print("Enter a Number : ");
        number=obj.nextInt();
        ld=number%10;
 
        if(ld==1 || ld==3 || ld==5 || ld==7 || ld==9 ){
 
                System.out.printf( number + " is odd %n");
 
        } else{
 
            System.out.printf( number + " is even %n");
 
        }         
 
        System.out.printf("\nChecking  Odd or  Even number using  Bitwise AND operator \n");
    }
}
