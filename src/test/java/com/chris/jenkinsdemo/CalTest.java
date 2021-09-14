package com.chris.jenkinsdemo;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalTest {
     private JenkinsCalc calculator = new JenkinsCalc();

     @Test
     public void testSum() {
          assertEquals(5, calculator.sum(2, 3));
     }
}
