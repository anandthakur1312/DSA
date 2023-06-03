package datastructures;

import datastructures.linkedList.doubly.EmployeeDoublyLinkedList;
import datastructures.linkedList.singly.EmployeeSinglyLinkedList;
import datastructures.queue.EmployeeQueueUsingArray;
import datastructures.stack.EmployeeStackUsingAL;
import datastructures.stack.EmployeeStackUsingLL;

public class Main {

    private static Employee janeJones = new Employee("Jane", "Jones", 123);
    private static Employee johnDoe = new Employee("John", "Doe", 4567);
    private static Employee marySmith = new Employee("Mary", "Smith", 22);
    private static Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

    private static Employee anandt = new Employee("Anand", "Thakur", 234041);

    public static void main(String[] args) {
//        singlyLinkedListOperations();
//        doublyLinkedListOperations();
//        stackOperations();
//        stackUsingLLOperations();

        queueUsingArrayOperations();

    }

    private static void queueUsingArrayOperations() {

        EmployeeQueueUsingArray queueUsingArray = new EmployeeQueueUsingArray(10);

        queueUsingArray.add(janeJones);
        queueUsingArray.add(johnDoe);
        queueUsingArray.add(marySmith);

        queueUsingArray.peek();
        queueUsingArray.printQueue();
    }

    private static void stackUsingLLOperations() {
        EmployeeStackUsingLL stack = new EmployeeStackUsingLL();
        stack.push(janeJones);
        stack.push(johnDoe);

        stack.printAll();

        System.out.print("Peek : ");
        stack.peek();

        stack.pop();
        stack.push(mikeWilson);
        stack.printAll();
        stack.peek();

        stack.printAll();

    }

    private static void stackOperations() {

        EmployeeStackUsingAL stack = new EmployeeStackUsingAL();
        stack.push(janeJones);
        stack.push(johnDoe);

        stack.printall();

        System.out.print("Peek : ");
        stack.peek();

        stack.pop();
        stack.push(mikeWilson);
        stack.printall();
        stack.peek();

        stack.printall();
    }


    private static void doublyLinkedListOperations(){

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);

        list.addToEnd(mikeWilson);
        list.addToEnd(anandt);

        list.printList();
        list.removeFromFront();
        list.printList();
        list.removeFromEnd();
        list.printList();

    }











    private static void singlyLinkedListOperations() {
        EmployeeSinglyLinkedList list = new EmployeeSinglyLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println(list.getSize());

        list.printList();

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();

        Employee thakur = new Employee("Anand", "Thakur", 50540);
        list.insertInMiddle(thakur, johnDoe);
        System.out.println(list.getSize());

        list.printList();
    }
}
