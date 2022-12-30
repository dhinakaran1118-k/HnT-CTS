package com.lamda;

public class ExamCourses {

	// TODO Auto-generated method stub
	private int courseId;
	private String courseName;
	private String courseTeacher;
	private int durationInMonths;
	private float fee;

	ExamCourses(int courseId, String courseName, String courseTeacher, int durationInMonths, float fee) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseTeacher = courseTeacher;
		this.durationInMonths = durationInMonths;
		this.fee = fee;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void setCourseTeacher(String courseTeacher) {
		this.courseTeacher = courseTeacher;
	}

	public void setDurationInMonths(int durationInMonths) {
		this.durationInMonths = durationInMonths;
	}

	public void setFee(float fee) {
		this.fee = fee;
	}

	public int getCourseId() {
		return courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public String getCourseTeacher() {
		return courseTeacher;
	}

	public int getDurationInMonths() {
		return durationInMonths;
	}

	public float getFee() {
		return fee;
	}

	@Override
	public String toString() {
		return "ExamCourses [courseId=" + courseId + ", courseName=" + courseName + ", courseTeacher=" + courseTeacher
				+ ", durationInMonths=" + durationInMonths + ", fee=" + fee + "]";
	}

	/*@Override
	public String toString() {
		return courseId + " " + courseName + " " + courseTeacher + " " + durationInMonths + " " + fee;
	}*/

}
