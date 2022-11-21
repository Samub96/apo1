package model;



public class Song extends Audio {

	
	
	public Song(String name, String album, double duration, double solds, String urlPicture) {
		super(name, album, duration, solds, urlPicture);
		// TODO Auto-generated constructor stub
	}

	
	
	public String toString() {
		return "Songs"
				+ " [name " + getName()
				
				+ ", album " + getAlbum() 
				+ ", duration " + getDuration() 
				+ ", solds " + getSolds()
				+ ", urlPicture=" + getUrlPicture() + "]";
	}
}
