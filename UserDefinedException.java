class MyException extends Exception{
	private int detail;
	
	MyException(int a){
		detail=a; 
	}
	
	public String toString(){
		return "MyException["+detail+"]";
	}
}

class UserDefinedException{
	static void compute(int a) throws MyException{
		if(a>10){
			throw new MyException(a);
		}
		System.out.println("Normal Exit");
	}
	
	public static void main(String args[]){
		try{
			compute(1);
			compute(20);
		}
		catch(Exception e){
			System.out.println("Caught: "+ e);
		}
	}
}
