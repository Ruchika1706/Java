class SelectionSort {
	public static void main(String args[]){
		int arr[] = {3,4,5,1,2,9,8,7,6};
		for(int i=0;i<arr.length;i++){
			int min = arr[i];
			int index = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<min){
					min = arr[j];
					index = j;
				}
			}
			/* swap the values at index i with index 'index' having minimum value*/
			int temp;
			temp = arr[i];
			arr[i] = min;
			arr[index] = temp;
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
