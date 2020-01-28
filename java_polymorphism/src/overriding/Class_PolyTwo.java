package overriding;

public class Class_PolyTwo extends Class_PolyOne {
	
		public static void addmethod (int credit1,int credit2) {
			
			addmethod(credit1, credit2);
		
		int credit = credit1 - credit2 ;
			
		System.out.println("credit2 is qual to class2 -" + credit);
		
		
	}

}
