package es.upm.grise.profundizacion2018.tema6.course;

import com.google.java.contract.Requires;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;

public class MasterCourse extends Course {
	
	final private static double feePerCredit = 35.44;
	
	// @Requires("course.getLevel() == \"MASTER\"")
	@Requires("course.getLevel().equals(\"MASTER\")")
	public MasterCourse(CourseData course, int numRegistrations) {
		super(numRegistrations);
		this.courseData = course;
	}
	
	@Override
	public double getFee() {
		return feePerCredit * courseData.getCredits() * numRegistrations;
	}
	
}
