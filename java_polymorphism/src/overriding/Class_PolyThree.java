package overriding;

	public class Class_PolyThree extends Class_PolyTwo {
	
	public static void main(String[] args, int credit2, int credit1) {
		 
		addmethod (65, 82); 
		
		Class_PolyTwo obj = new Class_PolyThree (); 
		
		obj.addmethod(credit1, credit2);
		
	
	} 
	
	public static void addmethod (int credit1,int credit2) {
		
		int credit = credit1 * credit2 ;
			
		System.out.println("credit3 is qual to class3 -" + credit);
		
		
	}

}
