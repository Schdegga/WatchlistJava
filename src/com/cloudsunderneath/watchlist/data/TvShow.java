package com.cloudsunderneath.watchlist.data;

// Basic DataStructure holding all Information about a TvShow
public class TvShow {
	
	String title;
	int episode;
	int season;
	String DbShowName; /*eventually corrected name from TvRage-Database*/
	String Started;
	String Status;
	String Airtime;
	String Network;
	String latestEpisode;
	String nextEpisode;

	/**
	 * TvShowObject constructor
	 * @param title ShowTitle
	 * @param episode EpisodeNumber
	 * @param season SeasonNumber
	 */
	
	public TvShow(String title, int episode, int season)
	{
		this.title = title;
		this.episode = episode;
		this.season = season;
	}
	
	/**
	 * Change EpisodeNumber
	 * @param ep new episodeNumber
	 */
	
	public void setEpisode(int ep)
	{
		this.episode = ep;
	}
	
	/**
	 * Change SeasonNumber 
	 * @param seas new seasonNumber
	 */
	
	public void setSeason(int seas)
	{
		this.season = seas;
	}
	
	public String toString()
	{
		return "TvShow: "+title+" at Season: "+season+" and Episode: "+episode+"\n";
	}
}
