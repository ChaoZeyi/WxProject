package com.whu.cherry.service;

import com.whu.cherry.entity.Area;

import java.util.List;

/**
 * @author cherry
 * @date 2018/5/15 11:19
 */
public interface AreaService {

    //因为只是对数据做简单的增删改查，所以和AreaDao里面的方法一致

    public List<Area> getAreas();

    public Area getAreaById(Integer areaId);

    public boolean addArea(Area area);

    public boolean updateArea(Area area);

    public boolean deleteAreaById(Integer areaId);
}
