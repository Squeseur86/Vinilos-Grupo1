package co.edu.uptc.testalbum;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import co.edu.uptc.control.AlbumControl;
public class AlbumTest {
	@Test
	void test() {
		AlbumControl ac = new AlbumControl();
		String name, cover, description, genre, nam, cov, desc, gen;
		int year, month, date, hours, minutes, seconds;
		name = "The Eminem Show";
		cover = "https://images.app.goo.gl/xnx54QJA2im3eGvo6";
		description = "Album musical de Eminem";
		genre = "Hip Hop";
		year = 2002;
		month = 05;
		date = 26;
		hours = 1;
		minutes = 17;  
		seconds = 00;
		nam = name;
		cov = cover;
		desc = description;
		gen = genre;
		assertEquals(nam, name);
		assertEquals(cov, cover);
		assertEquals(desc, description);
		assertEquals(gen, genre);
	}
}
