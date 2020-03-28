package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void addTest(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.add("Hello");
        list.add("World");
        Integer expected = 2;
        Integer actual = list.size;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeTest(){

    }

    @Test
    public void containsTest(){

    }

    @Test
    public void findTest(){

    }

    @Test
    public void sizeTest(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.add("Hello");
        list.add("Hello");
        int expected = 2;
        int actual = list.size;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getTest(){

    }

    @Test
    public void copyTest(){

    }

    @Test
    public void sortTest(){

    }

}
