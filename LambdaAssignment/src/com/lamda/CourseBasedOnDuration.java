package com.lamda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CourseBasedOnDuration {

	public static void main(String[] args) {
        List<ExamCourses> courseList = new ArrayList<>();
		
		courseList.add(new ExamCourses(01, "NEET",    "Alex", 8, 25000));
		courseList.add(new ExamCourses(02, "JEE",     "Max", 9, 20000));
		courseList.add(new ExamCourses(03, "CSC",     "Jhon", 11, 19000));
		courseList.add(new ExamCourses(04, "CAT",     "Chris", 12, 30000));
		courseList.add(new ExamCourses(05, "BITSAT",  "Robert", 5, 27000));
		courseList.add(new ExamCourses(06, "VITEEE",  "Jason", 6, 15000));
		courseList.add(new ExamCourses(07, "COMED-K", "Kevin", 7, 10000));
		courseList.add(new ExamCourses(8, "AMU",     "Steve", 3, 19000));
		courseList.add(new ExamCourses(9, "Manipal", "Jimmy", 4, 22000));
		courseList.add(new ExamCourses(10, "IPU-CET", "James", 10, 21500));
		
		courseList.sort(Comparator.comparing(ExamCourses::getDurationInMonths));
		courseList.forEach((list) -> System.out.println(list));
	}

}
