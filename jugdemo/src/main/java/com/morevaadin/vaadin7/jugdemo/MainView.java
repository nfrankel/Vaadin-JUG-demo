package com.morevaadin.vaadin7.jugdemo;

import static com.vaadin.ui.Alignment.MIDDLE_RIGHT;

import java.util.Properties;

import com.vaadin.data.Container;
import com.vaadin.data.util.sqlcontainer.SQLContainer;
import com.vaadin.data.util.sqlcontainer.connection.JDBCConnectionPool;
import com.vaadin.data.util.sqlcontainer.connection.SimpleJDBCConnectionPool;
import com.vaadin.data.util.sqlcontainer.query.QueryDelegate;
import com.vaadin.data.util.sqlcontainer.query.TableQuery;
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
import com.vaadin.ui.Table;
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

		layout.setMargin(true);
		layout.setSpacing(true);

		layout.addComponent(topBar);

		Table table = new Table();

		table.setWidth("100%");

		layout.addComponent(table);

		setCompositionRoot(layout);

		Page.getCurrent().setTitle("Welcome to Vaadin JUG Demo");

		Properties props = new Properties();

		try {

			props.load(getClass().getClassLoader().getResourceAsStream("database.properties"));

			JDBCConnectionPool pool = new SimpleJDBCConnectionPool(props.getProperty("db.driver"),
					props.getProperty("db.url"), props.getProperty("db.user"),
					props.getProperty("db.password"));

			QueryDelegate query = new TableQuery("PERSON", pool);

			Container container = new SQLContainer(query);

			table.setContainerDataSource(container);

			table.setVisibleColumns(new String[] { "LAST_NAME", "FIRST_NAME", "MAIL", "BIRTHDATE" });

			table.setColumnHeader("LAST_NAME", "Last name");
			table.setColumnHeader("FIRST_NAME", "First name");

		} catch (Exception e) {

			throw new RuntimeException(e);
		}
	}

	public void enter(ViewChangeEvent event) {}
}
