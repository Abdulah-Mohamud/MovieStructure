package com.MovieStructure.MovieStructure;

import com.MovieStructure.Movie;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MovieStructureApplicationTests {

	@Test
	public void testForFilmTitle(){
		Movie testMovie = new Movie(1,"Film1","Film Description",60,"PG",1);
		assertEquals("Film1", testMovie.getTitle(),"Film was not found");
	}

	@Test
	public void testForDescription(){
		Movie testMovie = new Movie(1,"Film1","Film Description",60,"PG",1);
		assertEquals("Film Description", testMovie.getDescription(),"Film Description was not found");
	}

	@Test
	public void testForLength(){
		Movie testMovie = new Movie(1,"Film1","Film Description",60,"PG",1);
		assertEquals(60, testMovie.getLength(),"Desired Film length was not found");
	}

	@Test
	public void testForRating(){
		Movie testMovie = new Movie(1,"Film1","Film Description",60,"PG",1);
		assertEquals("PG", testMovie.getRating(),"Desired rating was not found");
	}

	@Test
	public void testForLanguage(){
		Movie testMovie = new Movie(1,"Film1","Film Description",60,"PG",1);
		assertEquals(1, testMovie.getLanguage_id(),"Film is in its desired language");
	}

	void contextLoads() {
	}

}
