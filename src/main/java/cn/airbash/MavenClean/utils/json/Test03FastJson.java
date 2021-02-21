package cn.airbash.MavenClean.utils.json;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

import cn.airbash.MavenClean.entity.User;

/**
 * fastjson工具类
 * @author ZSP
 */
public class Test03FastJson {

	/**
	 * tojson
	 */
	@Test
	public void test01() {
		User user = new User(1, "zhangsan");
		String json = JSON.toJSONString(user); //序列化
		System.out.println(json);
	}
	
	/**
	 * toObject
	 */
	@Test
	public void test02() {
		String json = "{\"id\":1,\"name\":\"张三\"}";
		User user = JSON.parseObject(json, User.class); //反序列化
		System.out.println(user);
	}
}
