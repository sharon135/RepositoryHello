package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gxr.com.entity.User;
import com.gxr.com.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath*:spring/applicationContext.xml"})
public class ssmTest extends AbstractJUnit4SpringContextTests{
private static Logger logger=LoggerFactory.getLogger(ssmTest.class);

@Autowired
private UserService userService;

@Test
public void test1(){
	User u=new User();
	u.setEmail("gxr105@qq.com");
	u.setPassword("111111");
	userService.save(u);
//	Integer count = userService.save(u);
//	System.out.println("------count:"+count);
}	
}
