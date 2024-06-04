package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FinderTest {

    /*
     * Given a List of Integers, return the largest value. If the list is empty, return null.
     */

    private Finder finds;

    @Before
    public void setUp(){
        finds = new Finder();
    }


    @Test
    public void largestValueInEmptyList(){
        List<Integer> lists = new ArrayList<>();
        Assert.assertNull(finds.findLargest(lists));
    }

    @Test
    public void largestValueWithOne(){
        List<Integer> lists = new ArrayList<>(7);

    }





}
