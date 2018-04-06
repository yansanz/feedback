package fr.west.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comment")
public class Comment implements Serializable {
 
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
 
	@Column(name = "user_name")
	private String userName;
 
	@Column(name = "comment")
	private String comment;
 
	//constructor
	public Comment() {
	}
	

	public Comment(long id, String userName, String comment) {
		super();
		this.id = id;
		this.userName = userName;
		this.comment = comment;
	}
	// Dysplay object 
	
	@Override
	public String toString() {
		return "Comment [id=" + id + ", userName=" + userName + ", comment=" + comment + "]";
	}
	

	//getter and setter
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}