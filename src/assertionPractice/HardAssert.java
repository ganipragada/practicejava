package assertionPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	@Test(priority = 1, groups = "Regression")
	public void hardAssert() {

		Assert.assertEquals(true, true);
		Assert.assertSame("gani", "gani");
		String name = "gani";
		String name2 = "Gani";
		if (name.equalsIgnoreCase(name2)) {
			System.out.println(true);
		}
		name.equalsIgnoreCase(name2);

	}

}
