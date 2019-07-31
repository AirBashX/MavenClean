package cn.airbash.javaMavn.Redis.test01.main;

import redis.clients.jedis.Jedis;

/**
 * ����redis,���������
 * @author ZSP
 *
 */
public class Test01RedisClient {

	private static String path = "111.230.13.216";
	private static Integer port = 6379;
	public static void main(String[] args) {
		//����redis
		Jedis jedis = new Jedis(path,port);
		//����redis
		String ping = jedis.ping();
		System.out.println(ping);
		add(jedis);
		jedis.close();
	}
	
	public static void add(Jedis jedis) {
		/**
		 * ģ��:���redis����key�����,���������mysql�е���,��ӵ�redis��:���Խ�ʡ����
		 */
		if(jedis.exists("book")) {
			String book = jedis.get("book");
			System.out.println("redis�е���"+book);
		}else {
			String book="��ѧ";
			jedis.set("book","��ѧ");
			System.out.println("mysql�е���"+book);
		}
	}
}
