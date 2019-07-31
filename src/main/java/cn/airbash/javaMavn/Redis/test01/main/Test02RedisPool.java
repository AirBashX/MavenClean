package cn.airbash.javaMavn.Redis.test01.main;

import cn.airbash.javaMavn.Redis.test01.util.RedisUtil;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class Test02RedisPool {

	private static JedisPool jedisPool;

	public static void main(String[] args) {

		//test01();	
		test02();
	}

	/**
	 * ��������
	 */
	public static void test01() {
		// 1.�������ӳ� RedisPool:����������Ϣ
		JedisPoolConfig jpc = new JedisPoolConfig();
		jpc.setMaxTotal(5);// ���������
		jpc.setMaxIdle(1);// ��������

		// 2.���ӳ�
		String path = "111.230.13.216";
		int port = 6379;
		jedisPool = new JedisPool(jpc, path, port);
		Jedis jedis = jedisPool.getResource();

		// 3.�����ͨ��
		String ping = jedis.ping();
		System.out.println(ping);
	}
	
	/**
	 * ���ù����������̳߳�
	 */
	public static void test02() {
		//���ù�����:����redis
		Jedis jedis = RedisUtil.getJedis();
		//����test01���е�add����(��������)
		Test01RedisClient.add(jedis);
		//���ù�����:�ر�redis
		RedisUtil.close(jedis);
	}
}
