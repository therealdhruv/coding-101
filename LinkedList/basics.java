package LinkedList;

public class basics {

    private node head;
    private node tail;
    private int size;


    // constructor --> used to set some default values
    public basics () {
        this.size = 0;
    }

    // method to insert at first
    public void insertAtfirst (int val) {
        node temp = new node(val);
        temp.next = head;
        head = temp;
        
        // basic conditions ...
        if (tail == null) {
            tail = head;
        }
        
        size += 1;
        
    }

    // insert using recursion
    public void insertRec (int val, int index) {
        
    }



    
    // method to insert at last
    public void insertAtLast (int val) {
        // what if the linked list is empty
        if (tail == null) {
            insertAtfirst(val);
            return;  // this will return from here only and will not execute anything here on
        }
        node temp = new node(val);
        tail.next = temp;
        tail = temp;
        size ++ ;
    }
    
    // method to insert at a particular index

    public void insertAtIndex (int val, int index) {

        if (index == 0) {
            insertAtfirst(val);
            return;
        }
        if (index == size) {
            insertAtLast(val);
            return;
        }


        node temp = head;
        for (int i = 1; i < index; i++) {   // start from 1 as 0 is head itself
            temp = temp.next;
        }

        // now that temp is at that index at which we wanna insert ... let's make that node which will be 
        // inserted
        node x = new node(val, temp.next);
        temp.next = x;

    } 






    // method to display the linked list
    public void display () {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    
    private class node {

        private int value;
        private node next;
        
        // constructor 
        public node (int value) {
            this.value = value;
        }
        
        public node (int value, node next) {
            this.value = value;
            this.next = next;
        }

    }


    public static void main(String[] args) {
        basics list = new basics();
        list.insertAtfirst(23);
        list.insertAtfirst(26);
        list.insertAtfirst(2);
        list.insertAtfirst(1);
        list.insertAtfirst(100);
        list.insertAtfirst(723);
        list.insertAtLast(300);
        list.insertAtIndex(420, 7);

        

        list.display();


    }
        

}