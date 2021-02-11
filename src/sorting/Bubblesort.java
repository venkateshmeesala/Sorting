package sorting;
//Java program for implementation of Bubble Sort 
class Bubblesort 
{ 
	void bubblesort(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i < n-1; i++) 
			for (int j = 0; j < n-i-1; j++) 
				if (arr[j] > arr[j+1]) 
				{ 
					// swap arr[j+1] and arr[j] 
					int temp = arr[j]; 
					arr[j] = arr[j+1]; 
					arr[j+1] = temp; 
				} 
	} 

	/* Prints the array */
	void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 

	// Driver method to test above 
	public static void main(String args[]) 
	{ 
		Bubblesort ob = new Bubblesort(); 
		int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
		ob.bubblesort(arr); 
		System.out.println("Sorted array"); 
		ob.printArray(arr); 
	} 
} 

