import java.util.Arrays;
class GFG
{
	public static void main(String[] args)
	{
		final int[] arr = { 47, 21, 10, 15, 22, 50,
							31, 48, 101, 99, 55 };
		new GFG().sort(arr);

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	//Metoda që e kryen punën e kërkimit
	public void sort(int array[])
	{
		for (int i = 1; i < array.length; i++)
		{
			int x = array[i];

			// Gjetja e lokacionit për të insertuar elementet
			// Duke përdorur kërkimin binar
			int j = Math.abs(
				Arrays.binarySearch(array, 0,
									i, x) + 1);

			// Lëvizja e vargut për një pozitë djathtas
			System.arraycopy(array, j,
							array, j + 1, i - j);

			// Vendosja e elementit në pozitën e duhur
			array[j] = x;
		}
	}
}
