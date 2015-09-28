package controller;

import logic.Classifier;
import logic.Type;

import org.apache.commons.lang3.math.NumberUtils;

public class Executor {
	public static void main(String[] args) {
		System.out.println(String.format("The triangle is of type: %s", validateAndClassify(args)));
	}
	
	public static Type validateAndClassify(String[] args) {
		if(!isInputValid(args)) {
			System.exit(1);
		}
		
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		
		if(!Classifier.isLegalTriangle(a, b, c)) {
			System.err.println("The lengths provided cannot form a legal triangle.");
			System.exit(1);
		}
		
		return Classifier.classify(a, b, c);
	}
	
	public static boolean isInputValid(String[] args) {
		if(args.length != 3) {
			System.err.println("The program needs 3 inputs to run successfully; the lengths of the sides of the triangle.");
			return false;
		}
		
		for(int i = 0; i < 3; i++) {
			if(!NumberUtils.isParsable(args[i])) {
				System.err.println(String.format("The argument %s is not a parsable number.", args[i]));
				return false;
			}
		}
		
		return true;
	}
}
