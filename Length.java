import java.util.Scanner;

public class Length {
	static class length {
		void values() {
			try (Scanner scan = new Scanner(System.in)) {
				double x1, x2, y1, y2, a1, a2, b1, b2;

				System.out.println("Enter your X1 value:");
				x1 = scan.nextInt();

				System.out.println("Enter your Y1 value :");
				y1 = scan.nextInt();

				System.out.println("Enter your X2 value:");
				x2 = scan.nextInt();

				System.out.println("Enter your Y2 value:");
				y2 = scan.nextInt();
				
				System.out.println("Enter your a1 value:");
				a1 = scan.nextInt();

				System.out.println("Enter your b1 value :");
				b1 = scan.nextInt();

				System.out.println("Enter your a2 value:");
				a2 = scan.nextInt();

				System.out.println("Enter your b2 value:");
				b2 = scan.nextInt();

         
				lineComparision(x1, x2, y1, y2,a1,a2,b1,b2);
			}
		}
		void lineComparision(double a1, double a2, double b1, double b2, double x1, double x2, double y1, double y2) {
			double length1 = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
			System.out.println("the length of line1 is :" +length1);
			double length2 = Math.sqrt((b2 - b1) * (b2 - b1) + (a2 - a1) * (a2 - a1));
			System.out.println("length of a line2 : " + length2);
			
			String myStr1 = Double.toString(length1);
			String myStr2 = Double.toString(length2);
			System.out.println(myStr1.compareTo(myStr2));
			if(length1 == length2) { 
				System.out.println("The line lengths are equal");}
			else {
				System.out.println("The line lengths are not equal");}
		}
	}
	public static class LineLength {
		public static void main(String[] args) {
		length object = new length();
		object.values();// TODO Auto-generated method stub
		}
	}

}
