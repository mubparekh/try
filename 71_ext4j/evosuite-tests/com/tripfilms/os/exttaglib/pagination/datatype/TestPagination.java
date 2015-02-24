/*
 * This file was automatically generated by EvoSuite
 */

package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.tripfilms.os.exttaglib.pagination.datatype.Pages;
import com.tripfilms.os.exttaglib.pagination.datatype.Pagination;
import com.tripfilms.os.exttaglib.pagination.datatype.StaticPage;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestPagination {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Pagination pagination0 = new Pagination();
      int int0 = pagination0.getTotalPages();
      assertEquals(0, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      Pagination pagination0 = new Pagination();
      Pages pages0 = pagination0.getPages();
      assertNull(pages0);
  }

  @Test
  public void test2()  throws Throwable  {
      Pagination pagination0 = new Pagination();
      pagination0.setCurrentPage(0);
      assertEquals(0, pagination0.getCurrentPage());
  }

  @Test
  public void test3()  throws Throwable  {
      Pagination pagination0 = new Pagination();
      StaticPage staticPage0 = pagination0.getNextPage();
      assertNull(staticPage0);
  }

  @Test
  public void test4()  throws Throwable  {
      Pagination pagination0 = new Pagination();
      StaticPage staticPage0 = pagination0.getPreviousPage();
      assertNull(staticPage0);
  }

  @Test
  public void test5()  throws Throwable  {
      Pagination pagination0 = new Pagination();
      StaticPage staticPage0 = pagination0.getLastPage();
      assertNull(staticPage0);
  }

  @Test
  public void test6()  throws Throwable  {
      Pagination pagination0 = new Pagination();
      pagination0.setTotalPages(0);
      assertEquals(0, pagination0.getTotalPages());
  }

  @Test
  public void test7()  throws Throwable  {
      Pagination pagination0 = new Pagination();
      int int0 = pagination0.getCurrentPage();
      assertEquals(0, int0);
  }

  @Test
  public void test8()  throws Throwable  {
      Pagination pagination0 = new Pagination();
      pagination0.setLastPage((StaticPage) null);
      assertEquals(0, pagination0.getCurrentPage());
  }

  @Test
  public void test9()  throws Throwable  {
      Pagination pagination0 = new Pagination();
      pagination0.setPages((Pages) null);
      assertEquals(0, pagination0.getCurrentPage());
  }

  @Test
  public void test10()  throws Throwable  {
      Pagination pagination0 = new Pagination();
      StaticPage staticPage0 = new StaticPage();
      pagination0.setFirstPage(staticPage0);
      assertNull(staticPage0.getUrl());
  }

  @Test
  public void test11()  throws Throwable  {
      Pagination pagination0 = new Pagination();
      StaticPage staticPage0 = pagination0.getFirstPage();
      assertNull(staticPage0);
  }

  @Test
  public void test12()  throws Throwable  {
      Pagination pagination0 = new Pagination();
      pagination0.setNextPage((StaticPage) null);
      assertEquals(0, pagination0.getTotalPages());
  }

  @Test
  public void test13()  throws Throwable  {
      Pagination pagination0 = new Pagination();
      pagination0.setPreviousPage((StaticPage) null);
      assertEquals(0, pagination0.getCurrentPage());
  }
}