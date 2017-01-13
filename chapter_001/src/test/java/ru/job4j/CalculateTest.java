package ru.job4j;


 import org.junit.Test;
 import java.io.ByteArrayOutputStream;
 import java.io.PrintStream;
 import static org.hamcrest.core.Is.is;
 import static org.junit.Assert.assertThat;


/**
 * Test.
 *
 * @author kslobodchikov
 * @version 1.0
 * @since 13.01.2017
 */


  public class CalculateTest {

   	/**
	  * Test.
	  */

	@Test
	public void whenExecuteMainThenPrintToConsole() {

	      ByteArrayOutputStream out = new ByteArrayOutputStream();
	      System.setOut(new PrintStream(out));
	      Calculate.main(null);
    	      assertThat(out.toString(), is("Hello World!"));

      }


 }