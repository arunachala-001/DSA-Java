package com.arun.dsa.others;

import java.util.*;
import java.util.stream.Collectors;

public class Collection {

    static class Employee {
        String name;
        long salary;

        public Employee(String name, long salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public long getSalary() {
            return this.salary;
        }
        public void setSalary(long salary) {
            this.salary = salary;
        }

        public String toString() {
            return "name : "+ name+", salary : "+salary;
        }
    }

    public static void main(String[] args) {
        Employee emp_1 = new Employee("Arun", 50000);
        Employee emp_8 = new Employee("Arun", 50000);
        Employee emp_9 = new Employee("Arun", 50000);
        Employee emp_10 = new Employee("Arun", 50000);
        Employee emp_2 = new Employee("Chandra", 90000);
        Employee emp_3 = new Employee("Dhanush", 30000);
        Employee emp_6 = new Employee("Dhanush", 30000);
        Employee emp_7 = new Employee("Dhanush", 30000);
        Employee emp_4 = new Employee("Bala", 40000);
        Employee emp_5 = new Employee("Bharath Kumar", 80000);

        List<Employee> EMP = new ArrayList<Employee>();
        EMP.add(emp_1);
        EMP.add(emp_2);
        EMP.add(emp_3);
        EMP.add(emp_4);
        EMP.add(emp_5);
        EMP.add(emp_6);
        EMP.add(emp_7);
        EMP.add(emp_8);
        EMP.add(emp_9);
        EMP.add(emp_10);

        System.out.println("------------------Find Max Count-----------------");
        Map<String, Long> collect = EMP.stream()
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        Optional<String> maxAttempt = collect.entrySet().stream()
                        .max(Map.Entry.comparingByValue())
                                .map(m -> m.getKey());

        if(maxAttempt.isPresent()) {
            String Name = maxAttempt.get();

            Optional<Employee> first = EMP.stream()
                    .filter(e -> e.getName().equals(Name))
                    .findFirst();
            first.ifPresent(f -> System.out.println(f.getName()));
        }

        System.out.println("---------------------------------------------------");
        EMP.stream()
                .sorted((e1,e2) -> Long.compare(e1.getSalary(), e2.getSalary()))
                .forEach(System.out::println);


        ComparatorDemo cd = new ComparatorDemo();
        Collections.sort(EMP, cd);

        EMP.stream()
                .skip(1)
                .limit(1)
                .forEach(System.out::println);



        //Max and Min value
//        List<Integer> al = new ArrayList<Integer>();
//        al.add(10);
//        al.add(8);
//        al.add(20);
//        al.add(1);
//        al.add(5);
//
//      int max_value = Collections.max(al);
//        System.out.println(max_value);

    }




}
