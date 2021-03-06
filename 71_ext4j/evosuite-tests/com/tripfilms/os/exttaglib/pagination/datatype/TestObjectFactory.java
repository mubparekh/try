/*
 * This file was automatically generated by EvoSuite
 */

package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.tripfilms.os.exttaglib.pagination.datatype.ObjectFactory;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestObjectFactory {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      objectFactory0.createPages();
  }

  @Test
  public void test1()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      objectFactory0.createPagination();
  }

  @Test
  public void test2()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      objectFactory0.createPage();
  }

  @Test
  public void test3()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      objectFactory0.createStaticPage();
  }
}
