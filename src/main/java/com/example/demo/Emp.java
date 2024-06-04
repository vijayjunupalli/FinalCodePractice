package com.example.demo;

public class Emp {

    private int age;
    private String gender;

    public Emp(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
