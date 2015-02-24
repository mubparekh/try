/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.ext4j.log.log4j;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sourceforge.ext4j.log.log4j.ExtrasPatternLayout;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestExtrasPatternLayout {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ExtrasPatternLayout extrasPatternLayout0 = new ExtrasPatternLayout();
      assertEquals("%m%n", extrasPatternLayout0.getConversionPattern());
  }

  @Test
  public void test1()  throws Throwable  {
      ExtrasPatternLayout extrasPatternLayout0 = new ExtrasPatternLayout("");
      assertNull(extrasPatternLayout0.getHeader());
  }
}
