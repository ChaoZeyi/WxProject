package com.whu.cherry.service;

import com.whu.cherry.dao.AreaDao;
import com.whu.cherry.entity.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author cherry
 * @date 2018/5/15 11:19
 */
@Service
public class AreaServiceImpl implements AreaService{
    @Autowired
    private AreaDao areaDao;


    @Override
    public List<Area> getAreas() {
        return areaDao.getAreas();
    }

    @Override
    public Area getAreaById(Integer areaId) {
        return areaDao.getAreaById(areaId);
    }

    @Transactional(rollbackFor = RuntimeException.class)
    @Override
    public boolean addArea(Area area) {
        if(area.getAreaName() != null && area.getAreaName() != "") {
            area.setCreateTime(new Date());
            area.setLastEditTime(new Date());
            try {
                boolean result = areaDao.addArea(area);
                if(result) {
                    return true;
                }
                else{
                    throw new RuntimeException("添加区域信息失败");
                }
            }catch(Exception e)
            {
                throw new RuntimeException("添加区域信息失败"+ e.getMessage());
            }

        }else {
            throw new RuntimeException("区域信息不能为空");
        }

    }

    @Transactional(rollbackFor = RuntimeException.class)
    @Override
    public boolean updateArea(Area area) {
        if(area.getAreaId() != null && area.getAreaId() > 0) {

            area.setLastEditTime(new Date());
            try {
                boolean result = areaDao.updateArea(area);
                if(result) {
                    return true;
                }
                else{
                    throw new RuntimeException("更新区域信息失败");
                }
            }catch(Exception e)
            {
                throw new RuntimeException("更新区域信息失败"+ e.getMessage());
            }

        }else {
            throw new RuntimeException("区域信息不能为空");
        }

    }

    @Transactional(rollbackFor = RuntimeException.class)
    @Override
    public boolean deleteAreaById(Integer areaId) {
        if(areaId > 0) {
            try {
                boolean result = areaDao.deleteAreaById(areaId);
                if(result) {
                    return true;
                }
                else{
                    throw new RuntimeException("删除区域信息失败");
                }
            }catch(Exception e)
            {
                throw new RuntimeException("删除区域信息失败"+ e.getMessage());
            }

        }else {
            throw new RuntimeException("区域Id不能为空");
        }
    }
}
