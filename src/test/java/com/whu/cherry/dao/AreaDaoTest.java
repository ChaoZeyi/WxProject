package com.whu.cherry.dao;

import com.whu.cherry.entity.Area;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author cherry
 * @date 2018/5/12 21:29
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AreaDaoTest {

    @Autowired
    private AreaDao areaDao;

    @Test
    public void getAreas() throws Exception {
        List<Area> areaList = areaDao.getAreas();
        Assert.assertEquals(1,areaList.size());


    }

    @Test
    public void getAreaById() throws Exception {
        Area area = areaDao.getAreaById(1);
        Assert.assertEquals("wuhan", area.getAreaName());
    }

    @Test
    public void addArea() throws Exception {
        Area area = new Area();
        area.setAreaName("nanchang");
        area.setPriority(8);
        boolean result = areaDao.addArea(area);
        Assert.assertEquals(true, result);
    }

    @Test
    public void updateArea() throws Exception {
        Area area = new Area();
        area.setAreaId(2);
        area.setAreaName("guangzhou");
        boolean result = areaDao.updateArea(area);
        Assert.assertEquals(true, result);
    }

    @Test
    public void deleteAreaById() throws Exception {
        boolean result = areaDao.deleteAreaById(2);
    }

}