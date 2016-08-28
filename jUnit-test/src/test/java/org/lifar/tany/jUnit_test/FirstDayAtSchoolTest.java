package org.lifar.tany.jUnit_test;

import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
@Ignore
public class FirstDayAtSchoolTest
{
    /**
     * Create the test case
     *
     * @param testName
     *            name of the test case
     */
    FirstDayAtSchool school = new FirstDayAtSchool();
    String[] bag1 = { "Books", "Notebooks", "Pens" };
    String[] bag2 = { "Books", "Notebooks", "Pens", "Pencils" };

    @Test
    public void testPrepareMyBag() {
        System.out.println("Inside testPrepareMyBag()");
        assertArrayEquals(bag1, school.prepareMyBag());
    }
    

    @Test
    public void testAddPencils() {
        System.out.println("Inside testAddPencils()");
        assertArrayEquals(bag2, school.addPencils());
    }
}
