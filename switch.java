import java.util.*; 
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    String[] arr= new String[5];
	    arr= sc.nextLine().split(",");
	    int a= Integer.parseInt(arr[0]);
	    int b= Integer.parseInt(arr[1]);

	    System.out.println("Enter the operator +, -, *, ?-");
	    char op = sc.next(). charAt(0);
	    sc.close();
	    int output;
	    
	    switch(op)
	    {
	        case '+':
	            output= a +b;
	            break;
	       case '-':
	            output= a -b;
	            break;
	       case '*':
	            output= a *b;
	            break;
	       case '/':
	            output= a /b;
	            break;
	     default:
	     System.out.println("Invalid!");
	     return;
	    }
		System.out.println(a+" "+ op+" "+b+" = "+output );
	}
}
