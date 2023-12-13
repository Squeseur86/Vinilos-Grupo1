package co.edu.uptc.testalbum;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.Test;

import co.edu.uptc.model.Band;

class BandTest {

	@Test
	void test() {
		Band bad = new Band();
		int num=0;
		int id=0;
		Calendar creationDate = null;
		String nameArtist,imageArtist, descriptionArtist;
		nameArtist = "Payphone";
		imageArtist = "Payphone.png";
		descriptionArtist = "Pop band";
		String name = nameArtist;
		String image = imageArtist;
		String descri = descriptionArtist;
		
		
		assertAll("Listado",
				() -> assertEquals(nameArtist, name ,"nombre no coincide"),
				() -> assertEquals(imageArtist, image ,"imagen no coincide"),
				() -> assertEquals(descriptionArtist, descri , "descripcion no coincide")
				);
		
		
	}

}
