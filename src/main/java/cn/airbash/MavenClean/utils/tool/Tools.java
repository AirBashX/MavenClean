package cn.airbash.MavenClean.utils.tool;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.hash.Hashing;
import com.google.common.io.Files;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;

/**
 * hutool+guava+commons
 * @author ZSP
 *
 */
public class Tools {

	/**
	 * 散列值相关
	 */
	@Test
	public void test01Codec() {
		String md53 = DigestUtils.md5Hex("你好");
		System.out.println(md53);
		String sha3 = DigestUtils.sha256Hex("你好");
		System.out.println(sha3);
		
		String md51 = SecureUtil.md5("你好");
		System.out.println(md51);
		String sha1 = SecureUtil.sha256("你好");
		System.out.println(sha1);
		
		String md52 = Hashing.md5().newHasher().putString("你好", Charsets.UTF_8).hash().toString();
		System.out.println(md52);
		String sha2 = Hashing.sha256().newHasher().putString("你好", Charsets.UTF_8).hash().toString();
		System.out.println(sha2);
	}
	
	/**
	 * 集合相关,commons-collections只提供map
	 */
	public void test02Collections() {
		ArrayList<String> list1 = CollUtil.newArrayList("1","2");
		System.out.println(list1);
		
		ArrayList<String> list2 = Lists.newArrayList("1","2");
		System.out.println(list2);
		
	}
	
	/**
	 * io操作:获取文件内容
	 * @throws IOException 
	 */
	@Test
	public void test03IO() throws IOException{
		File file = new File("D:\\a.txt");
		
		String context1 = FileUtils.readFileToString(file, "utf-8");
		//System.out.println(context1);

		String context2 = FileUtil.readString(file, "utf-8");
		//System.out.println(context2);
	
		String context3 = Files.toString(file, StandardCharsets.UTF_8);
		System.out.println(context3);
		
	}
	
}
