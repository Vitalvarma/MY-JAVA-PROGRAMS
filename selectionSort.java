class selectionSort{
	public static void SelectionSort(int[] arr,int n){
		for(int i = 0;i<n-1;i++){
			int min_id = i;
			for(int j=i+1;j<n;j++){
				if(arr[min_id]>arr[j]){
					min_id = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_id];
			arr[min_id] = temp;
		}
	}
	public static void main(String args[]){
		int arr[] = {6,3,7,8,1,9};
		int n = arr.length;
		System.out.println("ARRAY ELEMENTS BEFORE SORTING: ");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]);
		SelectionSort(arr,n);
		System.out.println();
		System.out.println("ARRAY ELEMENTS AFTER SORTING: ");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]);
		System.out.println(arr);
	}
}
