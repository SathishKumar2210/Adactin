package org.Adactin;

import org.testng.annotations.Test;

public class Suite2 {
@Test(groups="retesting")
public void tc10() {
System.out.println(10);
}
@Test(groups="regression")
public void tc20() {
System.out.println(20);
}
@Test(groups="smoke")
public void tc30() {
System.out.println(30);
}
}
