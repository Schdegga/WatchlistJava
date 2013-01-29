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
		if(!shows.contains(show))
			shows.add(show);
	}
	
	public void removeShow(String title)
	{
		int index = showIndex(title);
		if (index != -1)
			shows.remove(index);
	}
	
	
	public String toString()
	{
		String result = "";
		for(TvShow show : shows)
		{
			result+=show.toString();
		}
		return result;
	}
	
	/**
	 * Finds index at which a certain TvShow is located
	 * @param title ShowTitle
	 * @return Index of TvShow, -1 if show wasn´t found
	 */
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
