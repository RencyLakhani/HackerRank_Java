package org.example.demo;


import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}


class Checker_order implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o2.getCgpa() != o1.getCgpa()) {
            return Double.compare(o2.getCgpa(), o1.getCgpa());
        } else if(!o2.getFname().equals(o1.getFname())){
            return o1.getFname().compareTo(o2.getFname());
        }else {
            return Integer.compare(o1.getId(), o2.getId());
        }
    }
}


public class sort_demo_compratitor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        Checker_order checker_ = new Checker_order();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
            testCases--;
        }
        studentList.sort(new Checker_order());

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
