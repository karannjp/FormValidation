package com.karan;

import org.springframework.stereotype.Controller;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
//import javax.validation.constraints.Size;


public class Emp {

private  String name;
    //@Pattern(regexp="^[a-zA-Z0-9]{3}",message="length must be 3 character minimum")
    @Password
    private  String pass;
    @Min(value=18, message="must be equal or greater than 18")
    @Max(value=45, message="must be equal or less than 45")
    private  int age;


    public void setName(String name) {
        this.name = name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
