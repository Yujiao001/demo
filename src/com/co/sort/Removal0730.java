package com.co.sort;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * 去重排序,初步理解与运用。
 */
public class Removal0730 {

	public static void main(String[] args) {
		removal();
	}
	
	public static void removal(){
		int arr[] ={0,98,6,5,1,98,6,896,896,896,0,5,1};
		//Set的特性是没有重复元素
		//TreeSet提供自动排序功能
		Set<Integer> set =new TreeSet<Integer>(new MyComparator());
		for(int i : arr){
		set.add(i);
		}

	    /*Iterator<Integer> iter = set.iterator();
	    while(iter.hasNext()){
	    	int result = (int) iter.next();
	    	System.out.print(result + " ");
	    }*/

	    for(Iterator<Integer> iter =set.iterator();iter.hasNext();){
	    	System.out.print(iter.next() + " ");
	    }
	    
	}
}

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);//降序排列
	}
}
