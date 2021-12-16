package com.nowcoder.community;

import com.nowcoder.community.controller.AlphaController;
import com.nowcoder.community.dao.AlphaDao;
import com.nowcoder.community.dao.ImpDao;
import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.service.AlphaService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
class CommunityApplicationTests implements ApplicationContextAware {
	@Autowired
	private AlphaController alphaController;

	@Test
	public void testDI(){
		alphaController.useService();
	}

	@Autowired
	@Qualifier("Hibernate")
	private AlphaDao alphaDao2;

	@Autowired
	private SimpleDateFormat simpleDateFormat1;

	@Autowired
	private AlphaService alphaService1;

	@Test
	void testGetBean2() {
		alphaDao2.select();
		System.out.println(simpleDateFormat1.format(new Date()));
	}

	@Test
	void testJarBean(){
		SimpleDateFormat simpleDateFormat
				= applicationContext.getBean(SimpleDateFormat.class);
		System.out.println(simpleDateFormat.format(new Date()));
	}

	@Test
	void contextLoads() {
		System.out.println(applicationContext);
	}

	@Test
	void testGetBean1() {
		AlphaDao newDao = applicationContext.getBean(AlphaDao.class);
		newDao.select();
		AlphaDao newDao1 = applicationContext.getBean("Hibernate",AlphaDao.class);
		newDao1.select();
	}
	@Test
	void testInitDestroy(){
		AlphaService newService = applicationContext.getBean(AlphaService.class);
		AlphaService newService1 = applicationContext.getBean(AlphaService.class);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	private ApplicationContext applicationContext;

}
