package com.shadow.photo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shadow.common.entity.photo.PhotoTypeEntity;

/**
 * 类 描 述：照片类型对外接口
 * 创 建 人：Shadow
 * 创建时间：2020年10月02日 12时52分
 */
public interface PhotoTypeService extends IService<PhotoTypeEntity> {

     void print();

    default void print1(){
        print();
    }
}
