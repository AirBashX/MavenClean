package cn.airbash.javaMavn.Redis.test10.main;

import java.util.Random;
import java.util.UUID;

import redis.clients.jedis.Jedis;

public class Test03List1 {

	private static Jedis jedis;

	public static void main(String[] args) {
		jedis = new Jedis("111.230.13.216",6379);
		Random random = new Random();
		
		//��������
		while(true) {
			try {
				//����������ٶ���һ���������,��1-2��֮��
				Thread.sleep(random.nextInt(1000)+1000);
				String taskid = UUID.randomUUID().toString();
				jedis.lpush("task-queue", taskid);
				System.out.println("����������в���һ���µ�����:"+taskid);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
