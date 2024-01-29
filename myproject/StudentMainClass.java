package com.myproject;

import java.util.Scanner;

public class StudentMainClass {
	public static void main(String[] args) {
		//creating instance of Student crud class 
		StudentCRUD studentcrud = new StudentCRUD();
		Scanner sc = new Scanner(System.in);
		//Menu driven program for CRUD operation on Student Details
		while (true) {
			System.out.println("\n-------Menu-------");
			System.out.println("1. Add Student");
			System.out.println("2. Update Student");
			System.out.println("3. Delete Student");
			System.out.println("4. Display Student");
			System.out.println("Choose option:");
			int choice=sc.nextInt();
			if(choice==1) {
				//call to method addStudent through reference name
				studentcrud.addStudent();
			}else if(choice==2) {
				//call to method updateStudent through reference name
				studentcrud.updateStudent();
			}else if(choice==3) {
				//call to method deleteStudent through reference name
				studentcrud.deleteStudent();
			}else if(choice==4) {
				//call to method displayStudent through reference name
				studentcrud.displayStudents();
			}
			
		}
		
	}
	
}
