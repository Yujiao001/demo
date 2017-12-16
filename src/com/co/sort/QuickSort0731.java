package com.co.sort;

/*
 * 冒泡排序算法实现
 */
public class QuickSort0731 {

	public static void main(String[] args) {
		int arr[] = {9,2,55,99,63,3,0,2,-5};
		mySort(arr);
		bubbleSort(arr);
	}
	
	
    public static void mySort(int[] arr){
		for(int i = 0;i < arr.length-1;i++){
			for(int j = i+1;j < arr.length;j++){
				int temp = 0;
				if(arr[i] > arr[j]){
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("******myTest******");
		for(int x : arr){
			System.out.print(x + " ");
		}
		System.out.println();
    }
	
    public static void bubbleSort(int[] numbers){
	    int temp = 0;
	    int size = numbers.length;
	    for(int i = 0 ; i < size-1; i++){
	        for(int j = 0 ;j < size-1-i ; j++){
	            if(numbers[j] > numbers[j+1]){
	                temp = numbers[j];
	                numbers[j] = numbers[j+1];
	                numbers[j+1] = temp;
	            }
	        }
	    }
	    System.out.println("******OnLine******");
	    for(int x : numbers){
			System.out.print(x + " ");
		}
    }
}
