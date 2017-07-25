package tr.org.linux.kamp.arrayapp;

import java.util.Random;

public class ArrayApp {

	private static Random rand = new Random();
	private static int bound = 10;
	private static int[] array = new int[bound];

	public static void main(String[] args) {
		int item = 5;

		generateArray();
		printArray();
		sortArray();
		printArray();
		boolean result = searchItem(item);

		if (result)
			System.out.println("eleman var");
		else
			System.out.println("eleman yok");

		int index= lastIndexOf(item);
		if(index!=-1) {
			
			System.out.println(item + " elemanı " + index + ". indiste bulundu.");
		}
		else 
			System.out.println(item + " elemanı bulunamadı");
	}

	public static void generateArray() {
		int item;
		for (int i = 0; i < array.length; i++) {
			item = rand.nextInt(10);
			array[i] = item;

		}

	}

	public static boolean searchItem(int item) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == item)
				return true;

		}
		return false;
	}
	
	public static int lastIndexOf(int item) {
		int i;
		for (i = (array.length-1); i >= 0; i--) {
			if(array[i]==item)
				return i;
		}
		return i;
	}

	public static void printArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}
		System.out.println();
	}

	public static void sortArray() {
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}

			}
		}
	}
}
