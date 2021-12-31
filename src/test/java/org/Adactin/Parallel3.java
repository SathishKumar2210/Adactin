package org.Adactin;

import org.testng.annotations.Test;

public class Parallel3 {
	@Test
	public void tc1000() {
	System.out.println("tc1000...."+Thread.currentThread().getId());
	}
	@Test
	public void tc2000() {
	System.out.println("tc2000...."+Thread.currentThread().getId());
	}
	@Test
	public void tc3000() {
	System.out.println("tc3000...."+Thread.currentThread().getId());
	}
}
