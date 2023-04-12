
public class AverageOfArray1 {

	public static void main(String[] args) {
    int []number= {10,20,30,40,50,60};
    int leng = number.length;
    int sum=0;
    for(int i=0;i<leng;i++) {
    	sum=sum+number[i];
    }
    int avg = sum/leng;
    System.out.println(avg);
    if(leng%2==0) {
    	int numpos1 = leng/2;
    	int numpos2 = numpos1+1;
    	int avg1 = (number[numpos1-1]+number[numpos2])/2;
    	System.out.println(avg1);
    }
    else {
    	int numpos1=leng/2;
    	int avg2=number[numpos1];
    	System.out.println("avg2"+" "+ avg2);
    }
	}

}
