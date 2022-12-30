package com.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CourseBasedOnFee {

	public static void main(String[] args) {

		List<ExamCourses> courseList = new ArrayList<>();
		
		courseList.add(new ExamCourses(01, "NEET",    "Alex", 8, 25000));
		courseList.add(new ExamCourses(02, "JEE",     "Max", 9, 20000));
		courseList.add(new ExamCourses(03, "CSC",     "Jhon", 11, 19000));
		courseList.add(new ExamCourses(04, "CAT",     "Chris", 12, 30000));
		courseList.add(new ExamCourses(05, "BITSAT",  "Robert", 5, 27000));
		courseList.add(new ExamCourses(06, "VITEEE",  "Jason", 6, 15000));
		courseList.add(new ExamCourses(07, "COMED-K", "Kevin", 7, 10000));
		courseList.add(new ExamCourses(8, "AMU",     "Steve", 8, 11000));
		courseList.add(new ExamCourses(9, "Manipal", "Jimmy", 4, 22000));
		courseList.add(new ExamCourses(10, "IPU-CET", "James", 9, 21500));
		
		

		//System.out.println(courseList);

		//courseList.sort(Comparator.comparing(ExamCourses::getFee));
		//System.out.println(courseList);
		
		courseList.sort(Comparator.comparing(ExamCourses::getFee).reversed());
		//System.out.println(courseList);
		
		courseList.forEach((list) -> System.out.println(list));

		/*
		Map<Float, List<ExamCourses>> list = new HashMap<>();
		list = courseList.stream().collect(Collectors.groupingBy(ExamCourses::getFee));
		System.out.println(list);
		System.out.println(list);
        */
	}

}
