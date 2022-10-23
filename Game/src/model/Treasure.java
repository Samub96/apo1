package model;

public class Treasure {
	private String url;
	private int position_X;
	private int position_y;
	public Treasure(String url, int position_X, int position_y) {
		
		this.url = url;
		this.position_X = position_X;
		this.position_y = position_y;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getPosition_X() {
		return position_X;
	}
	public void setPosition_X(int position_X) {
		this.position_X = position_X;
	}
	public int getPosition_y() {
		return position_y;
	}
	public void setPosition_y(int position_y) {
		this.position_y = position_y;
	}
	@Override
	public String toString() {
		return "Treasure [url=" + url + ", position_X=" + position_X + ", position_y=" + position_y + "]";
	}
	
}
