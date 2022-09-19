package testDataset;

import org.testng.annotations.DataProvider;

public class Data_Set {
	@DataProvider(name = "ShippingAddressData")
	public static Object dataset() {
		Object[]  obj = { "Rubaia Morshed", "01945454521", "01712121212", "Banasree-Rampura"
	};
		return obj;
}
}