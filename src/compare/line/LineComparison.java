package compare.line;

import java.util.Scanner;

public class LineComparison {

	static double findLineLength() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter co-ordinates for two points:");
		
		System.out.print("Enter x1 co-ordinate value: ");
		int x1 = scanner.nextInt();
		
		System.out.print("Enter y1 co-ordinate value: ");
		int y1 = scanner.nextInt();
		
		System.out.print("Enter x2 co-ordinate value: ");
		int x2 = scanner.nextInt();
		
		System.out.print("Enter y2 co-ordinate value: ");
		int y2 = scanner.nextInt();
		
		int xValueDiff = x2 - x1;
		int yValueDiff = y2 - y1;
		
		return Math.sqrt(Math.pow(xValueDiff, 2) + Math.pow(yValueDiff, 2));

	}
	public static void main(String[] args) {
		
		System.out.println("Welcome to Line Comparison Computation Program!");
		double line1Length = findLineLength();
		double line2Length = findLineLength();
		
		if (line1Length == line2Length)
			System.out.println("Two lines are equal!");
		else if (line1Length > line2Length)
			System.out.println("Line 1 is greater than Line 2");
		else
			System.out.println("Line 2 is greater than Line 1");
		
		System.out.println("Length of a Line 1: " + line1Length);
		System.out.println("Length of a Line 2: " + line2Length);
	}
}
