package org.Adactin;

import org.testng.annotations.Test;

public class Suite3 {
	@Test(groups="retesting")
	public void tc100() {
	System.out.println(100);
	}
	@Test(groups="regression")
	public void tc200() {
	System.out.println(200);
	}
	@Test(groups="smoke")
	public void tc300() {
	System.out.println(300);
	}
}
