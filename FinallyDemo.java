class FinallyDemo{
	static void procA(){
		try{
			System.out.println("inside procA");
			throw new RuntimeException("demo");
		}
		finally{
			System.out.println("proc A's finally");
		}
	}
	
	static void procB(){
		try{
			System.out.println("inside procB");
			return;
		}
		finally{
			System.out.println("proc B's finally");
		}
	}
	
	static void procC(){
		try{
			System.out.println("inside procC");
		}
		finally{
			System.out.println("proc C's finally");
		}
	}
	public static void main(String args[]){
		try{
			procA();
		}
		catch(Exception e){
			System.out.println("Exception caught");
		}
		procB();
		procC();
	}
}
