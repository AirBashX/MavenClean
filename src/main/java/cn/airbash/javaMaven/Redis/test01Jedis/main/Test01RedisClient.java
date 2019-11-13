package cn.airbash.javaMaven.Redis.test01Jedis.main;

import redis.clients.jedis.Jedis;

/**
 * 连接redis
 * @author ZSP
 *
 */
public class Test01RedisClient {

	private static String host = "111.230.13.216";
	private static Integer port = 6379;
	private static String password = "";
	public static void main(String[] args) {
		//连接redis
		Jedis jedis = new Jedis(host,port);
		jedis.auth(password);
		//检验是否连接成功
		String ping = jedis.ping();
		System.out.println(ping);
		//add(jedis);
		jedis.close();
	}
	
	/**
	 * String数据的添加和查询
	 * @param jedis
	 */
	public static void add(Jedis jedis) {
		/**
		 * 首先查询redis中是否含有数据,如果有获取数据,如果没有模拟查询数据库并获取数据
		 */
		if(jedis.exists("book")) {
			String book = jedis.get("book");
			System.out.println("redis中获取:"+book);
		}else {
			String book="数学";
			jedis.set("book","数学");
			System.out.println("mysql中获取"+book);
		}
	}
}
