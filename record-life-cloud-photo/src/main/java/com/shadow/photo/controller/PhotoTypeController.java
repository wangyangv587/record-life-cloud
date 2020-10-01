package com.shadow.photo.controller;

import cn.hutool.json.JSONObject;
import com.shadow.common.annotation.ShadowLog;
import com.shadow.common.util.R;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类 描 述：
 * 创 建 人：Shadow
 * 创建时间：2020年09月30日 11时40分38秒
 */
@RestController
@RequestMapping("photo/type")
public class PhotoTypeController {

    /**
     * 测试方法
     * @param jsonObject
     * @return
     */
    @ShadowLog
    @PostMapping("add")
    public R add(@RequestBody JSONObject jsonObject){

        //休眠100ms，查看效果
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return R.ok();
    }

}
