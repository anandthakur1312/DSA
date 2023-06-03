package datastructures.stack;

import datastructures.Employee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EmployeeStackUsingLL {

    private Employee top;

    LinkedList<Employee> list = new LinkedList<>();

    public void push(Employee employee){
        list.addFirst(employee);
    }

    public void pop(){
        list.removeFirst();
    }

    public void peek(){
        System.out.println(list.getFirst());
    }

    public void printAll(){
        System.out.println(list);
    }

    public Employee getTop() {
        return top;
    }

    public void setTop(Employee top) {
        this.top = top;
    }


}
