

public class Recursion {

	public static void main(String[] args) {
		
			num(1);
	}

	
	static void num(int n) {
		
		if(n==5) {
			System.out.print(5);
			return;
		}
		System.out.println(n);
		
		num(n+1);
		
	
	}
}
