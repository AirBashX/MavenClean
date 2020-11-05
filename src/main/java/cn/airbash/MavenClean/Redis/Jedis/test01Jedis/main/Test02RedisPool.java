package cn.airbash.MavenClean.Redis.Jedis.test01Jedis.main;

import cn.airbash.MavenClean.Redis.Jedis.test01Jedis.Util.RedisUtils;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * redis连接池操作
 * @author ZSP
 *
 */
public class Test02RedisPool {

	private static JedisPool jedisPool;

	public static void main(String[] args) {
		redisPoolConnection();	
		//test02();
	}

	/**
	 * 测试redis连接池
	 */
	public static void redisPoolConnection() {
		// 1.创建JedisPoolConfig进行基础配置
		JedisPoolConfig jpc = new JedisPoolConfig();
		jpc.setMaxTotal(5);// 最大连接数
		jpc.setMaxIdle(1);// 最小空闲数

		// 2.使用jedisPool连接线程池
		String path = "111.230.13.216";
		int port = 6379;
		String password = "";
		jedisPool = new JedisPool(jpc, path, port,1000,password);
		Jedis jedis = jedisPool.getResource();
		//jedis.auth(password);
		// 3.测试连通性
		String ping = jedis.ping();
		System.out.println(ping);
	}
	
	/**
	 * 连接池增加/获取String数据
	 */
	public static void test02() {
		Jedis jedis = RedisUtils.getJedis();
		//Test01RedisClient.add(jedis);
		RedisUtils.close(jedis);
	}
}
