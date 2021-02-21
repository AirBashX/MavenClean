package cn.airbash.MavenClean.jedis;

import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * redis连接池操作
 * @author ZSP
 *
 */
public class Test02RedisPool {
	@Test
	public void test01() {
		JedisPoolConfig jpc = new JedisPoolConfig();
		jpc.setMaxTotal(8);			//最大连接数,默认8
		jpc.setMaxTotal(8);			//最大空闲连接数,默认8
		jpc.setMinIdle(0);			//最小空闲连接数,默认0
		JedisPool jp = new JedisPool(jpc,"127.0.0.1",6379);
		Jedis jedis = jp.getResource();
		String ping = jedis.ping();
		System.out.println(ping);
	}
}
