import java.util.Scanner;

public class Adamsnumber1 {
	public static int rev(int n) {
		int rem,sum=0;
		while(n!=0){
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		return sum;
	}

	public static void main(String[] args) {
    int m,n,k,sqr;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int num=sc.nextInt();
    sqr=num*num;
    m=rev(sqr);
   n=rev(num);
   k=n*n;
   if(m==k) {
	   System.out.println("admas number");
	   }
   else {
	   System.out.println("not admas number");
   }
	}

}