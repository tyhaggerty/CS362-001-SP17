/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 17 21:12:50 GMT 2017
 */

package tutorial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.EmptyStackException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import tutorial.Hw1Tutorial;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Hw1Tutorial_ESTest extends Hw1Tutorial_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Hw1Tutorial<Object> hw1Tutorial0 = new Hw1Tutorial<Object>();
      Object object0 = new Object();
      hw1Tutorial0.push(object0);
      Hw1Tutorial<Object> hw1Tutorial1 = (Hw1Tutorial<Object>)hw1Tutorial0.pop();
      // Undeclared exception!
      try { 
        hw1Tutorial1.push(hw1Tutorial1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.lang.ClassCastException@9a04aeb
         //
         assertThrownBy("sun.reflect.GeneratedMethodAccessor35", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Hw1Tutorial<Object> hw1Tutorial0 = new Hw1Tutorial<Object>();
      hw1Tutorial0.push("");
      Hw1Tutorial<Object> hw1Tutorial1 = (Hw1Tutorial<Object>)hw1Tutorial0.pop();
      // Undeclared exception!
      try { 
        hw1Tutorial1.pop();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.lang.ClassCastException@1d113ff9
         //
         assertThrownBy("sun.reflect.GeneratedMethodAccessor36", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Hw1Tutorial<Object> hw1Tutorial0 = new Hw1Tutorial<Object>();
      Object object0 = new Object();
      hw1Tutorial0.push(object0);
      Hw1Tutorial<Object> hw1Tutorial1 = (Hw1Tutorial<Object>)hw1Tutorial0.pop();
      // Undeclared exception!
      try { 
        hw1Tutorial1.isEmpty();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.lang.ClassCastException@2c649178
         //
         assertThrownBy("sun.reflect.GeneratedMethodAccessor37", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Hw1Tutorial<Integer> hw1Tutorial0 = new Hw1Tutorial<Integer>();
      boolean boolean0 = hw1Tutorial0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Hw1Tutorial<Object> hw1Tutorial0 = new Hw1Tutorial<Object>();
      assertTrue(hw1Tutorial0.isEmpty());
      
      hw1Tutorial0.push(hw1Tutorial0);
      boolean boolean0 = hw1Tutorial0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Hw1Tutorial<Integer> hw1Tutorial0 = new Hw1Tutorial<Integer>();
      // Undeclared exception!
      try { 
        hw1Tutorial0.pop();
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("tutorial.Hw1Tutorial", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Hw1Tutorial<String> hw1Tutorial0 = new Hw1Tutorial<String>();
      hw1Tutorial0.push((String) null);
      hw1Tutorial0.pop();
      assertTrue(hw1Tutorial0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Hw1Tutorial<Object> hw1Tutorial0 = new Hw1Tutorial<Object>();
      Object object0 = new Object();
      hw1Tutorial0.push(object0);
      Integer integer0 = new Integer(5326);
      hw1Tutorial0.push(integer0);
      hw1Tutorial0.push(integer0);
      hw1Tutorial0.push(integer0);
      hw1Tutorial0.push(integer0);
      hw1Tutorial0.push(integer0);
      hw1Tutorial0.push(object0);
      hw1Tutorial0.push((Object) null);
      hw1Tutorial0.push(object0);
      hw1Tutorial0.push(object0);
      // Undeclared exception!
      try { 
        hw1Tutorial0.push((Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Stack exceeded capacity!
         //
         assertThrownBy("tutorial.Hw1Tutorial", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Hw1Tutorial<Object> hw1Tutorial0 = new Hw1Tutorial<Object>();
      assertTrue(hw1Tutorial0.isEmpty());
      
      hw1Tutorial0.push(hw1Tutorial0);
      Object object0 = new Object();
      hw1Tutorial0.push(object0);
      hw1Tutorial0.pop();
      assertFalse(hw1Tutorial0.isEmpty());
  }
}
