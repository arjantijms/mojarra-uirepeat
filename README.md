mojarra-uirepeat
================

Reproducer case for editable value holders failing in ui:repeat

This project demonstrates an issue where ui:repeat will evaluate guarded EL expressions of its editable value holder children when saving state.

The same construct will not fail when using the very similar h:dataTable instead.

When deploying on localhost, the following URLs will demonstrate the issue;

* http://localhost:8080/mojarra-uirepeat/repeat-form.jsf - crashes immediately, tries to evaluate EL it shouldn't
* http://localhost:8080/mojarra-uirepeat/repeat-noform.jsf -works, since no editable value holders and form used
* http://localhost:8080/mojarra-uirepeat/datatable-form.jsf - works, since data table doesn't have the issue




