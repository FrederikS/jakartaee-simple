package codes.fdk.samples.jakartaee;

import javax.json.bind.annotation.JsonbCreator;
import javax.json.bind.annotation.JsonbProperty;
import javax.validation.constraints.NotEmpty;

public class CreateFooRequest {

	@NotEmpty
	private final String bar;

	@JsonbCreator
	public CreateFooRequest(@JsonbProperty("bar") String bar) {
		this.bar = bar;
	}

	public String getBar() {
		return bar;
	}

}