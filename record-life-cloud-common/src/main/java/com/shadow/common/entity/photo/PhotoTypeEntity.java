package com.shadow.common.entity.photo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.shadow.common.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 类 描 述：照片类型表
 * 创 建 人：Shadow
 * 创建时间：2020年10月02日 12时20分
 */
@Getter
@Setter
@TableName("shadow_photo_type")
public class PhotoTypeEntity extends BaseEntity {

    /**
     * 类型主键
     */
    @TableId(type = IdType.AUTO)
    private Long typeId;

    /**
     * 类型名字
     */
    private String typeName;

    /**
     * 最后更新时间
     */
    private Date lastTime;
}
