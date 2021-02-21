package cn.airbash.MavenClean.jedis;

import org.junit.After;
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
	private Jedis jedis;
	
	@Test
	public void test01() {
		jedis = new Jedis("127.0.0.1",6379);	//ip+端口号
		jedis.auth("");								//密码
		String ping = jedis.ping();
		System.out.println(ping);
	}
	
	@After
	public void after() {
		jedis.close();
	}
}
