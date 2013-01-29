package com.cloudsunderneath.watchlist.data;

/**
 * Basic DataStructure holding all Information about a TvShow
 * @author Schdegga
 * @version 1.0
 * @since   2013-01-29   
 *
 */

public class TvShow {

	String title;
	int episode;
	int season;
	/**
	 * [unused] eventually stores the corrected name from TvRage-Database
	 */
	String DbShowName;
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
     * Get ShowTitle
	 * @return String ShowTitle
	 */
	
	public String getTitle() {
		return title;
	}

	/**
	 * Change ShowTitle
	 * @param title ShowTitle
	 */
	public void setTitle(String title) {
		this.title = title;
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
