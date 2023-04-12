import java.util.Scanner;

public class numberandcharacter {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the given string");
    String str=sc.nextLine();
    String Temp1=""; String Temp2="";
    for(int i=0;i<str.length();i++) {
    	 char ch=str.charAt(i);
    	 if(ch>='A'&&ch>='Z'||ch>='a'&&ch>='z') {
    		 Temp1=Temp1+""+ch;
    	 }
    	 else if(ch>='0'&& ch<='9'){
    		 Temp2=Temp2+""+ch;
    	 }
    	 System.out.println(Temp1+"  "+Temp2);
    	 
    }
	}

}
