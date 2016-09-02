package starter.element.page;

import org.junit.Before;
import org.junit.Test;
import wcs.api.Asset;
import wcs.api.Env;
import wcs.java.util.TestElement;
import static org.mockito.Mockito.*;

public class StHomeLayoutTest extends TestElement {
	Env e = mock(Env.class);
	Asset a = mock(Asset.class);
	StHomeLayout it = new StHomeLayout();

	@Before
	public void setUp() {
		when(e.getAsset()).thenReturn(a);
		when(a.editString("StTitle")).thenReturn("Home");
		when(a.editText("StText", "")).thenReturn("Home Page");
	}

	@Test
	public void test() {
		parse(it.apply(e));
		assertText("#title", "Home");
		assertText("#text", "Home Page");
	}
}
