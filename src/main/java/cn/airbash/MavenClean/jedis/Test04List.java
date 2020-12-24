package cn.airbash.MavenClean.jedis;

import java.util.Random;
import java.util.UUID;

import org.junit.Test;

import cn.airbash.MavenClean.jedis.utils.RedisUtils;
import redis.clients.jedis.Jedis;

public class Test04List {

	private static Jedis jedis=RedisUtils.getJedis();;

	
	@Test
	public void test01() {
		
		Random random = new Random();

		while (true) {
			try {
				Thread.sleep(random.nextInt(1000) + 1000);
				String taskid = UUID.randomUUID().toString();
				jedis.lpush("task-queue", taskid);
				System.out.println("测试:" + taskid);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
