package com.co.sort;

public class QuickSort0728 {

	public static void main(String[] args) {
		int[] target = {22,45,12,1,5,7,98,34,678,321,1,4,6,9,0,5,124};
		quickSort(target,0,target.length-1);
		
		for(int i = 0; i < target.length;i++){
			System.out.print(target[i] + " ");
		}
	}
	public static void quickSort(int[] arr,int left,int right){
		int index = partition(arr,left,right);
		if(left < index - 1){
			quickSort(arr,left,index - 1);
		}
		if(index < right){
			quickSort(arr,index,right);
		}
	}
	
	public static int partition(int arr[],int left,int right){
		int pivot = arr[(left + right)/2];
		while(left <= right){
			while (arr[left] < pivot)
				left++;
			while(arr[right] > pivot)
				right--;
			if(left <= right){
				swap(arr,left,right);
				left++;
				right--;
			}
		}
		return left;
	}
	
	public static void swap(int[] lst, int start,int end){
		int temp;
		temp = lst[start];
		lst[start] = lst[end];
		lst[end] = temp;
		return ;
	}

}
