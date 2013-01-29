package com.cloudsunderneath.watchlist;
import com.cloudsunderneath.watchlist.data.*;

class Main {

	public static void main(String[] args) {
		
		TvShow test = new TvShow("Test", 4 ,4);
		TvShow test2 = new TvShow("Test2", 3, 5);
		TvShowData data = new TvShowData();
		data.shows.add(test);
		data.shows.add(test2);
		System.out.println(data.toString());
	}

}
