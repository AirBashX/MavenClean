package cn.airbash.javaMaven.Redis.test01Jedis.untity;

public class User {
	private Integer id;
	private String name;
	private String username;
	private String password;
	private Integer age;
	
	public static String getKeyName(Integer id) {
		return "user:"+id;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public User(Integer id, String name, String username, String password, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.age = age;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", age="
				+ age + "]";
	}
}
