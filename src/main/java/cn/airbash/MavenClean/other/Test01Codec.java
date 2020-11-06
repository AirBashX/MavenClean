package cn.airbash.MavenClean.other;

import org.apache.commons.codec.digest.DigestUtils;

public class Test01Codec {
	public static void main(String[] args) {
		String md5Hex = DigestUtils.md5Hex("123");
		System.out.println(md5Hex);
	}
}
