package cn.airbash.MavenClean.Redis.test10.main;

import cn.airbash.MavenClean.Redis.test10.pojo.Student;
/**
 * ���Լ����ܷ��ȡ��redis
 */
import redis.clients.jedis.Jedis;

public class Test02Gson {

	public static void main(String[] args) {
		
		Jedis jedis = new Jedis("111.230.13.216", 6379);
		Student student = new Student();
		//�����ܷ���redis
		//String ping = jedis.ping();
		//System.out.println(ping);
		
	}

}
