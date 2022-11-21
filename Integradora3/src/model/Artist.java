package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Artist extends Producer {
	
	private ArrayList<Song> songs;
	

	public Artist(String nickname, String id, LocalDate vinculated) {
		super(nickname, id, vinculated);
		// TODO Auto-generated constructor stub
		songs = new ArrayList<Song>();
	}
	
	public boolean addSong(Song song) {
		songs.add(song);
		return true;
	}

	@Override
	public String toString() {
		return "Artist [songs=" + songs + "]";
	}
	

}
