package org.Adactin;

import org.testng.annotations.Test;

public class Parallel1{
@Test
public void tc1() {
System.out.println("tc...."+Thread.currentThread().getId());
}
@Test
public void tc2() {
System.out.println("tc2......"+Thread.currentThread().getId());
}
@Test
public void tc3() {
System.out.println("tc3...."+Thread.currentThread().getId());
}

}
