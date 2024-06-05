package com.karka.dataclasses;

public class Student{
    public String name;
    public String age;
    public String mobile;
    public String location;
    public String gender;
    
    public String getCSV(){
        return this.name+ "," + this.age + "," + this.gender + "," + this.mobile + "," + this.location;

    }
    
}