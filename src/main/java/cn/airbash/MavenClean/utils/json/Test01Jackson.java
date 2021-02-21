package cn.airbash.MavenClean.utils.json;

import org.junit.Test;

import cn.airbash.MavenClean.entity.User;
import cn.airbash.MavenClean.entity.UserList;

public class Test01Jackson {

	User user = new User();
	
	/**
	 * object>>>string;string>>>object
	 */
	@Test
	public void test01() {
		try {
			String string = JacksonUtil.object2json(user);
			System.out.println(string);
			User user2 = JacksonUtil.arraysjson2object(string, User.class);
			System.out.println(user2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 测试mapper.configure的作用,可以在工具类中查看
	 */
	@Test
	public void test02() {
		String string="{\"id\": 1,\"name\": [\"A1\", \"A2\"]}";
		try {
			UserList user = JacksonUtil.arraysjson2object(string, UserList.class);
			System.out.println(user);
			 UserList user2 = JacksonUtil.json2object(string, UserList.class);
			System.out.println(user2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
