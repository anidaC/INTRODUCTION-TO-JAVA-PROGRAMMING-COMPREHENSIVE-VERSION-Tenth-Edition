/*
 * (Area and perimeter of a rectangle) Write a program that displays the area and
 * perimeter of a rectangle with the width of 4.5 and height of 7.9 using the following
 * formula:
 * area = width * height
 * perimeter = 2 * (width + height)
 *
 */
public class Exercise_09_AreaAndPerimeterOfARectangle {

	public static void main(String[] args) {
		
		double width = 4.5;
		final double height = 7.9;
		
		double area = width * height;
		double perimeter = 2 * (width + height);
		
		System.out.println("Area of the rectangle is " + area);
		System.out.println("Perimeter of the rectangle is " + perimeter);

	}

}
