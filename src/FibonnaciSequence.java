/* FibonnaciSequence.java
 * ----------------------
 * This java program prints the terms of the Fibonnaci Sequence 
 * up to 10,000.
 * 
 */
public class FibonnaciSequence {
	
	private static final int MAX_TERM_VALUE = 10000;
	
	public static void main(String[] args) {
		
		int fib1 = 0;
		int fib2 = 1;
			
			
			System.out.println ("Fibonacci Sequence up to 10,000");
			
			while (fib1 < MAX_TERM_VALUE) {
				System.out.println (fib1);
				int fib3 = (fib1 + fib2);
				fib1 = fib2;
				fib2 = fib3;
			}
		
	}

}


