package de.tum.in.ase.eist;

import java.time.LocalDate;
import java.util.List;

public class Lecturer extends Person {

    private List<Course> courseList;
    private int employeeId;

    public Lecturer(String firstName, String lastName, LocalDate birthDate) {
        super(firstName, lastName, birthDate);
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public void printPersonalInformation() {
        System.out.printf("Lecturer: %s %s, %s, %d", getFirstName(), getFirstName(), getBirthDate(), employeeId);
    }

}

