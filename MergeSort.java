class MergeSort {
	public static void main(String args[]) {
		int arr[] = {3,4,5,1,2,8,7,6,10,9};
		MergeSort.mergeSort(arr,0,(arr.length-1));
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void mergeSort(int arr[], int low, int high) {
		if(low < high) {	
			int mid = (high+low)/2;
			MergeSort.mergeSort(arr,low,mid);
			MergeSort.mergeSort(arr,mid+1,high);
			MergeSort.merge(arr,low,mid,high);
		}
	}
	public static void merge(int arr[], int low, int mid, int high) {
		int l[] = new int[mid-low+1];
		int r[] = new int[high-mid];
		for(int y=0;y<l.length;y++) {
			l[y] = arr[low+y];
		}
		for(int y=0;y<r.length;y++) {
			r[y] = arr[mid+1+y];
		}
		int p = 0, q = 0;
		int i = low;
		while((p < l.length) && (q < r.length)) {
			if(l[p] <= r[q] ) {
				arr[i] = l[p];
				p++;
			} else {
				arr[i] = r[q];
				q++;
			}
				i++;
		}
		while(p < l.length) {
			arr[i] = l[p];
			i++;
			p++;
		}
		while(q<r.length) {
			arr[i] = r[q];
			i++;
			q++;
		}
	}
}
