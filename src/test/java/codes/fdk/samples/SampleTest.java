package codes.fdk.samples;

import org.junit.jupiter.api.Test;
import codes.fdk.samples.jakartaee.CreateFooRequest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

public class SampleTest {

	@Test
	public void simpleJUnit5Test() {
		String result = "duke";
		assertEquals("duke", result);
	}
}
