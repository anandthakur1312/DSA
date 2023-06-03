package datastructures.stack;

import datastructures.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStackUsingAL {

    private Employee top;
    private int stckSize;

    List<Employee> stack = new ArrayList<>();


    public void push(Employee employee){
        stack.add(employee);
        top = employee;
    }

    public void pop(){
        if (stack.isEmpty()){
            System.out.println("Stack is empty");
        }
        else {
            stack.remove(stack.size()-1);
        }
    }

    public void peek(){
        if (stack.isEmpty()){
            System.out.println("Stack is empty");
        }
        else {
            System.out.println(stack.get(stack.size()-1));
        }
    }


    public void printall(){
        System.out.println(stack);
    }





    public Employee getTop() {
        return top;
    }

    public void setTop(Employee top) {
        this.top = top;
    }


}
