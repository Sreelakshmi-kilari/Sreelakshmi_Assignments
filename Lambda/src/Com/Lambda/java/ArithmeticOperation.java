package Com.Lambda.java;

	@FunctionalInterface
	interface Arithmetic {
	 
	    int operation(int a, int b);
	 
	}
	public class ArithmeticOperation {
		
		public static void main(String[] args) {
		
			Arithmetic addition = (a, b) -> (a + b);
			System.out.println("Addition ->" +addition.operation(20,4));
			
			Arithmetic subtract = (a, b) -> (a - b);
			System.out.println("Subtract ->" +subtract.operation(20,4));
			
			Arithmetic multiplication = (a, b) -> (a * b);
			System.out.println("Multiplication ->" +multiplication.operation(20,4));
			
			Arithmetic divison = (a, b) -> (a / b);
			System.out.println("Divison ->" +divison.operation(20,4));
			}
	   }

	

