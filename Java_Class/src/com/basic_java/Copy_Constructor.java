package com.basic_java;

public class Copy_Constructor {
		
		public Copy_Constructor() {//Copy  constructor 
			System.out.println("Student Mark List");
				}
		Copy_Constructor(String a, int b,int c , int d){
			String student_Name = a;
			int mark_1 = b;
			int mark_2= c ;
			int mark_3=d;
			System.out.println("1 . "+  student_Name +" Physics -"+ mark_1 +"," +"Chemistry -"+ mark_2 +","+"Maths -" + mark_3  );
			
		}
		public static void main(String[] args) {
			Copy_Constructor first_List = new Copy_Constructor();
			Copy_Constructor Second_List = new Copy_Constructor("Logan - ",50 ,80 ,98);
		Copy_Constructor Third_List =new Copy_Constructor();
		}

	}


