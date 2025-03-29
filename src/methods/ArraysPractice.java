package methods;

public class ArraysPractice {

	public static void main(String[] args) {
		int[] a = new int[4];
		a[0] = 10;
		a[1] = 20;
		a[2] =44;
		a[3] = 55;
		//a[4]= 56; ArrayIndexOutOfBoundsException
		System.out.println(a[3]);
		
		
		
		int[] b = {10,30,40,33,44,55,44,33,33,33,4,3,4,3,4,66,4,56};
		System.out.println(b.length);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}

}
