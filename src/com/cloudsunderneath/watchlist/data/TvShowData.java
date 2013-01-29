package com.cloudsunderneath.watchlist.data;
import java.util.ArrayList;

// Vector of TvShows, holds all TvShows at runtime
public class TvShowData {
	
	public ArrayList<TvShow> shows;
	
	public TvShowData()
	{
		shows = new ArrayList<TvShow>();
	}
	
	public String toString()
	{
		String result = "";
		for(TvShow show : shows)
		{
			result.concat(show.toString());
			
		}
		return result;
	}
	
}
