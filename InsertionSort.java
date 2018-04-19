class InsertionSort {
	public static void main(String args[]) {
		int arr[] = {4,5,6,3,2,1,9,7};
		InsertionSort.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void sort(int arr[]){
		for(int i=0;i<arr.length;i++) {
			/* we assume in insertion sort that a[0] to a[i-1] is sorted and you want to insert a[i] i.e. key to its correct place*/
			int key = arr[i];
			int j = i-1;
			/* for all elements greater than key, move to their right to make space for key later*/
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
}
