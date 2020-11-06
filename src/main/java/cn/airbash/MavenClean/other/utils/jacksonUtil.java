package cn.airbash.MavenClean.other.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * jackson工具类
 * @author ZSP
 */
public class jacksonUtil {
	private static ObjectMapper mapper = new ObjectMapper();
	

	/**
	 * Object转化为json字符串
	 * @param object
	 * @return
	 * @throws JsonProcessingException
	 */
	public static String object2json(Object object) throws Exception {
		String string = mapper.writeValueAsString(object);
		return string;
	}
	
	/**
	 * json字符串转化为Object
	 * @param <T>
	 * @param string
	 * @param javaType
	 * @return
	 * @throws Exception
	 */
	public static <T> T json2object(String string,Class<T> javaType) throws Exception {
		T t = mapper.readValue(string, javaType);
		return t;
	}
	
}
