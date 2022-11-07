package model;

public abstract class Audio {
	private String name;
	private String album;
	private double duration;
	private double solds;
	private String urlPicture;
	
	public Audio(String name, String album, double duration, double solds, String urlPicture) {
		
		this.name = name;
		this.album = album;
		this.duration = duration;
		this.solds = solds;
		this.urlPicture = urlPicture;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public double getSolds() {
		return solds;
	}

	public void setSolds(double solds) {
		this.solds = solds;
	}

	public String getUrlPicture() {
		return urlPicture;
	}

	public void setUrlPicture(String urlPicture) {
		this.urlPicture = urlPicture;
	}

	@Override
	public String toString() {
		return "Audio [name=" + name + ", album=" + album + ", duration=" + duration + ", solds=" + solds
				+ ", urlPicture=" + urlPicture + "]";
	}
	
	
	

}
