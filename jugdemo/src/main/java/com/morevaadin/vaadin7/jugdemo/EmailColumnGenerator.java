package com.morevaadin.vaadin7.jugdemo;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Link;
import com.vaadin.ui.Table;
import com.vaadin.ui.Table.ColumnGenerator;

@SuppressWarnings("serial")
public class EmailColumnGenerator implements ColumnGenerator {

	public Object generateCell(Table source, Object itemId, Object columnId) {

		String value = (String) source.getContainerProperty(itemId, columnId).getValue();

		ExternalResource resource = new ExternalResource("mailto:" + value);

		return new Link(value, resource);
	}
}