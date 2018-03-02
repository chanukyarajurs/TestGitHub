package training;

public class BubbleSort {
public static void main(String args[]){
	int[] arr = {10,5,1,2,9,4};

	//Before Sorting
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
	
	
	int arrLen = arr.length;
	int temp =0;
	for(int i=0;i<arrLen;i++){
		for(int j=1;j<(arrLen); j++){
			if(arr[j-1] > arr[j]){
				temp = arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
	System.out.println();
	//After Sorting
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
	
}
}
