package org.classworks.NagendrasClassWorkDatabase;

import java.sql.Timestamp;

public class Customer {
    private String name;
    private String email;
    private int age;
    private String address;
    private int marks;
    private Timestamp doe;

    public Customer(String name, String email, int age, String address, int marks, Timestamp doe) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
        this.marks = marks;
        this.doe = doe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Timestamp getDoe() {
        return doe;
    }

    public void setDoe(Timestamp doe) {
        this.doe = doe;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", email=" + email + ", age=" + age + ", address=" + address + ", marks="
                + marks + ", doe=" + doe + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Customer other = (Customer) obj;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        return true;
    }
}