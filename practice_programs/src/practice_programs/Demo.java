package practice_programs;

public class Demo {
public static void main(String[] args) {
	int[]arr= {1,2,2,3,4};
	for(int i=0;i<=arr.length-1;i++) {
		System.out.println(arr[i]);
	}
	int temp[]= new int[arr.length];
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=i+1;j<=arr.length-1;j++) {
			if(arr[i]!=arr[j]) {
				temp[j]=arr[j];
			}
			System.out.println(temp[j]);

		}

	}
}
}
