package cn.airbash.javaMaven.Tools;

import java.io.File;

/**
 * 批量重命名文件中带有错误样式
 * @author ZSP
 *
 */
public class RenameFile_DeleteEndWord {
	public static void main(String[] args) {
		
		System.out.println("程序开始");
		String FatherMkdir="E:\\百度网盘\\day01 搭建环境 CMS服务端开发\\视频\\";
		File file = new File(FatherMkdir);
		File[] listFiles = file.listFiles();
		for(File f:listFiles) {
			String name = f.getName();
			String replace = name.replace(" 【www.zxit8.com】","");
			f.renameTo(new File(FatherMkdir+replace));
		}
		System.out.println("程序结束");
	}
	public void exists(File file,String method) {
		if(file.exists()) {
			existsS(file,method);
		}else {
			System.out.println("请输入有效的目录或文件,请重新输入");
		}
	}
	public void existsS(File file,String method) {
		if(file.isDirectory()){
			existsS(file,method);
			if(file.isFile()){
				
			}
		}
	}
}
