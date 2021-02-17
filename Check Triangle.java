import java.util.Scanner;

public class Calculator_Test {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		int firstA = 0, secondA = 0, thirdA = 0;
		int sumAngle = 0, triangles = 0;
		int rightAngle = 0, equal2Angle = 0, equalTri = 0;
		
		for (int i = 0; i < 1; i++) {
			System.out.print("Enter first angle: ");
			firstA = s.nextInt();	// First angle input
			System.out.print("Enter second angle: ");
			secondA = s.nextInt(); // Second angle input
			System.out.print("Enter third angle: ");
			thirdA = s.nextInt(); // Second angle input
			
			sumAngle = firstA + secondA + thirdA; // Sum of angles
			
			if (firstA > 0 && secondA > 0 && thirdA > 0) { // checking that the angle are positive
				if (sumAngle == 180) { // checking if the angles makes triangle
					triangles++;
					if (firstA == 90 || secondA == 90 || thirdA == 90) { // checking if its right-angled triangle
						rightAngle++;
						if (firstA == secondA && thirdA != firstA || secondA == thirdA && firstA != secondA || thirdA == firstA && secondA != thirdA) { // checking if its an isosceles triangle
							equal2Angle++;
						}
					}
					else if (firstA == secondA && thirdA != firstA || secondA == thirdA && firstA != secondA || thirdA == firstA && secondA != thirdA) { // checking if its an isosceles triangle
						equal2Angle++;
					} else if (firstA == secondA && secondA == thirdA && thirdA == firstA) { // checking if its equilateral triangle
						equalTri++;
					}
				}
			}
		}
		System.out.println("Triangles: "+triangles);
		System.out.println("Right-angled triangle: "+rightAngle);
		System.out.println("An isosceles triangle: "+equal2Angle);
		System.out.println("Equilateral triangle: "+equalTri);
	}

}
