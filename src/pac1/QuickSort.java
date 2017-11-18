package pac1;

import java.util.Arrays;

public class QuickSort {
	
	//交换数组中的两个位置
	public void swap(int[] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public int partition(int[] arr, int low, int high){
		int base = arr[low];
		while (low < high){
			while (low < high && arr[high] >= base){
				high--;
			}
			swap(arr,low,high);
			while (low < high && arr[low] <= base){
				low ++;
			}
			swap(arr,low,high);
		}
		return low;
	}
	
	public void quickSort (int[] arr, int low, int high){
		if (low < high){
			int mid = partition(arr, low, high);
			quickSort(arr, low, mid-1);
			quickSort(arr, mid+1, high);
		}
	}
	
	public static void main(String[] args) {
		int [] arr = {1,5,3,2,4,6,2};
		new QuickSort().quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
