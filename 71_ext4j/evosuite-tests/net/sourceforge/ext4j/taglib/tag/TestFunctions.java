/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.ext4j.taglib.tag;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.ArrayDeque;
import java.util.Date;
import javax.servlet.jsp.JspTagException;
import net.sourceforge.ext4j.taglib.bo.IRequest;
import net.sourceforge.ext4j.taglib.bo.Request;
import net.sourceforge.ext4j.taglib.tag.Functions;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestFunctions {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Request request0 = new Request();
      Request request1 = (Request)Functions.addParam("HEN.9", "HEN.9", (IRequest) request0);
      assertEquals("?HEN.9=HEN.9", request0.getQueryString());
      assertEquals("null?HEN.9=HEN.9", request1.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      char char0 = Functions.forDigit(18, 18);
      assertEquals('\u0000', char0);
  }

  @Test
  public void test2()  throws Throwable  {
      Request request0 = new Request("dW~f,w_k9rDp|Np%aM", true);
      Request request1 = (Request)Functions.removeParam("dW~f,w_k9rDp|Np%aM", (IRequest) request0);
      assertEquals(true, request1.isWebRequest());
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = Functions.year((-1));
      assertEquals(2012, int0);
  }

  @Test
  public void test4()  throws Throwable  {
      Request request0 = new Request("");
      Functions.setParam("", "", (IRequest) request0);
      assertEquals("?=", request0.getQueryString());
      assertEquals("?=", request0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      Functions functions0 = new Functions();
      assertNotNull(functions0);
  }

  @Test
  public void test6()  throws Throwable  {
      String string0 = Functions.ordinal((-1329));
      assertEquals("-1329th", string0);
      assertNotNull(string0);
  }

  @Test
  public void test7()  throws Throwable  {
      String string0 = Functions.decimalFormat((double) 11L, "this week");
      assertNotNull(string0);
      assertEquals("this week11", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      long long0 = Functions.round(860.1047165193397);
      assertEquals(860L, long0);
  }

  @Test
  public void test9()  throws Throwable  {
      char char0 = Functions.toUpper('K');
      assertEquals('K', char0);
  }

  @Test
  public void test10()  throws Throwable  {
      int int0 = Functions.length((Object) "<br />");
      assertEquals(6, int0);
  }

  @Test
  public void test11()  throws Throwable  {
      int int0 = Functions.length((Object) null);
      assertEquals(0, int0);
  }

  @Test
  public void test12()  throws Throwable  {
      ArrayDeque<Integer> arrayDeque0 = new ArrayDeque<Integer>();
      arrayDeque0.add((Integer) 0);
      int int0 = Functions.length((Object) arrayDeque0);
      assertEquals(1, int0);
  }

  @Test
  public void test13()  throws Throwable  {
      String string0 = Functions.join((String[]) null, "3u,");
      assertEquals("", string0);
  }

  @Test
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[2];
      String string0 = Functions.join(stringArray0, "#hs");
      assertEquals("null#hsnull", string0);
      assertNotNull(string0);
  }

  @Test
  public void test15()  throws Throwable  {
      String string0 = Functions.seo("");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test
  public void test16()  throws Throwable  {
      String string0 = Functions.seo((String) null);
      assertNull(string0);
  }

  @Test
  public void test17()  throws Throwable  {
      String string0 = Functions.blurb("Wir />", 30000);
      assertEquals("Wir />", string0);
      assertNotNull(string0);
  }

  @Test
  public void test18()  throws Throwable  {
      String string0 = Functions.stripHTML((String) null);
      assertNull(string0);
  }

  @Test
  public void test19()  throws Throwable  {
      String string0 = Functions.blurb((String) null, 0);
      assertNull(string0);
  }

  @Test
  public void test20()  throws Throwable  {
      String string0 = Functions.blurbHTML("3u", 0);
      assertEquals("...", string0);
      assertNotNull(string0);
  }

  @Test
  public void test21()  throws Throwable  {
      String string0 = Functions.blurbHTML("L", 1);
      assertEquals("L...", string0);
      assertNotNull(string0);
  }

  @Test
  public void test22()  throws Throwable  {
      Date date0 = new Date(1688L);
      String string0 = Functions.since(date0);
      assertNotNull(string0);
      assertEquals("over a year ago", string0);
  }

  @Test
  public void test23()  throws Throwable  {
      String string0 = Functions.since((Date) null);
      assertEquals("", string0);
  }

  @Test
  public void test24()  throws Throwable  {
      Date date0 = new Date();
      String string0 = Functions.since(date0);
      assertEquals(1372535783214L, date0.getTime());
      assertEquals("1 hour ago", string0);
  }

  @Test
  public void test25()  throws Throwable  {
      Date date0 = new Date();
      String string0 = Functions.dateFormat(date0, "1@");
      assertEquals(1372535783707L, date0.getTime());
      assertEquals("1@", string0);
  }

  @Test
  public void test26()  throws Throwable  {
      String string0 = Functions.dateFormat((Date) null, "UZ+!pC&m\"o|f[?c");
      assertEquals("", string0);
  }

  @Test
  public void test27()  throws Throwable  {
      String string0 = Functions.addS((String) null);
      assertEquals("", string0);
  }

  @Test
  public void test28()  throws Throwable  {
      String string0 = Functions.addS("");
      assertEquals("", string0);
  }

  @Test
  public void test29()  throws Throwable  {
      String string0 = Functions.addS("XO\"TLO3CluI");
      assertEquals("XO\"TLO3CluI's", string0);
      assertNotNull(string0);
  }

  @Test
  public void test30()  throws Throwable  {
      String string0 = Functions.addS("XO\"TLO3CluI's");
      assertNotNull(string0);
      assertEquals("XO\"TLO3CluI's'", string0);
  }

  @Test
  public void test31()  throws Throwable  {
      String string0 = Functions.blurbChar("", 2042);
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test
  public void test32()  throws Throwable  {
      String string0 = Functions.blurbChar("", 0);
      assertNotNull(string0);
      assertEquals("...", string0);
  }

  @Test
  public void test33()  throws Throwable  {
      String string0 = Functions.cutWordCR("![&B", 1);
      assertEquals("!<br />[<br />&<br />B", string0);
      assertNotNull(string0);
  }

  @Test
  public void test34()  throws Throwable  {
      String string0 = Functions.cutWordCR((String) null, (int) 'P');
      assertNull(string0);
  }

  @Test
  public void test35()  throws Throwable  {
      String string0 = Functions.cutWordCR("", 1731);
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test
  public void test36()  throws Throwable  {
      String string0 = Functions.cutWordCR("", 0);
      assertNotNull(string0);
      assertEquals("<br />", string0);
  }

  @Test
  public void test37()  throws Throwable  {
      String string0 = Functions.cutWordCRText("P,._&+Nltm,hgF`diD", 11);
      assertEquals("P,._&+Nltm,<br />hgF`diD", string0);
      assertNotNull(string0);
  }

  @Test
  public void test38()  throws Throwable  {
      String string0 = Functions.cutWordCRText((String) null, 1800);
      assertNull(string0);
  }

  @Test
  public void test39()  throws Throwable  {
      String string0 = Functions.cutWordCRText("6%Sj|[@C7:}", 1800);
      assertNotNull(string0);
      assertEquals("6%Sj|[@C7:}", string0);
  }

  @Test
  public void test40()  throws Throwable  {
      String string0 = Functions.cutWordCRText("Wir />", 0);
      assertEquals("<br />W<br />i<br />r <br />/<br />>", string0);
      assertNotNull(string0);
  }

  @Test
  public void test41()  throws Throwable  {
      String string0 = Functions.replaceCRWithBR("Could.");
      assertNotNull(string0);
      assertEquals("Could.", string0);
  }

  @Test
  public void test42()  throws Throwable  {
      String string0 = Functions.replaceCRWithBR((String) null);
      assertNull(string0);
  }

  @Test
  public void test43()  throws Throwable  {
      Date date0 = new Date();
      long long0 = Functions.dateToMilliseconds(date0);
      assertEquals(1372535839066L, date0.getTime());
      assertEquals(1372535839066L, long0);
  }

  @Test
  public void test44()  throws Throwable  {
      long long0 = Functions.dateToMilliseconds((Date) null);
      assertEquals(0L, long0);
  }

  @Test
  public void test45()  throws Throwable  {
      String string0 = Functions.orderWords((String) null, (String) null);
      assertNull(string0);
  }

  @Test
  public void test46()  throws Throwable  {
      String string0 = Functions.orderWords("", "");
      assertNull(string0);
  }

  @Test
  public void test47()  throws Throwable  {
      String string0 = Functions.orderWords("(|vz%vkU(3^[S", "(|vz%vkU(3^[S");
      assertNull(string0);
  }

  @Test
  public void test48()  throws Throwable  {
      String string0 = Functions.orderWords("OPM^fOIeP{9EIx", "");
      assertEquals("9EIIMOOPP^efx{", string0);
      assertNotNull(string0);
  }

  @Test
  public void test49()  throws Throwable  {
      String string0 = Functions.capFirstLetters((String) null);
      assertNull(string0);
  }

  @Test
  public void test50()  throws Throwable  {
      String string0 = Functions.capFirstLetters("Wir />");
      assertNotNull(string0);
      assertEquals("Wir />", string0);
  }

  @Test
  public void test51()  throws Throwable  {
      String string0 = Functions.capFirstLetters("");
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test
  public void test52()  throws Throwable  {
      String string0 = Functions.numberInWord((int) 'K');
      assertNotNull(string0);
      assertEquals("seventy-five", string0);
  }

  @Test
  public void test53()  throws Throwable  {
      String string0 = Functions.numberInWord(413);
      assertEquals("413", string0);
      assertNotNull(string0);
  }

  @Test
  public void test54()  throws Throwable  {
      String string0 = Functions.ordinal(1763);
      assertEquals("1763rd", string0);
      assertNotNull(string0);
  }

  @Test
  public void test55()  throws Throwable  {
      String string0 = Functions.ordinal(18);
      assertEquals("18th", string0);
      assertNotNull(string0);
  }

  @Test
  public void test56()  throws Throwable  {
      String string0 = Functions.ordinal(462);
      assertEquals("462nd", string0);
      assertNotNull(string0);
  }

  @Test
  public void test57()  throws Throwable  {
      String string0 = Functions.ordinal(0);
      assertNotNull(string0);
      assertEquals("0th", string0);
  }
}
