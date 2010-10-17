/*
 PureMVC Java MultiCore Demo - GWT Employee Admin Mobile by Anthony Quinault <anthony.quinault@puremvc.org>
 Based upon PureMVC AS3 Demo - Flex Employee Admin - Copyright(c) 2007-08 Cliff Hall <clifford.hall@puremvc.org>
 Your reuse is governed by the Creative Commons Attribution 3.0 License
 */

package org.java.multicore.demos.gwt.employeeadmin.client.controller;

import org.java.multicore.demos.gwt.employeeadmin.client.ApplicationFacade;
import org.java.multicore.demos.gwt.employeeadmin.client.model.RoleProxy;
import org.java.multicore.demos.gwt.employeeadmin.client.model.UserProxy;
import org.java.multicore.demos.gwt.employeeadmin.client.model.vo.UserVO;
import org.puremvc.java.multicore.interfaces.INotification;
import org.puremvc.java.multicore.patterns.command.SimpleCommand;

/**
 * Delete user command.
 */
public class DeleteUserCommand extends SimpleCommand {

	/**
	 * Retrieve the user and role proxies and delete the user
	 * and his roles. then send the USER_DELETED notification
	 * @param notification notification
	 */
	@Override
	public final void execute(final INotification notification) {
		UserVO user = (UserVO) notification.getBody();
		UserProxy userProxy = (UserProxy) getFacade().retrieveProxy(UserProxy.NAME);
		RoleProxy roleProxy = (RoleProxy) getFacade().retrieveProxy(RoleProxy.NAME);
		userProxy.deleteItem(user);
		roleProxy.deleteItem(user);
		sendNotification(ApplicationFacade.USER_DELETED);
	}
}