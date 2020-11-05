package cn.airbash.MavenClean.Apache.codec;

import org.apache.commons.codec.digest.DigestUtils;

public class Test01Test {
	public static void main(String[] args) {
		String md5Hex = DigestUtils.md5Hex("123");
		System.out.println(md5Hex);
	}
}
