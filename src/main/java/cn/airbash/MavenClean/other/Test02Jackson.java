package cn.airbash.MavenClean.other;

import org.junit.Test;

import cn.airbash.MavenClean.entity.user;
import cn.airbash.MavenClean.entity.userList;
import cn.airbash.MavenClean.other.utils.jacksonUtil;

public class Test02Jackson {

	user user = new user();
	
	/**
	 * object>>>string;string>>>object
	 */
	@Test
	public void test01() {
		try {
			String string = jacksonUtil.object2json(user);
			System.out.println(string);
			user user2 = jacksonUtil.arraysjson2object(string, user.class);
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
			userList user = jacksonUtil.arraysjson2object(string, userList.class);
			System.out.println(user);
			 userList user2 = jacksonUtil.json2object(string, userList.class);
			System.out.println(user2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
