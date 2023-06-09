package datastructures.linkedList.singly;

import datastructures.Employee;

public class EmployeeSinglyLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
//        removedNode.setNext(null); Not needed
        return removedNode;
    }


    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertInMiddle(Employee newEmployee, Employee employeeAfterWhichToBeInserted){

        EmployeeNode currentEmployee = head;

        while (currentEmployee != null){

            if (currentEmployee.getEmployee() == employeeAfterWhichToBeInserted){
                EmployeeNode newEmployeeNode = new EmployeeNode(newEmployee);
                EmployeeNode tempNode = currentEmployee.getNext();
                currentEmployee.setNext(newEmployeeNode);
                newEmployeeNode.setNext(tempNode);
                size++;
            }
            currentEmployee = currentEmployee.getNext();

        }
        if (currentEmployee == null){
            System.out.println(employeeAfterWhichToBeInserted + " : Not Found");
        }


    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
