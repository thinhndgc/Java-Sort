import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selectionSort(createList());
		insertionSort(createList());
		bubbleSort(createList());
	}
	
	public static List<Integer> createList(){
		Random rand = new Random();
		List<Integer> numberList = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			numberList.add(rand.nextInt(999));
		}
		System.out.println("List before sort:");
		showList(numberList);
		System.out.println("");
		return numberList;
	}
	
	public static void showList(List<Integer> numberList){
		for (int i = 0; i < numberList.size(); i++) {
			System.out.print(" | " + numberList.get(i));
		}
	}
	
	public static void selectionSort(List<Integer> numberList){
		int i,j;
		System.out.println("Selection sort:");
		for (j = 0; j < numberList.size(); j++) {
		    int minIndex = j;
		    for ( i = j+1; i < numberList.size(); i++) {
		        if (numberList.get(i) < numberList.get(minIndex)) {
		        	minIndex = i;
		        }
		    }

		    if(minIndex != j) {
		    	swapValues(numberList, j, minIndex);
		    }

		}
		System.out.println("List after sort:");
		showList(numberList);
		System.out.println("");
	}
	
	public static void insertionSort(List<Integer> numberList){
		int i;
		System.out.println("Insertion sort:");
		for (i = 1; i < numberList.size(); i++) {
			int j = i;
			while (j > 0 && numberList.get(j-1) > numberList.get(j)) {
				swapValues(numberList, j, j-1);
				j = j-1;
			}
		}
		System.out.println("List after sort:");
		showList(numberList);
		System.out.println("");
	}
	
	public static void bubbleSort(List<Integer> numberList){
		System.out.println("Bubble sort:");
		for (int i = 0; i < numberList.size(); i++) {
			for (int j = 1; j < numberList.size()-i; j++) {
				if (numberList.get(j-1) > numberList.get(j)) {
					swapValues(numberList, j, j-1);
				}
			}
		}
		System.out.println("List after sort:");
		showList(numberList);
		System.out.println("");
	}
	
	public static void shellSort(List<Integer> numberList){
		int z = 0;
		System.out.println("Shell sort:");
		for (Integer i : numberList) {
			for (int j = i; j < i; j++)
		    {
		        int temp = numberList.get(j);
		        for (int y = j; j >= i && numberList.get(y - i) > temp; y -= i)
		        {
		        	numberList.set(y, numberList.get(y- i));
		        	z = y;
		        }
		        numberList.set(z, temp);
		    }
		}
		System.out.println("List after sort:");
		showList(numberList);
		System.out.println("");
	}
	
	public static void combSort(List<Integer> numberList){
		
	}
	
	public static void swapValues(List<Integer> numberList, int a, int b){
		int mediateNumber;
		mediateNumber = numberList.get(a);
		numberList.set(a, numberList.get(b));
		numberList.set(b, mediateNumber);
	}
}

