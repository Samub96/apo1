package model;

import java.time.LocalDate;

public class StandarUser extends Customer {
	
	private String categoria;

	public StandarUser(String nickname, String id, LocalDate vinculated) {
		super(nickname, id, vinculated);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StandarUser [categoria=" + categoria + "]" +  "User [nickname=" + getNickname() + ", id=" + getId() + ", vinculated=" + getVinculated() + "]";
	}

	

}
