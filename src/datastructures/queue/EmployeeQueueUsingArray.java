package datastructures.queue;

import datastructures.Employee;

import java.util.NoSuchElementException;

public class EmployeeQueueUsingArray {

    private int front;

    private int back;

    private Employee[] employeesQueue;

    public EmployeeQueueUsingArray(int capacity){
        employeesQueue = new Employee[capacity];
    }

    public void add(Employee employee){
        if (back == employeesQueue.length ){
            Employee[] newArray = new Employee[2 * employeesQueue.length];
            System.arraycopy(employeesQueue, 0, newArray, 0, employeesQueue.length);
        }
        employeesQueue[back] = employee;
        this.back++;
    }

    public void remove(){
        employeesQueue[front] = null;
        front++;
    }

    public Employee peek(){
        if (employeesQueue.length == 0){
            throw new NoSuchElementException();
        }
        return employeesQueue[front];
    }

    public void printQueue() {

//        Arrays.stream(employeesQueue).forEach(employee -> System.out.println(employee));
        int i = 0;
            for (Employee employee : employeesQueue) {
               while (i<=back){
                System.out.println(employee);
                   i++;
            }

        }
    }


}
