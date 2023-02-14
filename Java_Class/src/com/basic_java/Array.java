package com.basic_java;

public class Array {
	public void array() {
int marksone [] = new int [5];
		
		marksone[0]=12;
		marksone[2]=22;
		marksone[4]=32;
		
		System.out.println(marksone[2]);
		System.out.println(marksone[4]);
	}
	public void arraytwo() {
		int marks[]= {1,2,34,55,66,77,88};
		
		System.out.println(marks[4]);
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
	}
	public void arraystring() {
		String bag[]= {"books","pen","pencil"};
		for (int b = 0; b < bag.length; b++) {
			System.out.println(bag[b]);
		}
		
	}
	public static void main(String[] args) {
		
		Array data = new Array();
		data.array();
		data.arraytwo();
		data.arraystring();
		
	}

}
