package com.morevaadin.vaadin7.jugdemo;

import com.vaadin.navigator.Navigator.SimpleViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
public class DemoUi extends UI {

	@Override
	protected void init(VaadinRequest request) {

		SimpleViewDisplay display = new SimpleViewDisplay();
		
		display.showView(new MainView());
		
		setContent(display);
	}
}
