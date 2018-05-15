package com.whu.cherry.dao;

import com.whu.cherry.entity.Area;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author cherry
 * @date 2018/5/12 20:59
 */
@Repository
public interface AreaDao {
    //对数据进行增删改查

    public List<Area> getAreas();

    public Area getAreaById(Integer areaId);

    public boolean addArea(Area area);

    public boolean updateArea(Area area);

    public boolean deleteAreaById(Integer areaId);

}
