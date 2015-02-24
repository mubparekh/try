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
import net.sourceforge.ext4j.taglib.tag.ForEachTag;
import net.sourceforge.ext4j.taglib.tag.repeater.ItemTemplateTag;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestItemTemplateTag {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ItemTemplateTag itemTemplateTag0 = new ItemTemplateTag();
      ForEachTag forEachTag0 = new ForEachTag();
      itemTemplateTag0.setParent((Tag) forEachTag0);
      int int0 = itemTemplateTag0.doStartTag();
      assertEquals(1, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      ItemTemplateTag itemTemplateTag0 = new ItemTemplateTag();
      try {
        itemTemplateTag0.doStartTag();
        fail("Expecting exception: JspException");
      } catch(JspException e) {
        /*
         * Must be used inside a LoopTag.
         */
      }
  }
}
