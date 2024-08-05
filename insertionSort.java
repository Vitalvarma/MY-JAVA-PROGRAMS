class insertionSort{
	public static void InsertionSort(int[] arr,int n){
		for(int i=1;i<n;i++){
			int temp = arr[i];
			int j = i - 1;
			while(j>=0 && arr[j]>temp){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}
	public static void main(String args[]){
		int arr[] = {6,3,7,8,1,9};
		int n = arr.length;
		System.out.println("ARRAY ELEMENTS BEFORE SORTING: ");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]);
		InsertionSort(arr,n);
		System.out.println();
		System.out.println("ARRAY ELEMENTS AFTER SORTING: ");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]);
		System.out.println(arr);
	}
}
