package com.zipcodewilmington.singlylinkedlist;


import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {

    int size = 0;
    Node head;
    Node tail;
    int index = 0;


    public SinglyLinkedList() {}


    public void add(String item) {
        if(head == null){
            head = new Node(item);
            head.setIndex(0);
            tail = head;
        }else {
            Node nextNode = new Node(item);
            tail.setNext(nextNode);
            tail = nextNode;
            tail.setIndex(size-1);
        }
        size++;
    }

    public Node next(){
        return next();
    }

    public Boolean hasNext(){
        return next() != null;
    }


    public int size(){
        return size;
    }

    public String get(int index){
        return null;
    }




    private class Node {
        private String item;
        private Node next;
        private int index = 0;



            Node(String item) {
            this.item = item;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setIndex(int index) {
            this.index = index;
        }
    }
}

