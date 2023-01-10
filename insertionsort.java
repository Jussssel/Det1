public class InsertionSort {
	/*Metoda për sortimin e vargut duke përdorur Insertion Sort*/
	public void sort(int arr[])
	{
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			/* Lëviz elementet [0...i-1] të vargut që janë
      më të mëdhenj se çelësi një pozitë më përpara se
      sa pozita momentale*/
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	/* Metoda ndihmëse që e shfaqë vargun me n-elemente */
	public static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}
	// Metoda kryesore
	public static void main(String args[])
	{
		int arr[] = { 12, 11, 13, 5, 6 };

		InsertionSort ob = new InsertionSort();
		ob.sort(arr);

		printArray(arr);
	}
}
