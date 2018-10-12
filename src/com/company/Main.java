package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
public static  Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        mainMenu();

    }


    public  static void mainMenu(){

        System.out.println("Choose your options\n" +
                "1.Add Student\n" +
                "2.Add Teacher\n" +
                "3.Add Course\n" +
                "4.Show Course ");
        int menu = input.nextInt();
        input.nextLine();
        if(menu==1){
            addStudent();
        }else if(menu==2){
            addTeacher();
        }else if(menu==3){
            addCourse();
        }else if(menu==4){

        }else
            System.out.println("Invalid input");


    }

    public static void addStudent() {

        String firstName, lastName, emailAddress, courseName, option;
        int idNum;
        HashSet<Person> myProfile = new HashSet<>();
        HashSet<Teacher> myTeacher = new HashSet<>();
        HashSet<Course> myCourse = new HashSet<>();
        Course course = new Course();
        Student student = new Student();

        do {
            System.out.println("Enter your First name");
            firstName = input.nextLine();
            System.out.println("Enter your Last name");
            lastName = input.nextLine();
            System.out.println("Enter your email");
            emailAddress = input.nextLine();
            System.out.println("Enter your Id");
            idNum = input.nextInt();
            input.nextLine();
            System.out.println("Do you want to add student?");

            student = new Student(firstName, lastName, emailAddress, idNum);
            myProfile.add(student);
            option= input.nextLine();

        }while(option.equalsIgnoreCase("yes"));

        }
        public static void addTeacher(){
            HashSet<Teacher> myTeacher = new HashSet<>();

            Teacher teacher = new Teacher();

            String firstName, lastName, emailAddress, courseName, option;
            int idNum;

            do {
                System.out.println("Enter your First name");
                firstName = input.nextLine();
                System.out.println("Enter your Last name");
                lastName = input.nextLine();
                System.out.println("Enter your email");
                emailAddress = input.nextLine();
                System.out.println("Enter your Id");
                idNum = input.nextInt();
                input.nextLine();
                teacher = new Teacher(firstName,lastName,emailAddress,idNum);
                option = input.nextLine();


                System.out.println("Do you want to add Teacher?");

            }while(option.equalsIgnoreCase("yes"));

        }

        public static void addCourse(){

            HashSet<Course> myCourse = new HashSet<>();


            String courseName,option;
            int courseId;

            do {
                System.out.println("Enter course ID");
                courseId = input.nextInt();
                input.nextLine();
                System.out.println("Enter course name");
                courseName = input.nextLine();

                Course course = new Course(courseName, courseId);
                myCourse.add(course);

                option = input.nextLine();

                System.out.println("Do you want to add Teacher?");

            }while(option.equalsIgnoreCase("yes"));

        }
    }