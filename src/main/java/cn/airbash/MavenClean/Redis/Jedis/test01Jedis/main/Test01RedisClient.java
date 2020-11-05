package cn.airbash.MavenClean.Redis.Jedis.test01Jedis.main;

import org.junit.Before;
import org.junit.Test;

import redis.clients.jedis.Jedis;

/**
 * 连接redis
 * 
 * @author ZSP
 *
 */
public class Test01RedisClient {

	private String host = "127.0.0.1";
	private Integer port = 6379;
	// private String password = "";
	private Jedis jedis = null;

	@Before
	public void init() {
		// 连接redis
		jedis = new Jedis(host, port);
		// 输入密码:没有密码时不需要输入
		// jedis.auth(password);
	}

	/**
	 * 检验连通性
	 */
	@Test
	public void connect() {
		// 连接redis
		jedis = new Jedis(host, port);
		// 输入密码:没有密码时不需要输入
		// jedis.auth(password);
		// 检验是否连接成功
		String ping = jedis.ping();
		System.out.println(ping);
		// add(jedis);
		jedis.close();
	}

	/**
	 * 向reids中添加数据
	 */
	@Test
	public void set() {
		jedis.set("test01set","15");
	}
	
	
	/**
	 * String数据的添加和查询
	 */
	@Test
	public void get() {
		/**
		 * 模拟redis+mysql流程,先从reids中查询,有返回,没有再从mysql中查询
		 */
		if (jedis.exists("book")) {//从redis中查询书
			String book = jedis.get("book");
			System.out.println("redis中获取:" + book);
		} else {
			String book = "数学";
			jedis.set("book", "数学");
			System.out.println("mysql中获取" + book);
		}
	}
}
