/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.ext4j.taglib.tag.repeater;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import javax.servlet.jsp.JspException;
import net.sourceforge.ext4j.taglib.tag.repeater.RepeaterTag;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RepeaterTagEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RepeaterTag repeaterTag0 = new RepeaterTag();
      int int0 = repeaterTag0.doStartTag();
      assertEquals(0, int0);
  }
}
