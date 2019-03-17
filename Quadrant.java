public class QuadrantFinder {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter an x");
		double ex = console.nextDouble();
		System.out.println("Enter an y");
		double why = console.nextDouble();
		quadrant(ex, why);

	}
	public static void quadrant(double x, double y) {
		//#16 tells quadrant
		if (x > 0 && y > 0) {
			System.out.println("1");
		}
		if (x < 0 && y > 0) {
			System.out.println("2");
		}
		if (x < 0 && y < 0) {
			System.out.println("3");
		}
		if (x > 0 && y < 0) {
			System.out.println("4");
		}
	}
}
