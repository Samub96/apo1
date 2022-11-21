package model;
import java.util.ArrayList;
import java.time.LocalDate;


public class Controller {
	
	
	
	private ArrayList<Song>songs;
	private ArrayList<Podcast>podcasts;
	private ArrayList<Artist>artist;
	private ArrayList<StandarUser>standar;
	private ArrayList<PremiumUser>premium;
	private ArrayList<ContentCreator>cc;
	
	
	
	
	
	public Controller(){
		
		artist = new ArrayList<Artist>();
		premium = new ArrayList<PremiumUser>();
		standar = new ArrayList<StandarUser>();
		podcasts = new ArrayList<Podcast>();
		cc = new ArrayList<ContentCreator>();
		songs = new ArrayList<Song>();
		
		
	}
	
	/**
	 * 
	 * @param nickname
	 * @param id
	 * @param vinculated
	 * @return
	 */
	public boolean registerPremiumUser(String nickname, String id, LocalDate vinculated) {
		
		PremiumUser premiumUser = new PremiumUser(nickname, id, vinculated);
											
		premium.add(premiumUser);
		
		
		return true;
	}
	
	/**
	 * 
	 * @param nickname
	 * @param id
	 * @param vinculated
	 * @return
	 */
	
public boolean registerStandar(String nickname, String id, LocalDate vinculated) {
		
		StandarUser standUser = new StandarUser(nickname, id, vinculated); 
		
		standar.add(standUser);
		
		return true;
	}


/**
 * 
 * @param nickname
 * @param id
 * @param vinculated
 * @return
 */
public boolean registerArtist(String nickname, String id, LocalDate vinculated) {
	
											
	Artist art = new Artist( nickname, id, vinculated);
	
	artist.add(art);
	
	
	return true;
}


/**
 * 
 * @param nickname
 * @param id
 * @param vinculated
 * @return
 */
public boolean registerCC(String nickname, String id, LocalDate vinculated) {
	
	ContentCreator contenido = new ContentCreator(nickname, id, vinculated);
	
	cc.add(contenido);
											
	return true;
}


	/**
	 * 
	 * @param name
	 * @param album
	 * @param duration
	 * @param solds
	 * @param urlPicture
	 * @return
	 */

	public boolean registersong(String name, String album, double duration, double solds, String urlPicture) {
		
		Song song = new Song(name, album, duration, solds, urlPicture);
		
		songs.add(song);
		
		
		return true;
		
	}
	
	
	/**
	 * 
	 * @param name
	 * @param album
	 * @param duration
	 * @param solds
	 * @param urlPicture
	 * @param type
	 * @param descrption
	 * @return
	 */
	
	public boolean registerPodcast(String name, String album, double duration,  String urlPicture, int type,String descrption) {
		
		Podcast podcast = new Podcast(name, album, duration,  urlPicture, type, descrption);
		
		podcasts.add(podcast);
		
		
		return true;
	}
	
	
	/**
	 * 
	 * @return
	 */
	
	public String showUsers() {
		
		String msg = "";
		
		for (int i = 0; i< artist.size() && i <  cc.size() && i<premium.size() && i<standar.size(); i++) {
			
			msg += "Artists Users \n" +
					artist.get(i).getNickname()
					+"\n"
					+"Content Crator users \n"
					+cc.get(i).getNickname()
					+"\n"
					+"Premium Users \n"
					+premium.get(i).getNickname()
					+"\n"
					+"Standar Users \n"
					+standar.get(i).getNickname();
			
		}
		
		return msg;
	}
	
	
	public String showUsersPremium() {
		
		String msg = "";
		
		
		for (int i = 0; i<premium.size() ; i++) {
		
		msg += "Premium Users \n"
				+premium.get(i).getNickname();
		}
		
		return msg;
		
	}
	
	public String showUsersStandart() {
		
		String msg = "";
		
		
		for (int i = 0; i<standar.size() ; i++) {
		
		msg += "Standart Users \n"
				+standar.get(i).getNickname();
		}
		
		return msg;
		
	}
	
	public String showUsersAtrist() {
		
		String msg = "";
		
		
		for (int i = 0; i<artist.size() ; i++) {
		
		msg += "Artist Users \n"
				+artist.get(i).getNickname();
		}
		
		return msg;
		
	}

	public String showUsersCC() {
		
		String msg = "";
		
		
		for (int i = 0; i<cc.size() ; i++) {
		
		msg += "Content creator Users \n"
				+cc.get(i).getNickname();
		}
		
		return msg;
		
	}
	
	/**
	 * 
	 * @return
	 */
	
	public String showSong() {
		
		String msg = "";
		
		for (int i = 0; i<songs.size();i++) {
			
			msg += "Songs \n"
					+ songs.get(i).getName();
			
		}
		
		return msg;
		
	}
	

}
