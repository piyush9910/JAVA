import java.io.*; 
interface In1 
{ 
    final int a = 10; 
    void display(); 
} 
public class Five implements In1 
{ 
    public void display() 
    { 
        System.out.print("Number is : "); 
    } 

    public static void main (String[] args) 
    { 
        Five t = new Five();
        t.display(); 
        System.out.println(a); 
    } 
} 
