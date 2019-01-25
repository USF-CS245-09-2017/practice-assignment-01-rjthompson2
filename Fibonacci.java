public class Fibonacci{
	public int total;
	public int fibonacci (int n, String type){
		if (type.equals("iterative")){
			return fibonacci_iterative(n);
		}
		else if(type.equals("recursive")){
			return fibonacci_recursive(n);
		}
		else{
			return 0;
		}
	}
	public int fibonacci_iterative(int n){
		int s1 = 0;
		int s2 = 1;
		int s3;
		if(n ==0 || n==1){
			return n;
		}
		n = n-1;
		while(n > 0){
			s3 = s2;
			s2 = s2 + s1;
			s1 = s3;
			n--;
		}
		return s2;

	}
	public int fibonacci_recursive(int n){
		if (n == 1 || n == 0){
			return n;
		}
		this.total = fibonacci_recursive(n-1) + fibonacci_recursive(n-2);
		return this.total;

	}

}