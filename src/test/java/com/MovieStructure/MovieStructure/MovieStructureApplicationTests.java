package com.MovieStructure.MovieStructure;

import com.MovieStructure.Film;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MovieStructureApplicationTests {

	Film testFilm = new Film(1,"Film1","Film Description",60,"PG",1);

	@Test
	public void testForFilmTitle(){
		assertEquals("Film1",testFilm.getTitle(),"Film was not found");
	}

	@Test
	public void testForDescription(){
		assertEquals("Film Description",testFilm.getDescription(),"Film Description was not found");
	}

	@Test
	public void testForLength(){
		assertEquals(60,testFilm.getLength(),"Desired Film length was not found");
	}

	@Test
	public void testForRating(){
		assertEquals("PG",testFilm.getRating(),"Desired rating was not found");
	}

	@Test
	public void testForLanguage(){
		assertEquals(1,testFilm.getLanguage_id(),"Film is in its desired language");
	}

	void contextLoads() {
	}

}
