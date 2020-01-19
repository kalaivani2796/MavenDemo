package testdata;

import org.testng.annotations.DataProvider;

public class NewToursData {

	
	@DataProvider
	public static Object[][] dpLogin() {
		return new Object[][] {
			new Object[] { "mercury", "mercury","Welcome: Mercury Tours","oneway","Frankfurt" },
			new Object[] { "test", "aaaaaa","Welcome: Mercury Tours","oneway","Frankfurt" },
		};
	}

}
