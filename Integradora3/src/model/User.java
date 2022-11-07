package model;

import java.time.LocalDate;

public abstract class User {
	private String nickname;
	private String id;
	private LocalDate vinculated;
	public User(String nickname, String id, LocalDate vinculated) {
		super();
		this.nickname = nickname;
		this.id = id;
		this.vinculated = vinculated;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public LocalDate getVinculated() {
		return vinculated;
	}
	public void setVinculated(LocalDate vinculated) {
		this.vinculated = vinculated;
	}
	
	@Override
	public String toString() {
		return "User [nickname=" + nickname + ", id=" + id + ", vinculated=" + vinculated + "]";
	}

	
}
