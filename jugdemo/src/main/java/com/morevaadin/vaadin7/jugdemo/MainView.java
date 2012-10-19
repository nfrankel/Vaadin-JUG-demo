package com.morevaadin.vaadin7.jugdemo;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class MainView extends CustomComponent implements View {

	public MainView() {

		VerticalLayout layout = new VerticalLayout();

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

	public void enter(ViewChangeEvent event) {
	}
}
