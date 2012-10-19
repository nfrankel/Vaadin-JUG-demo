package com.morevaadin.vaadin7.jugdemo;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class DemoUi extends UI {

	@Override
	protected void init(VaadinRequest request) {

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

		setContent(layout);
	}
}
