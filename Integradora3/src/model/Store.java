package model;

public class Store {
	
	
	private Song song;
	private Podcast podcast;
	private Artist artist;
	private ContentCreator cc;
	
	
	public Store(Song song, Podcast podcast, Artist artist, ContentCreator cc) {
		super();
		this.song = song;
		this.podcast = podcast;
		this.artist = artist;
		this.cc = cc;
	}
	
	
	public Song getSong() {
		return song;
	}
	public void setSong(Song song) {
		this.song = song;
	}
	public Podcast getPodcast() {
		return podcast;
	}
	public void setPodcast(Podcast podcast) {
		this.podcast = podcast;
	}
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	public ContentCreator getCc() {
		return cc;
	}
	public void setCc(ContentCreator cc) {
		this.cc = cc;
	}
	@Override
	public String toString() {
		return "Store [song=" + song + ", podcast=" + podcast + ", artist=" + artist + ", cc=" + cc + "]";
	}
	
	

}
