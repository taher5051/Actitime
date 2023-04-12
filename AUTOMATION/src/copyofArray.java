import java.util.Arrays;

public class copyofArray {

	public static void main(String[] args) {
    int arr[]= {10,20,30,40,50,60};
    int arr1[]=Arrays.copyOfRange(arr, 1, 4);
    System.out.println(Arrays.toString(arr));
    for(int i=0;i<arr1.length;i++) {
    	System.out.println(arr1[i]);
    }
    System.out.println(Arrays.toString(arr1));
    int[] arr2=new int[3];
    System.arraycopy(arr, 1, arr2, 0, 3);
    System.out.println(Arrays.toString(arr2));
	}
	}


