package Stream1;

import java.util.Arrays;

public class StremEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum+=arr[i];
			}
		}
		System.out.println(sum);
		int[] arr2= {1,2,3,4,5,6,7};
		int sum2=Arrays.stream(arr2).filter(n->n%2==0).sum();
		System.out.println(sum2);
		

	}

}
