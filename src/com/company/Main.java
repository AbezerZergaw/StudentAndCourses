package com.company;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {


    public static Scanner input = new Scanner(System.in);
    public static ArrayList<Teacher> myTeacher = new ArrayList<>();
    public static ArrayList<Course> myCourse = new ArrayList<>();
    public static ArrayList<Person> myStudent = new ArrayList<>();

    public static void main(String[] args) {

        mainMenu();

    }
            //giving option to chose
    public static void mainMenu() {
        Person person = new Person();
        System.out.println("Choose your options\n" +
                "1.Add Student\n" +
                "2.Add Teacher\n" +
                "3.Add Course\n" +
                "4.Show Student\n" +
                "5.Show Teacher\n" +
                "6.Show Course ");
        int menu = input.nextInt();
        input.nextLine();
        if (menu == 1) {
            addStudent();
        } else if (menu == 2) {
            addTeacher();
        } else if (menu == 3) {
            addCourse();
        } else if (menu == 4) {
            showStudent();
        } else if (menu == 5) {
            showTeacher();
        } else if (menu == 6) {
            showCourse();
        } else
            System.out.println("Invalid input");


    }
// adding student
    public static void addStudent() {

        String firstName, lastName, emailAddress, courseName, option;
        int idNum;

        do {

            Student student = new Student();

            System.out.println("Enter your First name");
            firstName = input.nextLine();
            student.setFirstName(firstName);
            System.out.println("Enter your Last name");
            lastName = input.nextLine();
            student.setLastName(lastName);
            System.out.println("Enter your email");
            emailAddress = input.nextLine();
            student.setEmailAddress(emailAddress);
            System.out.println("Enter your Id");
            idNum = input.nextInt();
            student.setIdNum(idNum);
            input.nextLine();
            System.out.println("Do you want to add student?");

            myStudent.add(student);
            option = input.nextLine();

        } while (option.equalsIgnoreCase("yes"));
        //go back to the menu
        mainMenu();
    }


    //adding course
    public static void addCourse() {

        String courseName, option;
        int courseId;

        do {
            Course course = new Course();
            System.out.println("Enter course ID");
            courseId = input.nextInt();
            course.setCourseId(courseId);
            input.nextLine();
            System.out.println("Enter course name");
            courseName = input.nextLine();
            course.setCourseName(courseName);

            myCourse.add(course);
            System.out.println("Do you want to add course?");
            option = input.nextLine();

        } while (option.equalsIgnoreCase("yes"));
        mainMenu();

    }
//adding teacher
    public static void addTeacher() {

        Teacher teacher = new Teacher();

        String firstName, lastName, emailAddress, courseName, option;
        int idNum;

        do {
            System.out.println("Enter your First name");
            firstName = input.nextLine();
            teacher.setFirstName(firstName);
            System.out.println("Enter your Last name");
            lastName = input.nextLine();
            teacher.setLastName(lastName);
            System.out.println("Enter your email");
            emailAddress = input.nextLine();
            teacher.setEmailAddress(emailAddress);
            System.out.println("Enter your Id");
            idNum = input.nextInt();
            teacher.setIdNum(idNum);
            input.nextLine();
            System.out.println("Do you want to add Teacher?");
            option = input.nextLine();
            myTeacher.add(teacher);

        } while (option.equalsIgnoreCase("yes"));
        mainMenu();
    }
//show all the students
    public static void showStudent() {

        for (Person student : myStudent) {
            System.out.println("Fist Name: " + student.getFirstName() + "\nLast Name:" + student.getLastName() + "\nE-email:" + student.getEmailAddress()
                    + "\nStudent ID: " + student.getIdNum() + "\n");

        }
        mainMenu();

    }
    //show all the courses
    public static void showCourse() {

        for (Course course : myCourse) {
            System.out.println("Course ID:" + course.getCourseId() + "\nCourse name: " + course.getCourseName()+"\n");
        }
        mainMenu();
    }
    //show all the teacher
    public static void showTeacher() {
        for (Teacher teacher : myTeacher) {
            System.out.println("Fist Name: " + teacher.getFirstName() + "\nLast Name:" + teacher.getLastName() + "\nE-email:" + teacher.getEmailAddress()
                    + "\nStudent ID: " + teacher.getIdNum() + "\n");


        }
        mainMenu();
    }
}