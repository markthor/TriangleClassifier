package logic;

public class Classifier {
	/**
	 * Determines whether the lengths can form a legal triangle.
	 */
	public static boolean isLegalTriangle(double a, double b, double c) {
		if(a <= 0 || b <= 0 || c <= 0)
			return false;
		if(a >= b + c || b >= a + c || c >= a + b)
			return false;
		
		return true;
	}
	
	public static Type classify(double a, double b, double c) {
		if(isEquilateral(a, b, c))
			return Type.EQUILATERAL;
		if(isIsosceles(a, b, c))
			return Type.ISOSCELES;
		
		return Type.SCALENE;
	}
	
	private static boolean isEquilateral(double a, double b, double c) {
		return a == b && a == c;
	}
	
	private static boolean isIsosceles(double a, double b, double c) {
		return a == b || a == c || b == c;
	}
}
