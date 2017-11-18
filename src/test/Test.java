package test;

public class Test {
	public void QuickSort(int[] arr, int low, int high){
		
		if (low < high){
			int flag = partition(arr, low ,high);
			QuickSort(arr, low, flag-1);
			QuickSort(arr, flag+1, high);
		}
	}
	
	public void swap(int[] arr, int x, int y){
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	
	public int partition(int[] arr, int low, int high){
		int flag = arr[low];
		while (low < high){
			while (low<high && arr[high]>flag){
				high--;
			}
			swap(arr, low, high);
			while (low<high && arr[low]<flag){
				low++;
			}
			swap(arr, low, high);
		}
		return low;
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		int[] arr = {1,22,3,11,44};
		t.QuickSort(arr, 0, arr.length-1);
		for (int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
}
