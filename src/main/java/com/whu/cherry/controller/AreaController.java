package com.whu.cherry.controller;

import com.whu.cherry.entity.Area;
import com.whu.cherry.service.AreaService;
import com.whu.cherry.service.AreaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author cherry
 * @date 2018/5/15 19:32
 */
@RestController
@RequestMapping("/area")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @GetMapping("/listarea")
    public Map<String, Object> listArea()
    {
        Map<String, Object> map = new HashMap<>();
        List<Area> areaList = areaService.getAreas();
        map.put("arealist", areaList);
        return map;
    }

    @GetMapping("/getareabyid/{id}")
    public Map<String, Object> getAreaById(@PathVariable("id") Integer areaId)
    {
        Map<String, Object> map = new HashMap<>();
        Area area = areaService.getAreaById(areaId);
        map.put("areaByid", area);
        return map;
    }




}
