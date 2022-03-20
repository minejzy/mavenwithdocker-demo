package com.qingteng.mavenwithdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavenWithDockerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenWithDockerDemoApplication.class, args);
		//增加输出窗口打印成功信息 方便用户看到启动成功后的标志
		System.out.println("helloworld application success...");
	}

}
