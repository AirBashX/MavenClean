package cn.airbash.MavenClean.utils.json;

import org.junit.Test;

import com.google.gson.Gson;

import cn.airbash.MavenClean.entity.User;

/**
 * Gson工具类
 * @author ZSP
 *
 */
public class Test02Gson {
	
	Gson gson = new Gson();
	
	/**
	 * 对象转换为json
	 */
	@Test
	public void test01() {
		User user = new User(1,"张三");
		String json = gson.toJson(user);
		System.out.println(json);
	}
	
	/**
	 * 字符串转换为对象
	 */
	@Test
	public void test02() {
		String json = "{\"id\":1,\"name\":\"张三\"}";
		User user = gson.fromJson(json, User.class);
		System.out.println(user);
	}
	
}
