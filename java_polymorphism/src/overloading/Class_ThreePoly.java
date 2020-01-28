	package overloading;

	public class Class_ThreePoly extends Class_TwoPoly{
		
		public static void main(String[] args, int value1, int value2, int value3) {
		
			addmethod(value1, value2, value3);
			
			addmethod (12,45,74);
		}
		
		public static void addmethod (int value1) {
			 
			int value = value1;
			
			System.out.println("value3 is number of credit-" + value);
			
					}
	}