package cn.airbash.MavenClean.Redis.Jedis.test10.main;

import com.google.gson.Gson;

import cn.airbash.MavenClean.Redis.Jedis.test10.pojo.Student;
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
		//检测redis连通性
		String ping = jedis.ping();
		System.out.println(ping);
		
		Student student = new Student(1,"AKB48","Ů",50,"����");
		
		//将student实体类转化为json字符串
		Gson gson = new Gson();
		String json = gson.toJson(student);
		
		//��String�Ͱ��뵽redis
		jedis.set("Akb48", json);
		
		String string = jedis.get("Akb48");
		Student fromJson = gson.fromJson(string,Student.class);
		System.out.println(fromJson);
	}

}