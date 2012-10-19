package com.morevaadin.vaadin7.jugdemo;

import com.vaadin.navigator.Navigator.SimpleViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
public class DemoUi extends UI {

	private SimpleViewDisplay display = new SimpleViewDisplay();

	@Override
	protected void init(VaadinRequest request) {

		display.showView(new LoginView());

		setContent(display);
	}

	void login(String login, String password) {

		if ("juguser".equals(login)) {

			display.showView(new MainView());

		} else {

			Notification.show("Authentication error", Notification.Type.ERROR_MESSAGE);
		}
	}
}
