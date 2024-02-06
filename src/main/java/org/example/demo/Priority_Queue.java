package org.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.Collectors;

class Priorities {


    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        List<Student> studentList = new ArrayList<>();
        for(String s: events)
        {
            if(!s.equals("SERVED"))
            {
                s.replace("ENTER","");
                String[] splited = s.split("");
                for(int i=0 ; i< splited.length ; i++)
                {
                    Student stud = new Student(splited[i],Double.parseDouble(splited[i+1]),Integer.parseInt(splited[i+2]));
                    studentList.add(stud);
                }
            }
            else{
                List<Double> marksList = studentList.stream()
                        .map(Student::getCgpa)
                        .toList();


// Now, marksList contains the marks of all students

            }
        }

        return studentList;
    }
}


public class Priority_Queue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getFname());
            }
        }
    }
}
