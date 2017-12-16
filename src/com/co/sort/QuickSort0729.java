/**
 * 
 */
package com.co.sort;

public class QuickSort0729 {

	public static void main(String[] args) {
		int[] target = {22,45,12,1,5,7,98,34,678,321,1,4,6,9,0,5,124};
        QuickSort(target,0,target.length-1);
        for(int i = 0;i< target.length;i++){
        	System.out.print(target[i] + " ");
        }
	}
	
     static void QuickSort(int[] arr,int left,int right){
    	int pivot =partion(arr,left,right);
    	if(left<pivot-1) QuickSort(arr,left,pivot-1);
    	if(right>pivot) QuickSort(arr,pivot,right);
    	
     }
    
     static int partion(int[] arr,int left,int right){
    	int pivot = arr[(left+right)/2];
    	while(left<=right){
    		while(arr[left]<pivot) left++;
    		while(arr[right]>pivot) right--;
    		if(left<=right){
    			swap(arr,left,right);
    			left++;
    			right--;
    		}
    	}
    	return left;
       } 
    
     static void swap(int[] arr,int left,int right){
    	int temp = arr[left];
    	arr[left] =arr[right];
    	arr[right] = temp;
    }

}