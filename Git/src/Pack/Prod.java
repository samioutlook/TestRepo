package Pack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Prod {
	@Test
	public void logg(){
		Assert.assertEquals("commit", "sych");
	}
}
