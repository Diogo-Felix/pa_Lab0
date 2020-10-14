package com.pa;

import com.pa.Person;

public class Lab0Main {

    public static void main(String[] args){
        Person p1 = new Person(1, "Manuel");
        Person p2 = new Person(2,"Diogo");
        Person p3 = new Person(3, "António");

        try {
            Group group = new Group(p1);
            group.addMember(p2);
            group.addMember(p3);
        } catch(GroupException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\n");
    }
}
