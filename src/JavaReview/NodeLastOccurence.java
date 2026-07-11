package JavaReview;

import java.util.Scanner;

public class NodeLastOccurence {
    Node head;

    void insertBeg(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void insertEnd(int data) {
        Node temp=head;
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void DeleteLastOccurrence(int key) {

        if(head == null){
            return;
        }

        Node temp = head;
        Node LastNode = null;

        while(temp != null){

            if(temp.data == key){
                LastNode = temp;
            }

            temp = temp.next;
        }

        // Key not found
        if(LastNode == null){
            return;
        }

        // Last occurrence is head
        if(LastNode == head){
            head = head.next;
            return;
        }

        // Find node before LastNode
        temp = head;

        while(temp.next != LastNode){
            temp = temp.next;
        }

        temp.next = LastNode.next;
    }
         void traverse(){
        Node temp=head;
           while(temp!=null){
               System.out.print(temp.data+" ");
               temp=temp.next;

           }
         }
    public static  void main(String args[]){
        NodeLastOccurence obj=new NodeLastOccurence();
        obj.insertBeg(10);
        obj.insertBeg(20);
        obj.insertEnd(30);
        obj.insertEnd(20);
        obj.insertEnd(40);
        obj.DeleteLastOccurrence(20);
        obj.traverse();
    }

     }

