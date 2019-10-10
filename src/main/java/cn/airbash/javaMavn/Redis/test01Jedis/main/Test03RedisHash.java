package cn.airbash.javaMavn.Redis.test01Jedis.main;

import java.util.HashMap;
import java.util.Map;

import cn.airbash.javaMavn.Redis.test01Jedis.Util.RedisUtil;
import cn.airbash.javaMavn.Redis.test01Jedis.untity.User;
import redis.clients.jedis.Jedis;

/**
 * hash数值操作
 * @author ZSP
 */
public class Test03RedisHash {

	public static void main(String[] args) {
		//hash01();
		hash02();
	}

	/**
	 * ֱ�Ӵ������
	 */
	public static void hash01() {
		Jedis jedis = RedisUtil.getJedis();
		String key="users";
		if(jedis.exists(key)) {
			Map<String, String> map = jedis.hgetAll(key);
			System.out.println("redis��ѯ�Ľ��");
			System.out.println(map);
		}else {
			//��ѯ���ݿ�,redis---set,���ؽ��
			jedis.hset(key,"id","1");
			jedis.hset(key,"name","����");
			jedis.hset(key,"age","22");
			jedis.hset(key, "remark", "����һλ��ͬѧ");
			System.out.println("mysql��ѯ�Ľ��");
			System.out.println(jedis.hgetAll(key));
		}
	}
	
	/**
	 * ���������������
	 */
	public static void hash02() {
		Jedis jedis = RedisUtil.getJedis();
		Integer id = 1;
		String key = User.getKeyName(id);
		if(jedis.exists(key)) {
			//redis�ж�ȡ����
			Map<String, String> map = jedis.hgetAll(key);
			//����redis��hash�д洢�Ķ���String����,������Ҫ����ת��
			User user = new User(Integer.valueOf(map.get("id")), map.get("name"), map.get("username"), map.get("password"), Integer.valueOf(map.get("age")));
			System.out.println(user);
		}else {
			//mysql�ж�ȡ����,����mysql������ӵ�redis��
			User user = new User(1, "����", "lisi", "��������", 15);
			HashMap<String, String> hash = new HashMap<String, String>();
			hash.put("id", user.getId()+"");
			hash.put("name", user.getName());
			hash.put("username", user.getUsername());
			hash.put("password", user.getPassword());
			hash.put("age", user.getId()+"");
			jedis.hmset(key, hash);
			System.out.println(user);
		}
		RedisUtil.close(jedis);
	}
}
