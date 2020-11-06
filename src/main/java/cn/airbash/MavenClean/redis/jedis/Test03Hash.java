package cn.airbash.MavenClean.redis.jedis;

import java.util.HashMap;
import java.util.Map;

import cn.airbash.MavenClean.entity.user;
import cn.airbash.MavenClean.redis.jedis.Utils.RedisUtils;
import redis.clients.jedis.Jedis;

/**
 * hash数值操作
 * @author ZSP
 */
public class Test03Hash {

	public static void main(String[] args) {
		//hash01();
		hash02();
	}

	public static void hash01() {
		Jedis jedis = RedisUtils.getJedis();
		String key="users";
		if(jedis.exists(key)) {
			Map<String, String> map = jedis.hgetAll(key);
			System.out.println("redis��ѯ�Ľ��");
			System.out.println(map);
		}else {
			jedis.hset(key,"id","1");
			jedis.hset(key,"name","����");
			jedis.hset(key,"age","22");
			jedis.hset(key, "remark", "����һλ��ͬѧ");
			System.out.println("mysql��ѯ�Ľ��");
			System.out.println(jedis.hgetAll(key));
		}
	}
	
	public static void hash02() {
		Jedis jedis = RedisUtils.getJedis();
		Integer id = 1;
		String key = user.getKeyName(id);
		if(jedis.exists(key)) {
			Map<String, String> map = jedis.hgetAll(key);
			user user = new user(Integer.valueOf(map.get("id")), map.get("name"));
			System.out.println(user);
		}else {
			user user = new user(1, "redis");
			HashMap<String, String> hash = new HashMap<String, String>();
			hash.put("id", user.getId()+"");
			hash.put("name", user.getName());
			jedis.hmset(key, hash);
			System.out.println(user);
		}
		RedisUtils.close(jedis);
	}
}
