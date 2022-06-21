

import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class HeaderModel {

	public HeaderModel () {
	}

	public HeaderModel (
		String env) {
		this.env = env;
	}

	private String env;
	public String getEnv() {
		return env;
	}

	public HeaderModel setEnv(String env) {
		this.env = env;
		return this;
	}

	public String toString() {
		return "HeaderModel ["
		+ " env: " + env
		+ " ]";
	}
}
