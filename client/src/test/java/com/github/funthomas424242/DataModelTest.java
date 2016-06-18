package com.github.funthomas424242;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.java.html.junit.BrowserRunner;

/**
 * Tests for behavior of your application in real systems. The
 * {@link BrowserRunner} selects all possible presenters from your
 * <code>pom.xml</code> and runs the tests inside of them.
 *
 * See your <code>pom.xml</code> dependency section for details.
 */
@RunWith(BrowserRunner.class)
public class DataModelTest {
	@Test
	public void testUIModelWithoutUI() {
		Data model = new Data();
		model.setMessage("Hello World!");

		List<String> arr = model.getWords();
		assertEquals("Six words always", 6, arr.size());
		assertEquals("Hello is the first word", "Hello", arr.get(0));
		assertEquals("World is the second word", "World!", arr.get(1));
	}
}
