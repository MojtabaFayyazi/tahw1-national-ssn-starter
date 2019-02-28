/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ir.ac.kntu.style;

import ir.ac.kntu.NationalIDDetector;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 26
 * @author mhrimaz
 */
public class SolutionTest {
    static {
        System.err.println("$$$GRADER$$$ | { type:\"MSG\" , key:\"TOTAL\" , value:35, priority:1  }  | $$$GRADER$$$");
    }
    @Test
    public void testValid() {
        assertTrue(NationalIDDetector.isValidID("0082817091"));
        assertTrue(NationalIDDetector.isValidID("0018942512"));
        
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:15 , reason:\"Test Passed.\" } | $$$GRADER$$$" );
    }

    
    @Test
    public void testInvalid() {
        assertFalse(NationalIDDetector.isValidID("9324873")); 
        assertFalse(NationalIDDetector.isValidID("9652487332323233")); 
        assertFalse(NationalIDDetector.isValidID("96873")); 
        assertFalse(NationalIDDetector.isValidID("0018932512")); 
        assertFalse(NationalIDDetector.isValidID("00001")); 
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:5 , reason:\"Test Passed.\" } | $$$GRADER$$$" );
    }
    
    @Test
    public void guardNull() {
        assertFalse(NationalIDDetector.isValidID(null)); 
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:3 , reason:\"Test Passed.\" } | $$$GRADER$$$" );
    }
    
    @Test
    public void guardEmpty() {
        assertFalse(NationalIDDetector.isValidID(""));
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:3 , reason:\"Test Passed.\" } | $$$GRADER$$$" );
    }
}
