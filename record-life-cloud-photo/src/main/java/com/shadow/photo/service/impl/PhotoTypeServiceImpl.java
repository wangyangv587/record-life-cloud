package com.shadow.photo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shadow.common.entity.photo.PhotoTypeEntity;
import com.shadow.photo.dao.PhotoTypeDao;
import com.shadow.photo.service.PhotoTypeService;
import org.springframework.stereotype.Service;

/**
 * 类 描 述：照片类型服务实现
 * 创 建 人：Shadow
 * 创建时间：2020年10月02日 12时53分
 */
@Service
public class PhotoTypeServiceImpl extends ServiceImpl<PhotoTypeDao, PhotoTypeEntity> implements PhotoTypeService {
    @Override
    public void print() {

    }
}
