package bitwise_operator;

public class Main {
public static void main(String args[]){
	int[] arr= {8,4,1,9,6,2};
	
	for(int i=0;i<arr.length;i++) {
		int max=arr[i];
		for(int j=0;j<arr.length;j++) {
			if(arr[j]>max) {
				if(arr[j]<max)
					max=arr[j];
				
				
			}
		} 
		
		System.out.println(arr[i]+"->"+max);
	}
}
}
