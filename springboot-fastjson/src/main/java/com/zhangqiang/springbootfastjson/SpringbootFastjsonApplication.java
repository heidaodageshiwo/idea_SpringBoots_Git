package com.zhangqiang.springbootfastjson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootFastjsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFastjsonApplication.class, args);
	}
//	http://localhost:8080/user/list
//	[{"address":"","age":22,"id":5,"name":""},{"address":"jinan","age":22,"id":6,"name":"admin"}]
}
