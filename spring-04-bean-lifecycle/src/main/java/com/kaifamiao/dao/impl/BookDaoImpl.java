package com.kaifamiao.dao.impl;

import com.kaifamiao.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save ...");
    }
    //表示bean初始化对应的操作
    public void init(){
        System.out.println("dao init...");
    }
    //表示bean销毁前对应的操作
    public void destory(){
        System.out.println("dao destory...");
    }
}