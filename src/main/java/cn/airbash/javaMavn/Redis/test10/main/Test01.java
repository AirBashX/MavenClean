package cn.airbash.javaMavn.Redis.test10.main;

import com.google.gson.Gson;

import cn.airbash.javaMavn.Redis.test10.pojo.Student;
/**
 * ���Լ����ܷ��ȡ��redis
 */
import redis.clients.jedis.Jedis;

/**
 * ʹ��gson�������
 * @author ZSP
 *
 */
public class Test01 {

	public static void main(String[] args) {
		
		Jedis jedis = new Jedis("111.230.13.216", 6379);
		//������ͨ��
		String ping = jedis.ping();
		System.out.println(ping);
		
		Student student = new Student(1,"AKB48","Ů",50,"����");
		
		//��student����ת����String����
		Gson gson = new Gson();
		String json = gson.toJson(student);
		
		//��String�Ͱ��뵽redis
		jedis.set("Akb48", json);
		
		String string = jedis.get("Akb48");
		Student fromJson = gson.fromJson(string,Student.class);
		System.out.println(fromJson);
	}

}
