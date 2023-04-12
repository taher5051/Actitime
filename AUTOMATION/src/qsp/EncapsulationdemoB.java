package qsp;

public class EncapsulationdemoB {

	public static void main(String[] args) {
		EncapsulationdemoA a=new EncapsulationdemoA(30);
		int value = a.getvalue();
		System.out.println(value);
		a.setvalue(50);
		System.out.println(a.getvalue());
		a.setvalue(100);
		System.out.println(a.getvalue());
}
}
