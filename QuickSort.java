class QuickSort {
	public static void main(String args[]) {
		int arr[] = {3,1,56,45,78,67};
		System.out.println("Before Sorting");
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println("After Sorting");
		QuickSort.quickSort(arr,0,(arr.length-1));
		for(int i:arr) {
			System.out.println(i);
		}
	}
	public static void quickSort(int arr[], int low, int high) {
		if (low <= high) {
			int p = QuickSort.partition(arr, low, high);
			QuickSort.quickSort(arr, low, p-1);
			QuickSort.quickSort(arr, p+1, high);
		}
	}
	public static int partition(int arr[], int low, int high){
		//Here choosing pivot as the rightmost element
		int pivot = arr[high];
		//starting i as -1;
		int i = low-1;
		for(int j=low;j<=high;j++) {
			if(arr[j]<pivot){
				//increment i before swapping i and j's values
				i = i+1;
				QuickSort.swap(arr,i,j);
			}
		}
		//finally swap arr[i+] with arr[high]
		QuickSort.swap(arr,i+1,high);
		//element as (i+1) which was the pivot is now at its correct position 
		return (i+1);
	}
	public static void swap(int arr[], int index1, int index2) {
		int temp;
		temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}

