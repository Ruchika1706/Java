class LinearSearch {
	public static void main(String args[]) {
		int arr[] = {3,4,1,2,34,56};
		int num;
		System.out.println("Enter the number you want to search in current array");
		java.util.Scanner si = new java.util.Scanner(System.in);
		num = si.nextInt();
		LinearSearch ob = new LinearSearch();
		int index = ob.search(arr,num);
		if(index!=-1)
			System.out.println("Element present at " +(index+1) + "position");
		else
			System.out.println("Element not found");
	}
	public  int search(int arr[], int num) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				return i;
			}
		}
		return -1;
	}
}
