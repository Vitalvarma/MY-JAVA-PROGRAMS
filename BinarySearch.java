
class BinarySearch{
        public static int SearchBinary(int arr[],int key,int low,int high){
        	while(high>low){
        		int mid = (low + high) / 2;
        		if(arr[mid]==key)
        			return mid;
        		else if(arr[mid]>key)
        			low = mid + 1;
        		else
        			high = mid - 1;
        	}
        	return -1;
        }
	public static void main(String args[]){
		int arr[] = {5,2,8,4,1,7};
		int key = 8;
		int low = 0;
		int high = arr.length;
		int n = SearchBinary(arr,key,low,high);
		if(n==-1)
			System.out.println("NOT FOUND");
		else
		   	System.out.println("FOUND AT INDEX " + n);
		
	}
}
