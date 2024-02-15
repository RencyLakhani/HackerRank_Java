package org.example.demo;

import java.util.*;

class Student_prio_que implements Comparable<Student_prio_que>
{
    private String name ;
    private Double cgpa;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Student_prio_que o) {
        if(o.getCgpa()>this.cgpa)
        {
            return (int) (o.getCgpa()-this.cgpa);
        }
        return  0;
    }
}
class priority_class{

    Comparator<Student_prio_que> studentComparator = Comparator
            .comparingDouble(Student_prio_que::getCgpa) // First, compare by CGPA
            .reversed() // Higher CGPA should come first
            .thenComparing(Student_prio_que::getName) // If CGPA is the same, compare by ID
            .thenComparingInt(Student_prio_que::getId); //

//    public List<Student_prio_que> getStudents(List<String> events) {
//
//    }
}
public class priority_Q_demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();
      priority_class priorities = new priority_class();
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

//        List<Student_prio_que> students = priorities.getStudents(events);

//        if (students.isEmpty()) {
//            System.out.println("EMPTY");
//        } else {
//            for (Student_prio_que st: students) {
//                System.out.println(st.getName());
//            }
//        }
    }
}
