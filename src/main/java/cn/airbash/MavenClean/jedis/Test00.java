package cn.airbash.MavenClean.jedis;

import org.junit.Test;

import com.google.gson.Gson;

import cn.airbash.MavenClean.entity.user;
import cn.airbash.MavenClean.jedis.utils.RedisUtils;
import redis.clients.jedis.Jedis;

/**
 * 使用gson,将对象存储在key中
 * 
 * @author ZSP
 *
 */
public class Test00 {
	Jedis jedis = RedisUtils.getJedis();
	Gson gson = new Gson();

	/**
	 * 添加
	 */
	@Test
	public void test01() {
		jedis.set("test01a", "english");
		jedis.set("test01b", "中文");
	}
	
	/**
	 * 通过gson将对象转化为string存储为key值
	 */
	@Test
	public void test02() {
		user student = new user(1, "张三");
		String json = gson.toJson(student);
		jedis.set("test02", json);
	}

	/**
	 * 通过gson将string值提取出来
	 */
	@Test
	public void test03() {
		String string = jedis.get("test02");
		user student = gson.fromJson(string,user.class);
		System.out.println(student);
	}

}
