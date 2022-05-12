/**
 * 
 */
package com.chainsys.classandmethods;

/**
 * @author prav3109
 *
 */
public class Movie {
	   private  String Title;
	   private int NoOfSongs;
	   private int DurationOfTime;
	   private int NoOfActors;
	   private int NoOfSpot;
	
	   public String getTitle() {
			return Title;
		}
		public void setTitle(String title) {
			Title = title;
		}
	   
	   public int getNoOfSongs() {
		return NoOfSongs;
	}
	public void setNoOfSongs(int noOfSongs) {
		this.NoOfSongs = noOfSongs;
	}
	public int getDurationOfTime() {
		return DurationOfTime;
	}
	public void setDurationOfTime(int durationOfTime) {
		this.DurationOfTime = durationOfTime;
	}
	public int getNoOfActors() {
		return NoOfActors;
	}
	public void setNoOfActors(int noOfActors) {
		this.NoOfActors = noOfActors;
	}
	public int getNoOfSpot() {
		return NoOfSpot;
	}
	public void setNoOfSpot(int noOfSpot) {
		this.NoOfSpot = noOfSpot;
	}
	
	   }
