package model;

public class Podcast  extends Audio{

	private String descrption;
	private PodcastCategory category;
	
	

	public Podcast(String name, String album, double duration,  String urlPicture, int type,String descrption) {
		super(name, album, duration,  urlPicture);
		
		this.descrption = descrption;
		
		switch(type) {
		
		case 1:
			category = PodcastCategory.ENTERTAINMENT;
			break;
		case 2: 
			category = PodcastCategory.FASHION;
			break;
		case 3:
			category = PodcastCategory.GAME;
			break;
		case 4: 
			category = PodcastCategory.POLITCS;
			break;
		}
		
	}

	public String getDescrption() {
		return descrption;
	}

	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}

	public PodcastCategory getCategory() {
		return category;
	}

	public void setCategory(PodcastCategory category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Podcast [descrption=" + descrption + ", category=" + category + "]";
	}

	

	

	
	
}
