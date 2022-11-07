package ui;

import java.util.Scanner;

import model.Controller;


public class NeoTunnes {
	private Scanner reader;
	private  Controller controller;

	public static void main(String[] args) {
		
		System.out.println( "Welcome to NEOTUNES");
		
		NeoTunnes neotunnes = new NeoTunnes();
		
		int option = 0;

		do {
			option = neotunnes.showMenu();
			neotunnes.executeOperation(option);

		} while (option != 0);

	}
	
	public NeoTunnes() {
		reader = new Scanner(System.in);
		controller = new Controller();
	}
	
	public int showMenu() {
		
		int option = 0;
		
		System.out.println("Please pick an option\n" 
				+ "(1) Create an user \n"
				+ "(2) Register song  \n" 
				+ "(3) register Podcast \n"
				+ "(4) Create a Playlist \n"
				+ "(5) Share playlist \n"
				+ "(6) Reproduce playlist \n"
				+ "(7) song Store \n"
				+ "(8) Info \n"
				+ "(0) To leave the application" 
				+ "\n");
		option = reader.nextInt();
		reader.nextLine();
		
		return option;
		
	}

	public void executeOperation(int operation) {

		switch (operation) {
		case 0:
			System.out.println("Thanks for using our services!");
			break;
		case 1:
			registerUser();
			break;
		case 2:
			registerSong();
			break;
		case 3:
			registerPodcast();
			break;

		case 4:
			createPlaylist();
			break;

		case 5:
			sharePlaylist();
			break;
			
		case 6:
			reproducePlaylist();
			break;
		case 7:
			buySong();
			break;
		case 8 :
			info();
			break;

		default:
			System.out.println("Error, type a valid option");

		}

	}
	
	/**
	 * muestra info de las canciones registradas, podcasts,tipo de usuario y canciones compradas  
	 */
	private void info() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * registra los podcast
	 */
	private void registerPodcast() {
		// TODO Auto-generated method stub
		
	}
	 /**
	  * registra las canciones compradas
	  */
	private void buySong() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * simula la reproduccion
	 */
	private void reproducePlaylist() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * da opcion de compartir el playlist
	 */
	private void sharePlaylist() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * crea el playlist 
	 */
	private void createPlaylist() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * registra las canciones
	 */
	private void registerSong() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * registra el usuario
	 */
	private void registerUser() {
		
		System.out.println("What user will be registered\n"
							+"[1] Premium User\n"
							+"[2] Standart User\n"
							+"[3] Artist User\n"
							+"[4] Content Creator User\n");
		
		String optiontemp = reader.nextLine();
		int option = Integer.parseInt(optiontemp);
		switch(option) {
		case 1:
			registerPremiumUser();
			break;
		case 2:
			registerStandartUser();
			break;
		case 3:
			registerArtistUser();
			break;
		case 4: 
			registerCCUser();
			break;
		}
		
		
		
	}

	private void registerCCUser() {
		// TODO Auto-generated method stub
		
	}

	private void registerArtistUser() {
		// TODO Auto-generated method stub
		
	}

	private void registerStandartUser() {
		// TODO Auto-generated method stub
		
	}
	
	
	/**
	 * register a premium user
	 */

	private void registerPremiumUser() {
		
		System.out.println("What is the NickName?");
		String nickName = reader.nextLine();
		System.out.println("Write the id");
		String id = reader.nextLine();
		
		


		
	}

}


