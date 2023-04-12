import java.util.Scanner;

public class adamsnumber {
	      public static int rev(int n) {
	    	  int rem;
	    	  int sum=0;
	    	  while(n!=0){
	    	  rem=n%10;
	    	  sum=sum*10+rem;
	    	  n=n/10;
	    	  }
	    	  return sum;
	    	  
	      }

	public static void main(String[] args) {
    int num,m,n,k,sqr;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    num=sc.nextInt();
    sqr=num*num;
        m=rev(sqr);
        n=rev(num);
        k=n*n;
        if(k==m)
        	System.out.println("Number is adams");
        else
        	System.out.println("Number is not adams");
	}
}
