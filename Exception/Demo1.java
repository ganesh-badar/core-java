package Exception;

public class Demo1 {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		System.out.println(arr[0]);
		System.out.println(arr[-1]);
		System.out.println("Hello");
		System.out.println(arr[2]);

	}

}

//unchecked  or runtime exception

o/p ---> 10
   		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 6
		at Exception.Demo1.main(Demo1.java:8)
