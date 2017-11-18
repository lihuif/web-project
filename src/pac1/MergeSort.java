package pac1;

public class MergeSort {
	public void mergersort(int[] arr, int [] temp, int left, int right){
		int mid;
		if (left < right){
			mid = (right+left)/2;
			mergersort(arr,temp,left,mid);
			mergersort(arr,temp,mid+1,right);
			merge(arr,temp,left,mid+1,right);
		}
	}

	private void merge(int[] arr, int[] temp, int left, int mid, int right) {
		int i, left_end, size, temp_pos;
		left_end = mid - 1;
		temp_pos = left;
		size = right-left+1;
		
		while ( (left<=left_end)&&(mid<=right) ){
			if (arr[left] <= arr[mid]){
				temp[temp_pos] = arr[left];
				temp_pos+=1;
				left+=1;
			}
			else{
				temp[temp_pos] = arr[mid];
				temp_pos+=1;
				mid+=1;
			}
		}
		while (left<=left_end){
			temp[temp_pos] = arr[left];
			temp_pos+=1;
			left+=1;
		}
		while (mid<=right){
			temp[temp_pos] = arr[mid];
			temp_pos+=1;
			mid+=1;
		}
		for ( i=0; i<size; i++){
			arr[right] = temp[right];
			right--;
		}
	}
	
	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		int[] arr = {1,7,3,5,34,2,12,44,2};
		int[] temp = new int[arr.length];
		int left = 0;
		int right = arr.length-1;
		ms.mergersort(arr, temp, left, right);
		for (int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}
