
package switchcasecalcu;
    import java.util.Scanner;

 class switchcasecalcu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       System.out.println("Enter first value. ");
       int a = sc.nextInt();
       System.out.println("Enter second value. ");
       int b = sc.nextInt();
       System.out.println("Enter arithmetic opperation.");
       String Operator = sc.next();
       
       switch (Operator) {
           case ("+"):
           case ("Add"):
           case ("Addition"):
               System.out.println(a+b);
               break;
           
           case ("-"):
           case ("Subtract"):
           case ("Subtraction"):
               System.out.println(a-b);
               break;
               
           case ("*"):
           case ("Multiply"):
           case ("Multiplication"):
               System.out.println(a*b);
               break;
               
           case ("/"):
           case ("Divide"):
           case ("Division"):
               System.out.println(a/b);
               break;
               
           case ("%"):
           case ("Module"):
               System.out.println(a%b);
               break;
       }
    }    
}
