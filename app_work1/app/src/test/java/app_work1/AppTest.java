/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package app_work1;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        System.out.println("AppTest....");
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test
    public void maltiplicationTest() throws Exception {
        App sut = new App();
        int expected = 10;
        int actual = sut.maltiplication(5, 2);
//        assertThat(actual,is(expected));
        assertEquals(expected, actual);
    }

    @Test
    public void divisionTest() throws Exception {
        App sut = new App();
        float expected = 0.625f;
        float actual =  sut.division(5, 8);
 //       assertThat(actual,is(expected));

    }

}
