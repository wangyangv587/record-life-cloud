package com.shadow.photo.controller;

import cn.hutool.json.JSONObject;
import com.shadow.common.annotation.ShadowLog;
import com.shadow.common.entity.photo.PhotoTypeEntity;
import com.shadow.common.util.R;
import com.shadow.photo.service.PhotoTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类 描 述：照片类型管理
 * 创 建 人：Shadow
 * 创建时间：2020年09月30日 11时40分38秒
 */
@RestController
@RequestMapping("photo/type")
public class PhotoTypeController {

    @Autowired
    private PhotoTypeService photoTypeService;

    /**
     * 添加类型
     * @param entity
     * @return
     */
    @ShadowLog
    @PostMapping("add")
    public R add(@RequestBody PhotoTypeEntity entity){
        photoTypeService.saveOrUpdate(entity);
        return R.ok();
    }

    /**
     * 查询所有照片类型
     * @param jsonObject
     * @return
     */
    @ShadowLog
    @PostMapping("list")
    public R listPage(@RequestBody JSONObject jsonObject){

        return R.ok().data(photoTypeService.list());
    }

    /**
     * 删除类型
     * @param entity
     * @return
     */
    @ShadowLog
    @PostMapping("del")
    public R del(@RequestBody PhotoTypeEntity entity){
        photoTypeService.removeById(entity.getTypeId());
        return R.ok();
    }
}
