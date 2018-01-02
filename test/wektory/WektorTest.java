/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wektory;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author defrag
 */
public class WektorTest {
    
    public WektorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of dodawanie method, of class Wektor.
     */
    @Test (expected = java.lang.NullPointerException.class)
    public void testDodawanie() throws Exception {
        System.out.println("dodawanie");
        Wektor drugi = null;
        Wektor instance = null;
        Wektor expResult = null;
        Wektor result = instance.dodawanie(drugi);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
