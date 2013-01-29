
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
	
	public TvShow(String title, int episode, int season)
	{
		this.title = title;
		this.episode = episode;
		this.season = season;
	}
	
	public void setEpisode(int ep)
	{
		this.episode = ep;
	}
	
	public void setSeason(int seas)
	{
		this.season = seas;
	}
}
