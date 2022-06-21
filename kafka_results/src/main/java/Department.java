

import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class Department {

	public Department () {
	}

	public Department (
		String id, 
		String name, 
		Action action) {
		this.id = id;
		this.name = name;
		this.action = action;
	}

	private String id;
	private String name;
	private Action action;
	public String getId() {
		return id;
	}

	public Department setId(String id) {
		this.id = id;
		return this;
	}


	public String getName() {
		return name;
	}

	public Department setName(String name) {
		this.name = name;
		return this;
	}


	public Action getAction() {
		return action;
	}

	public Department setAction(Action action) {
		this.action = action;
		return this;
	}


	public static enum Action { add,update,delete }	public String toString() {
		return "Department ["
		+ " id: " + id
		+ " name: " + name
		+ " action: " + action
		+ " ]";
	}
}
