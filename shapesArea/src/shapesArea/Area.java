package shapesArea;

public class Area {

	public static void main(String[] args) {
		int side = 10;
		int length = 15;
		int breadth = 20;
		int height = 25;
		
		int AreaofSquare = side*side;
		System.out.println("Area of Square is :" +AreaofSquare);
		
		int AreaofRectangle = length*breadth;
		System.out.println("ARea of Rectangle is:" +AreaofRectangle);
		
		double AreaofTriangle = 0.5* breadth * height;
		System.out.println("Area of triangle is:" +AreaofTriangle);
		
		int AreaofParallelogram = side*height;
		System.out.println("Area of Parallelogram is:" +AreaofParallelogram);

	}

}
