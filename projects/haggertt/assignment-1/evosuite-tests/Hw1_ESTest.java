/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 16 22:09:56 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Hw1_ESTest extends Hw1_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 9 covered goals:
   * Goal 1. Hw1.main([Ljava/lang/String;)V: Line 12
   * Goal 2. Hw1.main([Ljava/lang/String;)V: Line 14
   * Goal 3. Hw1.main([Ljava/lang/String;)V: Line 30
   * Goal 4. Hw1.main([Ljava/lang/String;)V: Line 31
   * Goal 5. Hw1.main([Ljava/lang/String;)V: Line 33
   * Goal 6. [METHOD] Hw1.main([Ljava/lang/String;)V
   * Goal 7. [METHODNOEX] Hw1.main([Ljava/lang/String;)V
   * Goal 8. Weak Mutation 0: Hw1.main([Ljava/lang/String;)V:12 - ReplaceConstant - ciaFactBook2008.txt -> 
   * Goal 9. Weak Mutation 1: Hw1.main([Ljava/lang/String;)V:12 - ReplaceComparisonOperator == -> !=
   */

  @Test
  public void test2() throws Throwable  {
      String one = "This is a test"
  }

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Hw1.main((String[]) null);
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * Goal 1. Hw1.<init>()V: root-Branch
   * Goal 2. Branch Hw1.<init>()V: root-Branch in context: Hw1:<init>()V
   * Goal 3. [METHOD] Hw1.<init>()V
   * Goal 4. [METHODNOEX] Hw1.<init>()V
   */

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Hw1 hw1_0 = new Hw1();
  }
}
