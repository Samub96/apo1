package model;



public class Song extends Audio {

	
	private double solds;
	
	public Song(String name, String album, double duration, double solds, String urlPicture) {
		super(name, album, duration,  urlPicture);
		
		this.solds = solds;
		// TODO Auto-generated constructor stub
	}

	
	
	public double getSolds() {
		return solds;
	}



	public void setSolds(double solds) {
		this.solds = solds;
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
