package co.edu.uptc.testalbum;

import co.edu.uptc.control.*;
import co.edu.uptc.model.Song;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import co.edu.uptc.control.AlbumControl;

class SongTest {

	@Test
	void test() {
		Song songT = new Song();
		Scanner scan = new Scanner(System.in);
		
		String nameS,yearS,genreS;
		Duration recordSong;
		
		int num=0;
		int id=0;
		nameS="Superman";
		yearS="2002";
		genreS="Hip hop";
		recordSong = Duration.ofMinutes(5).plusSeconds(50);
		
		songT.setArrays(1);
		songT.setId(id, num);
		songT.setNameSong(nameS, num);
		songT.setRecordSong(5,50,num);
		songT.setGenreSong(genreS, num);
		
		assertAll("Listado",
		() -> assertEquals(num,songT.getId(num) ,"ID no coincide"),
		() -> assertEquals(nameS,songT.getNameSong(num) ,"Nombre no coincide"),
		() -> assertEquals(genreS,songT.getGenreSong(num) ,"Genero no coincide"),
		() -> assertEquals(recordSong,songT.getRecordSong(num) ,"Duracion no coincide")
		);
	}

}
