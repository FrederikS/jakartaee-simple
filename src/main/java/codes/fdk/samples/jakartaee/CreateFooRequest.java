package codes.fdk.samples.jakartaee;

import javax.json.bind.annotation.JsonbCreator;
import javax.json.bind.annotation.JsonbProperty;

public class CreateFooRequest {

	private final String bar;

	@JsonbCreator
	public CreateFooRequest(@JsonbProperty("bar") String bar) {
		this.bar = bar;
	}

	public String getBar() {
		return bar;
	}

}