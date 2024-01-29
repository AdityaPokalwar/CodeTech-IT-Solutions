package com.myproject;

import java.util.ArrayList;

public class StudentGradeSystem {
	int rollno;
	String name;
	ArrayList<Integer> marks;

// parameterized constructor
	public StudentGradeSystem(int rollno, String name, ArrayList<Integer> marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

//calculate percentage which returns double value 
	double calculatePercentage() {
		int totalmarks = 0;
		for (int mark : marks) {
			totalmarks = totalmarks + mark;
		}
		return totalmarks / marks.size();
	}

//adding grade system 
	String Grade(double percentage) {
		if (percentage >= 90) {
			return "Grade A";
		} else if (percentage >= 80) {
			return "Grade B";
		} else if (percentage >= 70) {
			return "Grade C";
		} else if (percentage >= 60) {
			return "Grade D";
		} else {
			return "Grade E";
		}

	}
}
