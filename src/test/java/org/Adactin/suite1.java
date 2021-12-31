package org.Adactin;

import org.testng.annotations.Test;

public class suite1 {
	@Test(groups="regression")
	public void tc1() {
		System.out.println(1);

	}
	@Test(groups="smoke")
	public void tc2() {
		System.out.println(2);
}
	@Test(groups="sanity")
	public void tc3() {
		System.out.println(3);
	}
}