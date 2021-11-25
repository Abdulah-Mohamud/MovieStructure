package com.MovieStructure.MovieStructure;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MovieStructureApplicationTests {

	Movie testFilm = new Movie("movieName", "The description", 56, 1);

	//////////////////////////////////film constructor tests ////////////////////////////////////////////
	@Test
	public void testForTitle(){
		assertEquals("movieName",testFilm.getTitle(),"Film title constructor not working");
	}
	@Test
	public void testForLanguage(){
		assertEquals(1,testFilm.getLanguage_id(),"Film language constructor not working");
	}
	@Test
	public void testForDescription(){
		assertEquals( "The description",testFilm.getDescription(),"Film description constructor not working");
	}
	@Test
	public void testForLength(){
		assertEquals( 56, testFilm.getLength(),"Film length constructor not working");
	}
}
