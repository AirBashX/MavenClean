package cn.airbash.MavenClean.jedis.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisUtils {
	
	static private JedisPool jp;
	static {
		//1.连接redis
		JedisPoolConfig jpc = new JedisPoolConfig();
		jpc.setMaxTotal(5);
		jpc.setMaxIdle(1);
		String path = "127.0.0.1";
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
