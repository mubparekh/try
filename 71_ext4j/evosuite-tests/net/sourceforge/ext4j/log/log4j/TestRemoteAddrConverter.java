/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.ext4j.log.log4j;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sourceforge.ext4j.log.log4j.RemoteAddrConverter;
import org.apache.log4j.helpers.FormattingInfo;
import org.apache.log4j.spi.LoggingEvent;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestRemoteAddrConverter {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      FormattingInfo formattingInfo0 = new FormattingInfo();
      RemoteAddrConverter remoteAddrConverter0 = new RemoteAddrConverter(formattingInfo0);
      // Undeclared exception!
      try {
        remoteAddrConverter0.convert((LoggingEvent) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}