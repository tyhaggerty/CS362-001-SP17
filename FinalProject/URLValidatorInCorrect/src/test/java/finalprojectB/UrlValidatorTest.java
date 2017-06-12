/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package finalprojectB;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import java.util.Random;





/**
 * Performs Validation Test for url validations.
 *
 * @version $Revision: 1128446 $ $Date: 2011-05-27 13:29:27 -0700 (Fri, 27 May 2011) $
 */
public class UrlValidatorTest extends TestCase {

   private boolean printStatus = false;
   private boolean printIndex = false;//print index that indicates current scheme,host,port,path, query test were using.

   public UrlValidatorTest(String testName) {
      super(testName);
   }

   
   
   public void testManualTest()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
	   
	   
   }

   
   public void testAnyOtherUnitTest()
   {
	   
   }
   /**
    * Create set of tests by taking the testUrlXXX arrays and
    * running through all possible permutations of their combinations.
    *
    * @param testObjects Used to create a url.
    */
    public void test01(){
       String[] pre = {"http://www.", "www.", ""};
       String[] post = {".com", ".org", ".edu", ""};
       for (int i = 0; i < 100; i++) {
           Random rand = new Random();
           String tmp_pre = pre[rand.nextInt(3)];
           String tmp_post = post[rand.nextInt(4)];
           UrlValidator urlVal = new UrlValidator(null, null, 0);
           urlVal.isValid(tmp_pre + "amazon" + tmp_post);
       }
   }

    public void testFailure01() {
        UrlValidator urlVal = new UrlValidator(null, null, 0);
        assertFalse(urlVal.isValid("http://www.com"));
    }

    public void testFailure02() {
        UrlValidator urlVal = new UrlValidator(null, null, 0);
        assertFalse(urlVal.isValid("http://www.amazon.cm"));
    }

    public void testFailure03() {
        UrlValidator urlVal = new UrlValidator(null, null, 0);
        assertFalse(urlVal.isValid("http://ww.amazon.org"));
    }

    public String buildUrl(int sch, int sep, int auth, int port, int path, int query){
        String schemes[] = {"http", "**invalid scheme:", ""};
        String separators[] = {"://", "**invalid scheme:", ""};
        String authorities[] = {"amazon.com", "**invalid scheme:", ""};
        String ports[] = {":8080:", "**invalid scheme:", ""};
        String paths[] = {"/path/:", "**invalid scheme:", ""};
        String querys[] = {"?search=test", "**invalid scheme:", ""};

        return schemes[sch] + separators[sep] + authorities[auth] + ports[port] + paths[path] + querys[query];

    }

    public boolean checkURL(int sch, int sep, int auth, int port, int path, int query){
        if (sch == 1)
            return false;
        if (sch == 2 && sep == 0 || sep == 1)
            return false;
        if (auth >= 1)
            return false;
        if (port == 1)
            return false;
        if (path == 1)
            return false;
        if (query == 1)
            return false;
        return true;
    }

    public void testPartition(){
        int sch, sep, auth, SLD, TLD, port, path, query;

        UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

        for (sch = 0; sch < 3; sch++){
            for (sep = 0; sep < 3; sep++) {
                for (auth = 0; auth < 3; auth++) {
                    for (port = 0; port < 3; port++) {
                        for (path = 0; path < 3; path++){
                            for (query = 0; query < 3; query++){
                                assertEquals(urlVal.isValid(buildUrl(
                                        sch,
                                        sep,
                                        auth,
                                        port,
                                        path,
                                        query)), checkURL(
                                        sch,
                                        sep,
                                        auth,
                                        port,
                                        path,
                                        query));
                                    }
                                }
                            }
                        }
                    }
                }
            }

    public void test02() {
        UrlValidator urlVal = new UrlValidator(null, null, 0);
        assertTrue(urlVal.isValid("http://www.amazon.com"));
        assertTrue(urlVal.isValid("http://www.amazon.edu"));
        assertTrue(urlVal.isValid("http://www.amazon.org"));
        assertFalse(urlVal.isValid("//www.amazon.org"));
        assertFalse(urlVal.isValid("htp://www.amazon.org"));
    }

    public void test00()  throws Throwable  {
        String[] stringArray0 = new String[1];
        UrlValidator urlValidator0 = new UrlValidator(stringArray0, 196L);
        // Undeclared exception!
        try {
            urlValidator0.isValidScheme("mil");
            //  fail("Expecting exception: NullPointerException");
            // Unstable assertion
        } catch(NullPointerException e) {
        }
    }

    public void test001()  throws Throwable  {
        UrlValidator urlValidator0 = new UrlValidator();
        urlValidator0.countToken("is", "is");
        urlValidator0.isValid("");
    }

    public void test002()  throws Throwable  {
        UrlValidator urlValidator0 = UrlValidator.getInstance();
        // Undeclared exception!
        try {
            urlValidator0.countToken((String) null, (String) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    public void test03()  throws Throwable  {
        String[] stringArray0 = new String[1];
        stringArray0[0] = "localhost";
        RegexValidator regexValidator0 = new RegexValidator("bd");
        UrlValidator urlValidator0 = new UrlValidator(stringArray0, regexValidator0, 4L);
    }

    public void test04()  throws Throwable  {
        String[] stringArray0 = new String[0];
        UrlValidator urlValidator0 = new UrlValidator(stringArray0);
        urlValidator0.isValidScheme("cv");
    }

    public void test05()  throws Throwable  {
        UrlValidator urlValidator0 = new UrlValidator((-7291L));
        urlValidator0.isValidPath("^([p{Alnum}-.]*)(:d*)?(.*)?");
        urlValidator0.isValidFragment("^([p{Alnum}-.]*)(:d*)?(.*)?");
        // Undeclared exception!
        try {
            urlValidator0.isValidAuthority("^([p{Alnum}-.]*)(:d*)?(.*)?");
            //  fail("Expecting exception: IllegalStateException");
            // Unstable assertion
        } catch(IllegalStateException e) {
            //
            // No match found
            //
        }
    }

    public void test06()  throws Throwable  {
        String[] stringArray0 = new String[0];
        RegexValidator regexValidator0 = new RegexValidator("gu");
        UrlValidator urlValidator0 = new UrlValidator(stringArray0, regexValidator0, 741L);
        urlValidator0.isValidQuery("gu");
    }

    public void test07()  throws Throwable  {
        UrlValidator urlValidator0 = new UrlValidator(1L);
        urlValidator0.countToken("rp*@", "^(.*)$");
    }

    public void test08()  throws Throwable  {
        UrlValidator urlValidator0 = new UrlValidator();
        String string0 = null;
        urlValidator0.isValidQuery((String) null);
        String string1 = "Yp3!Cj-oh>l7";
        // Undeclared exception!
        try {
            urlValidator0.isValid("Yp3!Cj-oh>l7");
            //  fail("Expecting exception: IllegalStateException");
            // Unstable assertion
        } catch(IllegalStateException e) {
            //
            // No match found
            //
        }
    }

    public void test09()  throws Throwable  {
        RegexValidator regexValidator0 = new RegexValidator("ae", true);
        String string0 = null;
        UrlValidator urlValidator0 = new UrlValidator((String[]) null, regexValidator0, 0L);
        urlValidator0.isValidPath("|2<~uI4+q a7jv#");
        UrlValidator urlValidator1 = new UrlValidator(regexValidator0, 0L);
        UrlValidator urlValidator2 = new UrlValidator();
        // Undeclared exception!
        try {
            urlValidator0.isValidAuthority("eu");
            //  fail("Expecting exception: IllegalStateException");
            // Unstable assertion
        } catch(IllegalStateException e) {
            //
            // No match found
            //
        }
    }

    public void test10()  throws Throwable  {
        UrlValidator urlValidator0 = UrlValidator.getInstance();
        urlValidator0.isValidFragment((String) null);
    }


}
