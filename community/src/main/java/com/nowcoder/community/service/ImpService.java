package com.nowcoder.community.service;

import com.nowcoder.community.dao.AlphaDao;
import com.nowcoder.community.dao.ImpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class ImpService implements AlphaService{
    @Autowired
    ImpDao demoDao;

    public void useDao(){
        demoDao.select();
    }

    @Override
    @PostConstruct
    public void init() {
        System.out.println("Service初始化");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Service销毁");
    }

    ImpService(){
        System.out.println("Service实例化");
    }

}
