package sort;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] arr = new int[]{3,2,4,1,5,9,7,8,6};
		quickSort(arr,0,arr.length-1);
		for(int i : arr){
			System.out.print(i+" ");
		}
	}
	
	public static void quickSort(int[] arr,int left,int right){
		int i = left;
		int j = right;
		if(left>right)return;
		//获取基准数
		int temp = arr[left];
		
		while(i!=j){
			while(arr[j]>=temp&&j>i)j--;
			while(arr[i]<=temp&&i<j)i++;
			if(i<j){
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}
		}
		arr[left] = arr[i];
		arr[i] = temp;
		quickSort(arr,left,i-1);
		quickSort(arr,i+1,right);
	}

}
