import java.util.Scanner;

public class Fibonaaciseries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		printfb(n);
	}
	public static void printfb(int n) {	
     int a=0,b=1;
     System.out.print(a+" "+b+" ");
     int c;
     for(int i=0;i<n;i++) {
    	 c=a+b;
    	 System.out.print(" "+c);
    	 a=b;
    	 b=c;
     }
	}

}
