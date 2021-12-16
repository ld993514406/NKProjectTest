package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

@Repository("Hibernate")
public class ImpDao implements AlphaDao{

    @Override
    public void select() {
        System.out.println("这是Dao实现类");
    }
}
