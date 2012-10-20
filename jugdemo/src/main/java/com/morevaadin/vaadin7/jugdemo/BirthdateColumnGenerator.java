package com.morevaadin.vaadin7.jugdemo;

import static java.text.DateFormat.MEDIUM;

import java.text.DateFormat;
import java.util.Date;

import com.vaadin.ui.Table;
import com.vaadin.ui.Table.ColumnGenerator;

@SuppressWarnings("serial")
public class BirthdateColumnGenerator implements ColumnGenerator {

	public Object generateCell(Table source, Object itemId, Object columnId) {

		Date value = (Date) source.getContainerProperty(itemId, columnId).getValue();

		return DateFormat.getDateInstance(MEDIUM).format(value);
	}
}