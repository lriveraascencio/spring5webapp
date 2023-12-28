package guru.springframework.spring5webapp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FooTest {

	@Test
	public void getBar() {
		Foo foo = new Foo();
		String result = foo.getBar();
		assertEquals("Foobar", result);
	}

}
