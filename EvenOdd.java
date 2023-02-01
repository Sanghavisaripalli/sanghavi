package Array;

public class EvenOdd {

	public static void main(String[] args) {
		int arr[]= {3,6,8,2,22,25,28,18,19};
		System.out.println("The even numbers");
for(int i=0;i<arr.length;i++) {
	if(arr[i]%2==0) {
		System.out.println(arr[i]);	
	}
}
System.out.println("The odd numbers");
for(int i=0;i<arr.length;i++) {
	if(arr[i]%2!=0) {
		System.out.println(arr[i]);
	}
	
}
	}

}
