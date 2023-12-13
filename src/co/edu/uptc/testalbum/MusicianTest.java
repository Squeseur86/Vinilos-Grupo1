package co.edu.uptc.testalbum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MusicianTest {

	@Test
	void test() {
		int year, month, day;
		year = 2005;
		month = 9;
		day = 20;
		int year2 = 2005;
		int month2 = 9;
		int day2 = 20;
		assertAll("Listado",
				() -> assertEquals(year, year2 ,"año no coincide"),
				() -> assertEquals(month, month2 ,"mes no coincide"),
				() -> assertEquals(day, day2 , "dia no coincide")
				);
		
	}

}
