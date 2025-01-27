package com.arun.dsa.others;


import java.util.Comparator;

public class ComparatorDemo implements Comparator {

    @Override 
    public int compare(Object O1, Object O2) {
       Collection.Employee e1 = (Collection.Employee)O1;
       Collection.Employee e2 = (Collection.Employee)O2;

       if(e1.getSalary() < e2.getSalary()) {
           return 1;

       } else if(e1.getSalary() > e2.getSalary()) {
           return -1;
       } else {
           return 0;
       }
    }
}
