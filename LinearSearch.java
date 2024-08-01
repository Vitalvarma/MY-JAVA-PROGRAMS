
class LinearSearch{
        public static int searchlinear(int arr[],int key){
        	for(int i = 0;i<arr.length;i++){
        		if(key==arr[i])
        			return i + 1;
        	}
        	return -1;
        }
	public static void main(String args[]){
		int arr[] = {5,2,8,4,1,7};
		int key = 8;
		int n = searchlinear(arr,key);
		if(n==-1)
			System.out.println("NOT FOUND");
		else
		   	System.out.println("FOUND AT INDEX " + n);
		
	}
}
