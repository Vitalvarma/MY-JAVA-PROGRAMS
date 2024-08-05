class bubblesort{
	public static void BubbleSort(int[] arr,int n){
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void main(String args[]){
		int arr[] = {6,3,7,8,1,9};
		int n = arr.length;
		System.out.println("ARRAY ELEMENTS BEFORE SORTING: ");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]);
		BubbleSort(arr,n);
		System.out.println();
		System.out.println("ARRAY ELEMENTS AFTER SORTING: ");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]);
		System.out.println(arr);
	}
}
