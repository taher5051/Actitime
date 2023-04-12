import java.util.Scanner;

public class multiplyWithoutUsingMultipltyOperator {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the nummber");
	int a=sc.nextInt();
	System.out.println("enter the nummber");
	int b=sc.nextInt();
	int result=0;
	for(int i=1;i<=b;i++) {
		result=result+a;
	}
	System.out.println(result);
   }
}
