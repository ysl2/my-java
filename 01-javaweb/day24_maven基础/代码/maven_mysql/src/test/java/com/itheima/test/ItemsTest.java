package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.dao.impl.ItemsDaoImpl;
import com.itheima.domain.Items;
import org.junit.Test;

import java.util.List;

public class ItemsTest {
    @Test
    public void findAll() throws  Exception{
        ItemsDao itemsDao = new ItemsDaoImpl();
        List<Items> list = itemsDao.findAll();
        for (Items items : list) {
            System.out.println(items.getName());
        }
    }
}
