package co.edu.uptc.testalbum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.uptc.control.AlbumControl;

class ListAlbumTest {

	@Test
	void test() {
		AlbumControl ac = new AlbumControl();
		String[] album1 = {"Eminem", "image.jpg", "eminem album", "Hip Hop ", "2002", "05", "26","1", "17", "00"};
		String[] album2 = {"Eminem", "image.jpg", "eminem album", "Hip Hop ", "2002", "05", "26","1", "17", "00"};
		String[] album3 = {"Hechizos pocimas y brujerias", "image.jpg", "album mago de oz", "Hip Hop ", "2012", "11", "16","1", "03", "00"};
		String[] album4 = {"Hechizos pocimas y brujerias", "image.jpg", "album mago de oz", "Hip Hop ", "2012", "11", "16","1", "03", "00"};
		assertArrayEquals(album1, album2, "Los arreglos no son iguales");
		assertArrayEquals(album3, album4, "los arreglos no son iguales");
	}

}
