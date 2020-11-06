package cn.airbash.MavenClean.other;

import org.junit.Test;

import cn.airbash.MavenClean.entity.User;
import cn.airbash.MavenClean.other.utils.jacksonUtil;

public class Test02Jackson {

	User user = new User();
	
	/**
	 * object>>>string;string>>>object
	 */
	@Test
	public void test01() {
		try {
			String string = jacksonUtil.object2json(user);
			System.out.println(string);
			User user2 = jacksonUtil.json2object(string, User.class);
			System.out.println(user2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
