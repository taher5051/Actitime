interface fruit{
	
}
   class mango{
	
}
public class mangoinstanceof {

	public static void main(String[] args) {
		mango m1=new mango();
		System.out.println(m1 instanceof mango);
		System.out.println(m1 instanceof fruit);
		System.out.println(new mango() instanceof fruit );
		int [] arr= {1,2,3,4};
		System.out.println(arr instanceof int[]);
		}
}
