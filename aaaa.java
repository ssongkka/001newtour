package ex_J;

import java.io.File;

public class aaaa {
	public static void main(String[] args) {
		String up_Path = "C:\\newtour\\NaverCloud\\문서\\연락처\\[스마트연락처]2020-02-28.vcf";
		File up_File = new File(up_Path);

		Long adsd = (long) 24781;
		System.out.println(up_File.length());
	}
}