public class Factorial{
	public int total = 1;
	public int factorial (int n, String type){
		if (type.equals("iterative")){
			return factorial_iterative(n);
		}
		else if(type.equals("recursive")){
			return factorial_recursive(n);
		}
		else{
			return 0;
		}
	}
	public int factorial_iterative(int n){
		System.out.println(n);
		if (n==0||n==1){
			return n;
		}
		this.total = 1;
		for(int i = n; i > 0; i--){
			this.total *= i;
		}
		return this.total;
	}
	public int factorial_recursive(int n){
		if (n == 1 || n == 0){
			return n;
		}
		return this.total = n * factorial_recursive(n-1);
	}
}	