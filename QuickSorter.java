public class QuickSorter {

	public static void quickSort(int[] arr, int lo, int hi) {
		
		int pivott = 0;
		if (lo < hi) {  
			pivott = partition(arr, lo, hi);
			quickSort(arr, lo, pivott - 1);
			quickSort(arr, pivott + 1, hi);
		}
	}
	
	public static int partition(int[] arr, int lo, int hi) {
		
		int pivot = arr[hi];
		int i = lo - 1;
		int temp;
		for (int j = lo; j <= hi - 1; j++) {
			if (arr[j] < pivot) {
				i = i + 1;
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		if (arr[hi] < arr[i + 1]) {
			temp = arr[hi];
			arr[hi] = arr[i + 1];
			arr[i + 1] = temp;
		}
		
		return i + 1;
	}
}