/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.ext4j.taglib.bo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.Collection;
import net.sourceforge.ext4j.taglib.bo.CurrentURLBO;
import net.sourceforge.ext4j.taglib.bo.IRequest;
import net.sourceforge.ext4j.taglib.bo.Request;
import net.sourceforge.ext4j.taglib.bo.RequestParam;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestCurrentURLBO {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Request request0 = new Request(" implements LogFactory but was loade by an incompatib classloader.", false);
      CurrentURLBO.RootRequest currentURLBO_RootRequest0 = new CurrentURLBO.RootRequest((IRequest) request0);
      RequestParam requestParam0 = currentURLBO_RootRequest0.getParam(" implements LogFactory but was loade by an incompatib classloader.", false);
      assertNull(requestParam0);
  }

  @Test
  public void test1()  throws Throwable  {
      Request request0 = new Request("J9:;Ee]TJZtPe[s");
      CurrentURLBO.RootRequest currentURLBO_RootRequest0 = new CurrentURLBO.RootRequest((IRequest) request0);
      boolean boolean0 = currentURLBO_RootRequest0.isWebRequest();
      assertEquals(true, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      Request request0 = new Request();
      CurrentURLBO.RootRequest currentURLBO_RootRequest0 = new CurrentURLBO.RootRequest((IRequest) request0);
      Request request1 = (Request)currentURLBO_RootRequest0.cleanEmptyParams();
      assertEquals("null", request1.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      Request request0 = new Request("J9:;Ee]TJZtPe[s");
      CurrentURLBO.RootRequest currentURLBO_RootRequest0 = new CurrentURLBO.RootRequest((IRequest) request0);
      String string0 = currentURLBO_RootRequest0.getQueryString();
      assertEquals("", string0);
  }

  @Test
  public void test4()  throws Throwable  {
      Request request0 = new Request();
      CurrentURLBO.RootRequest currentURLBO_RootRequest0 = new CurrentURLBO.RootRequest((IRequest) request0);
      Request request1 = (Request)currentURLBO_RootRequest0.setParam(":>BN~*2Sjl4", ":>BN~*2Sjl4");
      assertFalse(request1.equals(request0));
  }

  @Test
  public void test5()  throws Throwable  {
      Request request0 = new Request();
      CurrentURLBO.RootRequest currentURLBO_RootRequest0 = new CurrentURLBO.RootRequest((IRequest) request0);
      Collection<RequestParam> collection0 = currentURLBO_RootRequest0.getParams();
      assertEquals(0, collection0.size());
  }

  @Test
  public void test6()  throws Throwable  {
      Request request0 = new Request("J9:;Ee]TJZtPe[s");
      CurrentURLBO.RootRequest currentURLBO_RootRequest0 = new CurrentURLBO.RootRequest((IRequest) request0);
      Request request1 = (Request)currentURLBO_RootRequest0.setBaseURL("J9:;Ee]TJZtPe[s");
      assertEquals(true, request1.isWebRequest());
  }

  @Test
  public void test7()  throws Throwable  {
      Request request0 = new Request("yv|!n/&d0~d", true);
      CurrentURLBO.RootRequest currentURLBO_RootRequest0 = new CurrentURLBO.RootRequest((IRequest) request0);
      Request request1 = (Request)currentURLBO_RootRequest0.toBaseURL();
      assertSame(request1, request0);
  }

  @Test
  public void test8()  throws Throwable  {
      Request request0 = new Request("J9:;Ee]TJZtPe[s");
      CurrentURLBO.RootRequest currentURLBO_RootRequest0 = new CurrentURLBO.RootRequest((IRequest) request0);
      String string0 = currentURLBO_RootRequest0.getValue("", "");
      assertEquals("", string0);
  }

  @Test
  public void test9()  throws Throwable  {
      Request request0 = new Request("yv|!n/&d0~d", true);
      CurrentURLBO.RootRequest currentURLBO_RootRequest0 = new CurrentURLBO.RootRequest((IRequest) request0);
      int int0 = currentURLBO_RootRequest0.getValue("yv|!n/&d0~d", (-49));
      assertEquals((-49), int0);
  }

  @Test
  public void test10()  throws Throwable  {
      Request request0 = new Request();
      CurrentURLBO.RootRequest currentURLBO_RootRequest0 = new CurrentURLBO.RootRequest((IRequest) request0);
      RequestParam requestParam0 = currentURLBO_RootRequest0.getParam(":>BN~*2Sjl4");
      assertNull(requestParam0);
  }

  @Test
  public void test11()  throws Throwable  {
      Request request0 = new Request();
      CurrentURLBO.RootRequest currentURLBO_RootRequest0 = new CurrentURLBO.RootRequest((IRequest) request0);
      Request request1 = (Request)currentURLBO_RootRequest0.removeParam(":>BN~*2Sjl4");
      assertFalse(request0.equals(request1));
  }

  @Test
  public void test12()  throws Throwable  {
      Request request0 = new Request("J9:;Ee]TJZtPe[s");
      CurrentURLBO.RootRequest currentURLBO_RootRequest0 = new CurrentURLBO.RootRequest((IRequest) request0);
      Request request1 = (Request)currentURLBO_RootRequest0.clone();
      assertEquals("J9:;Ee]TJZtPe[s", request1.getBaseURL());
  }

  @Test
  public void test13()  throws Throwable  {
      Request request0 = new Request(" implements LogFactory but was loade by an incompatib classloader.", false);
      CurrentURLBO.RootRequest currentURLBO_RootRequest0 = new CurrentURLBO.RootRequest((IRequest) request0);
      Request request1 = (Request)currentURLBO_RootRequest0.addParam(" implements LogFactory but was loade by an incompatib classloader.", " implements LogFactory but was loade by an incompatib classloader.");
      assertEquals(" implements LogFactory but was loade by an incompatib classloader.? implements LogFactory but was loade by an incompatib classloader.=+implements+LogFactory+but+was+loade+by+an+incompatib+classloader.", request1.toString());
  }

  @Test
  public void test14()  throws Throwable  {
      Request request0 = new Request();
      CurrentURLBO.RootRequest currentURLBO_RootRequest0 = new CurrentURLBO.RootRequest((IRequest) request0);
      Request request1 = (Request)currentURLBO_RootRequest0.setHashValue(":>BN~*2Sjl4");
      assertFalse(request1.equals(request0));
  }

  @Test
  public void test15()  throws Throwable  {
      Request request0 = new Request();
      CurrentURLBO.RootRequest currentURLBO_RootRequest0 = new CurrentURLBO.RootRequest((IRequest) request0);
      String string0 = currentURLBO_RootRequest0.getHashValue();
      assertNull(string0);
  }

  @Test
  public void test16()  throws Throwable  {
      Request request0 = new Request("yv|!n/&d0~d", true);
      CurrentURLBO.RootRequest currentURLBO_RootRequest0 = new CurrentURLBO.RootRequest((IRequest) request0);
      String string0 = currentURLBO_RootRequest0.toString();
      assertEquals("yv|!n/&d0~d", string0);
  }

  @Test
  public void test17()  throws Throwable  {
      Request request0 = new Request();
      CurrentURLBO.RootRequest currentURLBO_RootRequest0 = new CurrentURLBO.RootRequest((IRequest) request0);
      Request request1 = (Request)currentURLBO_RootRequest0.setParam((RequestParam) null);
      assertFalse(request1.equals(request0));
  }

  @Test
  public void test18()  throws Throwable  {
      Request request0 = new Request(" implements LogFactory but was loade by an incompatib classloader.", false);
      CurrentURLBO.RootRequest currentURLBO_RootRequest0 = new CurrentURLBO.RootRequest((IRequest) request0);
      String string0 = currentURLBO_RootRequest0.getBaseURL();
      assertEquals(" implements LogFactory but was loade by an incompatib classloader.", string0);
  }

  @Test
  public void test19()  throws Throwable  {
      CurrentURLBO currentURLBO0 = new CurrentURLBO();
      assertNotNull(currentURLBO0);
  }
}
