package com.morevaadin.vaadin7.jugdemo;

import static com.vaadin.ui.Alignment.MIDDLE_RIGHT;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.Page;
import com.vaadin.server.VaadinServiceSession;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class MainView extends CustomComponent implements View {

	public MainView() {

		HorizontalLayout topBar = new HorizontalLayout();

		topBar.setWidth("100%");

		Label userLabel = new Label();

		userLabel.setValue(VaadinServiceSession.getCurrent().getAttribute(String.class));

		Button logoutButton = new Button("Logout");

		logoutButton.addClickListener(new ClickListener() {

			public void buttonClick(ClickEvent event) {

				((DemoUi) UI.getCurrent()).logout();
			}
		});

		topBar.addComponent(userLabel);
		topBar.addComponent(logoutButton);
		topBar.setComponentAlignment(logoutButton, MIDDLE_RIGHT);

		VerticalLayout layout = new VerticalLayout();

		layout.addComponent(topBar);

		layout.setMargin(true);
		layout.setSpacing(true);

		final TextField text = new TextField("", "JUG");

		Button button = new Button("Say Hello");

		final Label label = new Label();

		button.addClickListener(new ClickListener() {

			public void buttonClick(ClickEvent event) {

				String value = text.getValue();

				label.setValue("Hello " + value + "!");
			}
		});

		layout.addComponent(text);
		layout.addComponent(button);
		layout.addComponent(label);

		setCompositionRoot(layout);

		Page.getCurrent().setTitle("Welcome to Vaadin JUG Demo");
	}

	public void enter(ViewChangeEvent event) {}
}
