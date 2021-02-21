package cn.airbash.MavenClean.jedis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cn.airbash.MavenClean.jedis.utils.RedisUtils;
import redis.clients.jedis.Jedis;

public class Test03String {
	private Jedis jedis;
	
	@Before
	public void test() {
		jedis = RedisUtils.getJedis();
	}
	
	@After
	public void after() {
		RedisUtils.close(jedis);
	}
	
	/**
	 * 1.检测连通性
	 */
	@Test
	public void test01() {
		String ping = jedis.ping();
		System.out.println(ping);
	}
	
	/**
	 * 2.get/set
	 */
	@Test
	public void test02() {
		jedis.set("test", "123");
		String string = jedis.get("test");
		System.out.println(string);
	}
	
	/**
	 * 3.expire/ttl
	 */
	@Test
	public void test03() {
		jedis.expire("test", 150);
		Long ttl = jedis.ttl("test");
		System.out.println(ttl);
	}
	
	/**
	 * 4.exists/del
	 */
	@Test
	public void test04() {
		Boolean exists = jedis.exists("test");
		System.out.println(exists);
		Long del = jedis.del("test");
		System.out.println(del);
	}
	
	/**
	 * 5.set plus
	 */
	@Test
	public void test05() {
		String set1 = jedis.set("test2","test","nx");
		String set2 = jedis.set("test","test","nx","ex",100);
		System.out.println(set1);
		System.out.println(set2);
	}
}
