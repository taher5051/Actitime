import java.util.Scanner;

public class NumberandCharacter1 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    String Str=sc.nextLine();
    String Temp1="",Temp2="";
    for(int i=0;i<Str.length();i++) {
    	char ch=Str.charAt(i);
    if(Character.isDigit(ch))
    	Temp1=Temp1+""+ch;
    else if(Character.isAlphabetic(ch))
    	Temp2=Temp2+""+ch;
    }
    System.out.println(Temp1+"  "+Temp2);
	}

}
