package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateFashionTest {

    /*
     * You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness
     * of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result
     * getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very
     * stylish, 8 or more, then the result is 2 (yes). With the exception that if either of you has style of
     * 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).
     */

    private DateFashion style;

    @Before
    public void setup(){
        style = new DateFashion();
    }




    @Test
    public void eitherPeopleVeryStylishReturnYes(){
        Assert.assertEquals(2, style.getATable(8,5));
        Assert.assertEquals(2, style.getATable(5,10));
    }

    @Test
    public void eitherPeopleStyleLessThen2ReturnNo(){
        Assert.assertEquals(0, style.getATable(2,5));
        Assert.assertEquals(0, style.getATable(8,1));
    }

    @Test
    public void bothAreAbove2Under8ReturnsMaybe() {
        Assert.assertEquals(1, style.getATable(4,4));
        Assert.assertEquals(1, style.getATable(5,5));
        Assert.assertEquals(1, style.getATable(6,6));

    }
    @Test
    public void bothPeopleFashionBoundaryCases(){
        Assert.assertEquals(2, style.getATable(8,8));
        Assert.assertEquals(1, style.getATable(7,7));
        Assert.assertEquals(1, style.getATable(3,3));
        Assert.assertEquals(0, style.getATable(2,2));
    }
    @Test
    public void bothPeopleFashionEdgeCases() {
        Assert.assertEquals(0, style.getATable(1,10));
    }





}
