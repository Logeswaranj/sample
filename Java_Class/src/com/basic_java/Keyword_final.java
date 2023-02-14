package com.basic_java;

public final  class Keyword_final {
	/*final can be used in class level , method level and variable level 
	 * final class cannot be interface 
	 * final method cannot be override
	 * final variable value cannot be changed 
	 */
 static final int a =143;
 
	public static final  void child() {
		System.out.println("child");
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		child();
	}
}
