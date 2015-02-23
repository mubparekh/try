/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.ext4j.log;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import net.sourceforge.ext4j.log.ExtrasLoggingFilter;
import org.junit.BeforeClass;
import org.springframework.mock.web.MockFilterChain;
import org.springframework.mock.web.MockFilterConfig;

@RunWith(EvoSuiteRunner.class)
public class TestExtrasLoggingFilter {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ExtrasLoggingFilter extrasLoggingFilter0 = new ExtrasLoggingFilter();
      extrasLoggingFilter0.destroy();
  }

  @Test
  public void test1()  throws Throwable  {
      ExtrasLoggingFilter extrasLoggingFilter0 = new ExtrasLoggingFilter();
      MockFilterChain mockFilterChain0 = new MockFilterChain();
      // Undeclared exception!
      try {
        extrasLoggingFilter0.doFilter((ServletRequest) null, (ServletResponse) null, (FilterChain) mockFilterChain0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Request must not be null
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      ExtrasLoggingFilter extrasLoggingFilter0 = new ExtrasLoggingFilter();
      MockFilterConfig mockFilterConfig0 = new MockFilterConfig();
      extrasLoggingFilter0.init((FilterConfig) mockFilterConfig0);
      assertEquals("", mockFilterConfig0.getFilterName());
  }
}