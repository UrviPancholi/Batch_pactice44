	package overriding;

	public class Class_PolyFour extends Class_PolyThree {
		

		private static final int credit1 = 0;
		private static final int credit2 = 0;

		public static void main (String [] argds) {
			
			addmethod(credit1, credit2);
		}
	
		public static void addmethod (int credit1,int credit2) {
		
		int credit = credit1 / credit2 ;
			
		System.out.println("credit4 is qual to class4 -" + credit);
		
		
	}

}
