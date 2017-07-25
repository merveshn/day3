package tr.org.linux.kamp.maxmin;
import java.util.Random;


public class MaxMin {

	private static Random rand=new Random();
	private static int bound = 10;
	private static int[] array = new int[bound];
	
	
	public static void main(String[] args) {
		generateArray();
		printArray();
		int indexMax= findMax();
		int indexMin=findMin();
		System.out.println(indexMax);
		float avg=findAvg(indexMax,indexMin);
		System.out.println("Average is: " + avg);
		
	}
	
	
	public static void generateArray() {
		int item;
		for(int i=0;i<array.length;i++) {
			item=rand.nextInt(10);	
			array[i]=item;
		}
	}
	
	
	public static int findMax() {
		int index=0;
		for(int i=1;i<array.length-1;i++) {
			if(array[index]<array[i]) 
				index=i;
			
		}
		return index;
	}
	
	public static int findMin() {
		int index=0;
		for(int i=1;i<array.length-1;i++) {
			if(array[index]>array[i]) 
				index=i;
			
		}
		return index;
	}
	
	
	public static float findAvg(int max,int min) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			if(i==max || i==min) continue;
			else{
				sum+=array[i];
			}
			
		}
		return (float)sum/(array.length-2);
		
	}
	
	public static void printArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}
		System.out.println();
	}

}
