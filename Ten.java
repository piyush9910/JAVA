abstract class Vehicle  
{  
    abstract void bike();  
      
}  
class Honda extends Vehicle  
{  
  
    @Override  
    void bike() {  
        System.out.println("Bike is running");  
      
    }  
      
}  
  
public class Ten {  
  
    public static void main(String[] args) {  
  
    Honda obj=new Honda();  
    obj.bike();  
    }         
}