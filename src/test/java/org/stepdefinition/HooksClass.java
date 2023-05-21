package org.stepdefinition;

import org.junit.After;
import org.junit.Before;
import org.sam.BaseClass;

public class HooksClass extends BaseClass {
@cucumber.api.java.Before(order=1)
	private void precondition1() {
	lauchBrowser();
	

	}@cucumber.api.java.Before(order=1)
private void precondition2() {

	windowMaximize();

	}@cucumber.api.java.Before(order=3,value="@smoke")
private void precondition3() {
	System.out.println("Precondition3");

	}
@cucumber.api.java.After(order=6)
private void postcondition4() {
	System.out.println("TakeScreenshot ");

}@cucumber.api.java.After(order=4,value="@sanity")
private void postcondition5() {
	closeEntrireBrowser();

}
}
