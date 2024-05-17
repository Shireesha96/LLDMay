package com.scaler.siri.lld1;

public class Student {
    public String name;
    public int age;
    public String gender;
    public String address;


    public void printName()
    {
        System.out.println("Name: " + name);
    }

    public void printAge(){
        System.out.println("Age: " + age);
    }

    public void printGender(){
        System.out.println("Gender: " + gender);
    }

    public static void main(String[] args){
        Student s = new Student();
        s.name = "Kunal";
        s.age = 29;
        s.gender = "Male";

        Student s2 = new Student();
        s2.name = "Shireesha";
        s2.age = 27;
        s2.gender = "Female";

        s.printName();
        s.printAge();
        s.printGender();

        s2.printName();
        s2.printAge();
        s2.printGender();
    }
}

