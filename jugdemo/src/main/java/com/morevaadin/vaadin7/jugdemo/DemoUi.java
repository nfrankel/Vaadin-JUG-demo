package com.morevaadin.vaadin7.jugdemo;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
public class DemoUi extends UI {

	@Override
	protected void init(VaadinRequest request) {

		HorizontalLayout layout = new HorizontalLayout();
		
		Label label = new Label("Hello JUG!");
		
		layout.addComponent(label);
		
		setContent(layout);
	}
}
