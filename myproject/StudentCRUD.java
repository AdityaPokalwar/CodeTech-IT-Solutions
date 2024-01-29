package com.myproject;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentCRUD {
	ArrayList<StudentGradeSystem> students = new ArrayList<>();

	Scanner sc = new Scanner(System.in);

	// adding students information
	void addStudent() {
		System.out.println("Enter Rollno:");
		int rollno = sc.nextInt();
		System.out.println("Enter name of Student:");
		String name = sc.next();
		System.out.println("Enter number of subjects:");
		int numOfSubjects = sc.nextInt();

		// creating arraylist of marks so that can add no.s of marks of same datatype
		ArrayList<Integer> marks = new ArrayList<>();
		System.out.println("Enter marks of each Subjects:");
		for (int i = 0; i < numOfSubjects; i++) {
			marks.add(sc.nextInt());
		}
		// creating instance of StudentGradeSystem
		StudentGradeSystem student = new StudentGradeSystem(rollno, name, marks);
		students.add(student);
		System.out.println("Student added successfully.");
	}

	// updating student values
	void updateStudent() {
		// accepting roll number from user to update
		System.out.println("Enter roll number of student to update:");
		int rollNumber = sc.nextInt();
		// a for loop to iterate the entered roll no. in students list
		for (StudentGradeSystem student : students) {
			if (student.rollno == rollNumber) {

				System.out.println("Do you want to change name of Student. 1.'Yes'/2.'No':");
				int nameChange = sc.nextInt();
				// condition to check whether user want to update the name of student
				if (nameChange == 1) {
					System.out.println("Enter  new name of Student:");
					String newName = sc.next();
					student.name = newName;
					
					System.out.println("Enter new Marks");
					ArrayList<Integer> newMarks = new ArrayList<Integer>();
					for (int i = 0; i < student.marks.size(); i++) {
						newMarks.add(sc.nextInt());
					}
					student.marks = newMarks;
					System.out.println("Student updated succesfully.");
				} else if (nameChange == 2) {
					System.out.println("Enter new Marks");
					ArrayList<Integer> newMarks = new ArrayList<Integer>();
					for (int i = 0; i < student.marks.size(); i++) {
						newMarks.add(sc.nextInt());
					}
					student.marks = newMarks;
					System.out.println("Student updated succesfully.");
				} else {
					System.out.println("Invalid number entered.");
				}

			}else {
				System.out.println("Student Not found.");
			}
		}
	}

	// to delete the data entered by user
	void deleteStudent() {
		System.out.println("Enter Roll number of student to delete:");
		int rollnoToDelete = sc.nextInt();

		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).rollno == rollnoToDelete) {
				students.remove(i);
				System.out.println("Student deleted succesfully.");
			}
		}
	}

	// to display the details of students
	void displayStudents() {
		System.out.println("Student Details:");
		for (StudentGradeSystem student : students) {
			double percentage = student.calculatePercentage();

			System.out.println("Rollno:" + student.rollno + "|" + "Name:" + student.name + "|" + "Marks:"
					+ student.marks + "|" + "Percentage:" + student.calculatePercentage() + "%" + "|"
					+ student.Grade(percentage) + "|");

		}
	}

}