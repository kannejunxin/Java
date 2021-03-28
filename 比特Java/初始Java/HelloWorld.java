public class HelloWorld {
	public static void main(String[] args) {
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
		//了解java的运行时命令行参数 args  注意java的时候输入 而不是javac时候输入 ，javac是编译

		System.out.println("HelloWorld!");
		System.out.print("您好世界!");
		System.out.printf("%s\n","HelloWorld!");
		//会报错 ！  因为文档文件编码格式为 utf-8  而javac 则以GBK进行编码
		//要转换 -encoding utf-8

	}
}
