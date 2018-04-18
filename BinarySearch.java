class BinarySearch {
	public static void main(String args[]) {
		int arr[] = {1,6,13,17,24,67};
		int num;
		System.out.println("Enter the number you want to search in current array");
		java.util.Scanner si = new java.util.Scanner(System.in);
		num = si.nextInt();
		BinarySearch ob = new BinarySearch();
		int index = ob.binSearch(arr,num,0,arr.length-1);
		if(index!=-1)
			System.out.println("Element present at " +(index+1) + "position");
		else
			System.out.println("Element not found");
	}
	public  int binSearch(int arr[], int num,int start,int end) {
		while(start<=end){
			int mid = (start+end)/2;
			if (arr[mid] == num) {
				return mid;
			} else if (arr[mid] < num ) {
   				start = mid + 1;
			} else if(arr[mid] > num) {
				end = mid-1;
			}
		}
		return -1;
	}
}
