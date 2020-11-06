package cn.airbash.MavenClean.entity;

import java.io.Serializable;
import java.util.List;

public class userList implements Serializable{

	private static final long serialVersionUID = -3421112948139834672L;

	private int id;
	private List<String> name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getName() {
		return name;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	public userList(int id, List<String> name) {
		super();
		this.id = id;
		this.name = name;
	}
	public userList() {
		super();
	}
	@Override
	public String toString() {
		return "userArrays [id=" + id + ", name=" + name + "]";
	}
	
	
}
