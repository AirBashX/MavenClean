package cn.airbash.javaMavn.Redis.test01.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisUtil {
	
	static private JedisPool jp;
	static {
		//1.���ÿ�
		JedisPoolConfig jpc = new JedisPoolConfig();
		jpc.setMaxTotal(5);
		jpc.setMaxIdle(1);
		String path = "111.230.13.216";
		int port = 6379;
		jp = new JedisPool(jpc,path,port);
	}
	
	public static Jedis getJedis() {
		Jedis jedis = jp.getResource();
		return jedis;
	}
	
	public static void close(Jedis jedis) {
		jedis.close();
	}
}
