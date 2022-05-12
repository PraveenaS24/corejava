/**
 * 
 */
package com.chainsys.unittest;

import com.chainsys.classandmethods.Movie;

/**
 * @author prav3109
 *
 */
public class MovieTester {

	/**
	 * @param args
	 */
	public static void testMovie()
	{
		Movie firstMovie=new Movie();
        firstMovie.setTitle("Beast");
        firstMovie.setNoOfSongs(6);
        firstMovie.setDurationOfTime(3);
        firstMovie.setNoOfActors(2);
        firstMovie.setNoOfSpot(4);
        System.out.println(firstMovie.getTitle());
        System.out.println(firstMovie.getNoOfSongs());
        System.out.println(firstMovie.getDurationOfTime());
        System.out.println(firstMovie.getNoOfActors());
        System.out.println(firstMovie.getNoOfSpot());
}


}