package tr.org.linux.kamp.arrayswap;

public class ReverseArray {

	
	public static void main(String[] args) {
		
		int[] array ={1,2,3,4,5};
		printArray(array);
		reverse(array);
		printArray(array);
		
	}
	
	public static int[] reverse(int[] array) {
		int temp;
		for(int i=0,j=array.length-1 ;i<(array.length/2);i++,j--) {
			
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
		}
		return array;
		
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}
		System.out.println();
	}
}
