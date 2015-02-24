/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.ext4j.log.logback;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sourceforge.ext4j.log.logback.SpringRequestInfoExtractor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SpringRequestInfoExtractorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SpringRequestInfoExtractor springRequestInfoExtractor0 = new SpringRequestInfoExtractor();
      // Undeclared exception!
      try {
        springRequestInfoExtractor0.getCookie("R<$,qV");
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * No thread-bound request found: Are you referring to request attributes outside of an actual web request, or processing a request outside of the originally receiving thread? If you are actually operating within a web request and still receive this message, your code is probably running outside of DispatcherServlet/DispatcherPortlet: In this case, use RequestContextListener or RequestContextFilter to expose the current request.
         */
      }
  }
}
