
public class ReverseString {

	public static void main(String[] args) {
    String str="taher";
    //int leng=str.length();
    //String rev="";
    //for(int i=leng-1;i>=0;i--) {
    	//rev=rev+str.charAt(i);
    //}
    //System.out.println(rev);
    //char[] ch=rev.toCharArray();
    //System.out.println(ch);
    char[] ch=new StringBuffer("TAHER").reverse().toString().toCharArray();
    System.out.println(ch);
	}

}
