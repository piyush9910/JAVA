import java.io.*;
public class Seven {
    public static void main(String[] args)
    throws IOException
    {
        StringBuffer sb=new StringBuffer();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your Surname :");
        String sur=br.readLine();
        System.out.println("Enter Your Middlename :");
        String mid=br.readLine();
        System.out.println("Enter Your FirstName :");
        String fst=br.readLine();
        sb.append(sur);
        sb.append(fst);
        System.out.println("Name = "+sb);
        int n=sur.length();
        sb.insert(n, mid);
        System.out.println("Full Name ="+sb);
        System.out.println("In Reverse ="+sb.reverse());
    }    
    }
    
