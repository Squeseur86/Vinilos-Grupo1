package co.edu.uptc.testalbum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.uptc.control.PerformerControl;

class ArtistTest {

	@Test
	void test() {
		PerformerControl pc = new PerformerControl();
		String[] artist1 = { "Eminem", "eminem.png", "artist hip hop" };
		String[] artist2 = { "Eminem", "eminem.png", "artist hip hop" };
		String[] artist3 = { "Payphone", "payphone.png", "band hip hop" };
		String[] artist4 = { "Payphone", "payphone.png", "band hip hop" };
		assertArrayEquals(artist1, artist2, "los artistas no son iguales");
		assertArrayEquals(artist3, artist4, "los artistas no son iguales");
	}

}
