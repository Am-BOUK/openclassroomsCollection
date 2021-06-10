package quiz;

public class Xyvalues {

	public static int transform(int a, int b) {
	    int x = a + b;
	    int y = x * 2;
	    return y;
	}

	public static void main(String[] args) {
	    int x = 1;
	    int y = 10;
	    x = transform(x, y);
	    System.out.println("x = "+x+" y= "+y);
	    y = transform(y, x);
	    System.out.println("x = "+x+" y= "+y);
	}

}
