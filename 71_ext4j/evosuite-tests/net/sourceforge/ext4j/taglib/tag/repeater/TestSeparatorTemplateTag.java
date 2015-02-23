/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.ext4j.taglib.tag.repeater;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import net.sourceforge.ext4j.taglib.tag.repeater.RepeaterTag;
import net.sourceforge.ext4j.taglib.tag.repeater.SeparatorTemplateTag;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestSeparatorTemplateTag {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SeparatorTemplateTag separatorTemplateTag0 = new SeparatorTemplateTag();
      RepeaterTag repeaterTag0 = new RepeaterTag();
      separatorTemplateTag0.setParent((Tag) repeaterTag0);
      int int0 = separatorTemplateTag0.doStartTag();
      assertEquals(1, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      SeparatorTemplateTag separatorTemplateTag0 = new SeparatorTemplateTag();
      try {
        separatorTemplateTag0.doStartTag();
        fail("Expecting exception: JspException");
      } catch(JspException e) {
        /*
         * Must be used inside a RepeaterTag.
         */
      }
  }
}
