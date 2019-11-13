package cn.airbash.javaMaven.Redis.test02jedisCluster;

import java.util.HashSet;
import java.util.Set;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

public class redisClusterConnection{
	public static void main(String[] args) {
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		Set<HostAndPort> nodes = new HashSet<HostAndPort>();
	}
		
}
