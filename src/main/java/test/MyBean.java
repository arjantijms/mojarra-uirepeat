package test;

import static java.util.Arrays.asList;

import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class MyBean {

	List<Object> objects = asList(new TypeA(), new TypeB());

	public List<Object> getObjects() {
		return objects;
	}

	public void action() {

	}

}
