package org.Adactin;

import org.testng.annotations.Test;

public class Parallel2 {
@Test
public void tc100() {
System.out.println("tc100...."+Thread.currentThread().getId());
}
@Test
public void tc200() {
System.out.println("tc200...."+Thread.currentThread().getId());
}
@Test
public void tc300() {
System.out.println("tc300...."+Thread.currentThread().getId());
}
}