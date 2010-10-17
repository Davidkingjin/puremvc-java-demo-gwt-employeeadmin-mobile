/*
 PureMVC Java MultiCore Demo - GWT Employee Admin Mobile by Anthony Quinault <anthony.quinault@puremvc.org>
 Based upon PureMVC AS3 Demo - Flex Employee Admin - Copyright(c) 2007-08 Cliff Hall <clifford.hall@puremvc.org>
 Your reuse is governed by the Creative Commons Attribution 3.0 License
 */

package org.java.multicore.demos.gwt.employeeadmin.client;

import com.google.gwt.core.client.EntryPoint;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class EmployeeAdmin implements EntryPoint {
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		ApplicationFacade applicationFacade = ApplicationFacade.getInstance(ApplicationFacade.NAME);
		applicationFacade.startup();
	}
}
