public class Main{
	public static void main(String[] args) {
		Point<String> strPoint = new Point<String>("Anna", " Banana");
		System.out.println(strPoint);
		Point<Number> pie = new Point<Number>(3.14, 2.17);
		System.out.println(pie);
		Point huh = new Point("Hi"," Sir");
		System.out.println(huh);
		Point heh = new Point(32," Sir");
		System.out.println(heh);
	}
}
	
