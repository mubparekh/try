/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.ext4j.taglib.bo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sourceforge.ext4j.taglib.bo.RequestParam;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestRequestParam {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RequestParam requestParam0 = new RequestParam("");
      int int0 = requestParam0.getTotalValues();
      assertEquals(0, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      RequestParam requestParam0 = new RequestParam("");
      requestParam0.setName("");
      assertEquals(0, requestParam0.getTotalValues());
  }

  @Test
  public void test2()  throws Throwable  {
      RequestParam requestParam0 = new RequestParam("");
      String string0 = requestParam0.getName();
      assertEquals("", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      RequestParam requestParam0 = new RequestParam("Could not parse value \"");
      requestParam0.addValue("");
      int int0 = requestParam0.getValue(0, (-848));
      assertEquals(1, requestParam0.getTotalValues());
      assertEquals((-848), int0);
  }

  @Test
  public void test4()  throws Throwable  {
      RequestParam requestParam0 = new RequestParam("");
      int int0 = requestParam0.getValue(0, 0);
      assertEquals(0, int0);
  }

  @Test
  public void test5()  throws Throwable  {
      RequestParam requestParam0 = new RequestParam("");
      requestParam0.addValue("");
      int int0 = requestParam0.getValue(962, 962);
      assertEquals(1, requestParam0.getTotalValues());
      assertEquals(962, int0);
  }

  @Test
  public void test6()  throws Throwable  {
      RequestParam requestParam0 = new RequestParam("Could not parse value \"");
      requestParam0.addValue("");
      int int0 = requestParam0.getValue((-1), 1894);
      assertEquals(1, requestParam0.getTotalValues());
      assertEquals(1894, int0);
  }
}