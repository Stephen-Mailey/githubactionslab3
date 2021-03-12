import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ie.lyit.lab2.Movie;

/**
 * 
 */

/**
 * @author Stephen.Mailey
 *
 */
public class MovieTest {
	Movie movieList;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		movieList = new Movie();        
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void movieListEmptyAtBeginningTest() {        
		assertEquals(0, movieList.movieSelection().size());
	}
	
	@Test
	public void addingMovieGrowsListByOneTest() {               
		movieList.add("Lord of the Rings The Fellowship of the Rings");        
		assertEquals(1, movieList.movieSelection().size());
	}
	
	@Test
	public void addedMovieInTheListTest() {               
		movieList.add("Lord of the Rings The Fellowship of the Rings");        
		assertTrue(movieList.movieSelection().contains("Lord of the Rings The Fellowship of the Rings"));
	}
	
	@Test
	public void movieNotInTheListTest() {               
		movieList.add("Lord of the Rings The Fellowship of the Rings");        
		assertFalse(movieList.movieSelection().contains("Lord of the Rings The Two Towers"));
	}
	
	

}
