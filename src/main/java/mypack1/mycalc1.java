package mypack1;

public class mycalc1 {
	public int add(int a, int b) {
		return a + b;
	}
	public int subtract(int a, int b) {
		return a -b;
	}
	public int multiply(int a, int b) {
		return a * b;
	}
	public int divide(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("Division by zero is not allowed.");
		}
		return a/b;
	}
	
	public int modulus(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("modulus by Zero is not allowed.");
			
		}
		return a % b;
	}
 
	public double power(double a, double b) {
		return Math.pow(a, b);
	}


	public static void main(String[] args) {
 
		mycalc1 mycalc1 = new mycalc1();

		int a = 10;
		int b = 5; 
		double c = 2; 
		double d = 3;

System.out.println("Addition: " + a + " + " + b + " = " + mycalc1.add(a,b));
System.out.println("Subtraction: " + a + " - " + b + " = " + mycalc1.subtract(a, b));
System.out.println("Multiplication: " + a + " * " + b + " = " + mycalc1.multiply(a, b));
System.out.println("Division: " + a + " / " + b + " = " + mycalc1.divide(a, b));
System.out.println("Modulus: " + a + " % " + b + " = " + mycalc1.modulus(a, b));
System.out.println("Power: " + c + " ^ " + d + " = " + mycalc1.power(c, d));

	}

}
