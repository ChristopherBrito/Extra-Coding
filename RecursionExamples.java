// This is a code about recursion
public class RecursionExamples
{
	public static void main(String[] args) {
		int num = 10;
		int sum = findSum(num);//can be done like this or just written as findSum(num);
		System.out.println("The sum of the first " + num + " numbers is: " + sum + "\n");
		
		int a = 5;
		int b = 3;
		int result = add(a, b); //can be done like this or just written as findSum(num);
		System.out.println("The sum of " + a + " and " + b + " is " + result + "\n");
		int oresult = subtract(a, b);
		System.out.println("The difference of " + a + " and " + b + " is " + oresult + "\n");
		
		int base = 2;
		int exponent = 3;
        System.out.println(base + " raised to the power of " + exponent + " is "
        + power(base, exponent) + "\n");//prints both this print statement and the one inside 
        //the power() class

        int n = 10;
        for (int i = 0; i < n; i++){ System.out.print(fib(i) + " "); }
        System.out.println("\nThe Fibanacci series of " + n + " is " + fib(n));
        
        int x = 56;
        int y = 98;
        int gcd = gcd(x, y);
        System.out.println("\nThe greatest common denomintator is series of " + n + " is " + fib(n));
	}
	
	public static int findSum(int n) {
	    if (n == 1) return 1; //the base case, stops it from infinitly looping
	    System.out.println("n is " + n);
	    return n + findSum(n - 1);
	}
	
	public static int add(int a, int b) {
	    if(b == 0) return a; //the base case, stops it from infinitly looping
	   System.out.println("a: " + a + " b: " + b);
	   return add(a + 1, b - 1);
	}
	
	public static int subtract(int a, int b) {
	    if(b == 0) return a; //the base case, stops it from infinitly looping
	   System.out.println("a: " + a + " b: " + b);
	   return subtract(a - 1, b - 1);
	}
	
	public static int power(int base, int exponent){
	    if(exponent == 0) return 1; //the base case, stops it from infinitly looping
       System.out.println("base: " + base + " exponent: " + exponent);
       return base * power(base, exponent - 1);
	}
	
	public static int fib(int n){ // This is the Fibanacci series
	    if (n == 0) return 0; //the base case, stops it from infinitly looping
	    else if (n == 1) return 1; //the base case, stops it from infinitly looping
	    return fib(n - 1) + fib(n - 2);
	}
	public static int gcd(int x, int y){
	    if (x % y == 0) return y;
	    System.out.println("x: " + x + " y: " + y);
	    return gcd(y, x % y);
	}
	    
	    
}
