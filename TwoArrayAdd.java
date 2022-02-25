package ArrayProg;

public class TwoArrayAdd {

	public static void main(String[] args) {
		int [] Arr1= {10,20,30,40};
		int [] Arr2= {100,200,300,400};
		int[] arr3=new int[4];
		for(int i=0;i<Arr1.length;i++) {
			arr3[i]=Arr1[i]+Arr2[i];
		}
		for(int i=0;i<Arr1.length;i++) {
			System.out.println(arr3[i]);
		}

	}

}