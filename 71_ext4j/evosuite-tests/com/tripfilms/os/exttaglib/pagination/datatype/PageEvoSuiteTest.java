/*
 * This file was automatically generated by EvoSuite
 */

package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.tripfilms.os.exttaglib.pagination.datatype.Page;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PageEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Page page0 = new Page();
      page0.getN();
  }

  @Test
  public void test1()  throws Throwable  {
      Page page0 = new Page();
      String string0 = page0.getUrl();
      assertNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      Page page0 = new Page();
      Integer integer0 = new Integer((-1971));
      page0.setN(integer0);
      assertNull(page0.getUrl());
  }

  @Test
  public void test3()  throws Throwable  {
      Page page0 = new Page();
      page0.setUrl("");
      assertEquals("", page0.getUrl());
  }
}
