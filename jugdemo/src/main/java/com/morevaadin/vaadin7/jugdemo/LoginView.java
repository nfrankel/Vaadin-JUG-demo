package com.morevaadin.vaadin7.jugdemo;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
public class LoginView extends CustomComponent implements View {

	private TextField loginField = new TextField("Login", "juguser");

	private PasswordField passwordField = new PasswordField("Password");

	public LoginView() {

		FormLayout layout = new FormLayout();

		layout.setMargin(true);
		layout.setSpacing(true);

		setCompositionRoot(layout);

		layout.addComponent(loginField);
		layout.addComponent(passwordField);

		Button button = new Button("Enter");

		button.addClickListener(new ClickListener() {

			public void buttonClick(ClickEvent event) {

				((DemoUi) UI.getCurrent()).login(loginField.getValue(), passwordField.getValue());
			}
		});

		layout.addComponent(button);

		Page.getCurrent().setTitle("Login...");
	}

	public void enter(ViewChangeEvent event) {
	}
}