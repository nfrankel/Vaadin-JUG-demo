Vaadin JUG Demo project
=======================

Goal
----

The [Vaadin](http://vaadin.com/) JUG Demo project is aimed at providing a canvas for coding a live demo application in front of Java User Groups audience (or other developer groups for that matter).

Tags
----

Each git tag corresponds to a single logical step, each one providing new insight into Vaadin features.

<table>
	<thead>
		<tr>
			<th>Tag
			<th>Description
	<tbody>
		<tr>
			<td>[0.0.1](Vaadin-JUG-demo/zipball/0.0.1)
			<td>Basic Vaadin setup: a Vaadin servlet mapped to /* that displays a simple Hello world label.
		<tr>
			<td>[0.0.2](Vaadin-JUG-demo/zipball/0.0.2)
			<td>Event listener implementation: a button triggers the copying of a field string value into a label. This is achieved by an anonymous click listener class on the button.
		<tr>
			<td>[0.0.3](Vaadin-JUG-demo/zipball/0.0.3)
			<td>Alternative event listener implementation: same feature but with a dedicated listener method, Vaadin using reflection under the cover.
		<tr>
			<td>[0.0.4](Vaadin-JUG-demo/zipball/0.0.4)
			<td>Layout: using a different layout is very easy (from horizontal to vertical).
		<tr>
			<td>[0.0.5](Vaadin-JUG-demo/zipball/0.0.5)
			<td>Proper single responsibility principle: componentization of the GUI into separate classes.
		<tr>
			<td>[0.0.6](Vaadin-JUG-demo/zipball/0.0.6)
			<td>Basic view navigation: switching from a login view to the main view.
		<tr>
			<td>[0.0.7](Vaadin-JUG-demo/zipball/0.0.7)
			<td>Page title customization for each view and notification when log in fails.
		<tr>
			<td>[0.0.8](Vaadin-JUG-demo/zipball/0.0.8)
			<td>Login/logout: user object displayed when logged in and basic logout implementation.
		<tr>
			<td>[0.0.9](Vaadin-JUG-demo/zipball/0.0.9)
			<td>Proper logout: Vaadin servlet is mapped to a subcontext, and the logout URL is set to the root context.
		<tr>
			<td>[0.0.10](Vaadin-JUG-demo/zipball/0.0.10)
			<td>Basic table: table component that directly displays the content of a database table.
		<tr>
			<td>[0.0.11](Vaadin-JUG-demo/zipball/0.0.11)
			<td>Table customization: raw data decoration (mailto hyperlink for emails and date formatting), column order changed and custom label for column headers.

