package org.classworks;

import java.util.ArrayList;
import java.util.List;

public class Sample {
    private String name;
    private int age;
    private double salary;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return '{'+
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                "} ";
    }

    public Sample(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;

    }

        public static void main(String[] args) {
            Sample sample1 = new Sample("BMB", 25, 24000);
            Sample sample2 = new Sample("PMB", 25, 36000);
            Sample sample3 = new Sample("JK", 25, 345000);
            Sample sample4 = new Sample("Rk", 25, 54600);

            List<Sample> employee = new ArrayList<>();
            employee.add(sample1);
            employee.add(sample2);
            employee.add(sample3);
            employee.add(sample4);
            System.out.println("^%&^&&&&&&&&&&&&&&&&&&&$$$$$$$$$$$$$%^");
            System.out.println(employee.toString());


        }
}

