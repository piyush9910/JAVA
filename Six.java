public class Six {
   public static void main(String[] args) {
   String s1="Java Programming";
   String s2=new String("I LOVE JAVA");
   char arr[]={'J','A','V','A'};
   String s3=new String(arr);
   
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);
       
       System.out.println("Length of s1 :"+s1.length());
       System.out.println("Concatination of s1 and s2 :"+s1.concat(s2));
       boolean x=s1.startsWith("A");
       
       String p=s2.substring(0,7);
       System.out.println(p);
       
       System.out.println(s1+s2);
       System.out.println("Uppercase: "+s1.toUpperCase());
       System.out.println(": "+s1.toLowerCase());
               
       
}
 
}
