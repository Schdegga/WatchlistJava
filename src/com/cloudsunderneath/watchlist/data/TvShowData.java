package com.cloudsunderneath.watchlist.data;
import java.util.ArrayList;

// Vector of TvShows, holds all TvShows at runtime
public class TvShowData {
	
	public ArrayList<TvShow> shows;
	
	public TvShowData()
	{
		shows = new ArrayList<TvShow>();
	}
	
	/**
	 * Adds TvShow to ArrayList. Checks if show is already there.
	 * @param show Show that is added
	 */
	public void addShow(TvShow show)
	{
		int index = showIndex(show.getTitle());
		
		if(index == -1)
			shows.add(show);
	}
	
	/**
	 * 
	 */
	public String toString()
	{
		String result = "";
		for(TvShow show : shows)
		{
			result+=show.toString();
		}
		return result;
	}
	
	
	private int showIndex(String title)
	{
		for(int i = 0; i < shows.size(); i++)
		{
			if(shows.get(i).title == title)
				return i;
		}
		
		return -1;
	}
	
}
