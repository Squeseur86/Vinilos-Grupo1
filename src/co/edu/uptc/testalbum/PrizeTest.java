package co.edu.uptc.testalbum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.uptc.model.Prize;

class PrizeTest {

	@Test
	void test() {
		Prize pz = new Prize();
		String organization, name, description;
		int year, day, month;
		organization = "GRAMMY´S";
		name = "grammy";
		description = "Mejor cancion del año";
		year = 2022;
		month = 11;
		day = 26;
		String org = organization;
		String nam = name;
		String desc = description;
		int year2 = year;
		int month2 = month;
		int day2 = day;	
		assertAll("Listado",
				() -> assertEquals(organization, org ,"organizacion no coincide"),
				() -> assertEquals(name, nam ,"nombre premio no coincide"),
				() -> assertEquals(description, desc , "descripcion no coincide"),
				() -> assertEquals(year, year2 , "año no coincide"),
				() -> assertEquals(month, month2 , "mes no coincide"),
				() -> assertEquals(day, day2 , "dia no coincide")
				);
		
	}

}
