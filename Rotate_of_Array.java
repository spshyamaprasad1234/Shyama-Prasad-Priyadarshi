import java.util.Scanner;
public class Rotate_of_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		int A[]=new int[n];
		System.out.println("Enter the elements of Array ");
		
		for(int i=0;i<A.length;i++) {
			A[i]=sc.nextInt();
			
		}
		System.out.println("the array is");
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
		System.out.println("enter the k pos to rotate");
		int k=sc.nextInt();
		for(int j=0;j<k;j++) {
		
		
  int temp=A[n-1];
  for(int i=n-1;i>0;i--) {
	  A[i]=A[i-1];
  } 
  A[0]=temp;
	}
System.out.println("arranged element are");
for(int i=0;i<n;i++) {
	System.out.print(A[i]+" ");
}

	}

}
