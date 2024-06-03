package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CigarPartyTest {

    /*
     * When squirrels get together for a party, they like to have cigars. A squirrel party is successful
     * when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case
     * there is no upper bound on the number of cigars. Return true if the party with the given values is
     * successful, or false otherwise.
     */

    private CigarParty cigars;

    @Before
    public void setUp(){
        cigars = new CigarParty();
    }

    @Test
    public void cigarPartyAbove60AndBelow40OnWeekdayShouldReturnFalse(){

       Assert.assertFalse(cigars.haveParty(30, false));
       Assert.assertFalse( cigars.haveParty(65, false));

    }

    @Test
    public void cigarPartyMoreThan40CigarsOnWeekendShouldReturnTrue(){
        Assert.assertTrue(cigars.haveParty(42, true));
        Assert.assertTrue( cigars.haveParty(90, true));
    }

    @Test
    public void cigarPartyLessThan40OnWeekendShouldReturnFalse(){
        Assert.assertFalse(cigars.haveParty(30, true));
        Assert.assertFalse( cigars.haveParty(12, true));
    }

    @Test
    public void cigarPartyBoundaryTest(){
        Assert.assertTrue(cigars.haveParty(40, false));
        Assert.assertTrue( cigars.haveParty(60, false));
        Assert.assertTrue(cigars.haveParty(40, true));
        Assert.assertFalse(cigars.haveParty(39, false));
        Assert.assertFalse( cigars.haveParty(61, false));
    }

    @Test
    public void cigarPartyExceptionCase(){
        Assert.assertFalse(cigars.haveParty(-10, true));

    }







}
