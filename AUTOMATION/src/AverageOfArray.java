
public class AverageOfArray {

	public static void main(String[] args) {
    int[] number= {10,20,30,40,50,60};
    int leng = number.length;
    int sum=0;
    int sum1=0;
    int sum2=0;
    for(int i=0;i<leng;i++) {
    	sum=sum+number[i];
    }
    System.out.println(sum);
    int avg  = sum/leng;
    System.out.println(avg);
    
    if(leng%2==0) {
    	 for(int i=0;i<leng;i++)
    		 sum1=sum1+number[i];
    		 System.out.println(sum1/leng);
     }
     else{
    	 for(int i=0;i<leng;i++) {
    		 sum2=sum2+number[i];
    		 }
     System.out.println(sum2/leng);
     
     }
	}

}
