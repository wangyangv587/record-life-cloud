package com.shadow.demo.designmode.chainofresponsibility;

import lombok.Getter;
import lombok.Setter;

import java.io.File;

/**
 * 文件处理任务
 * @author Shadow
 * @date 2020/12/12 17:15:25
 */
@Getter
@Setter
public class FileTask {

    /**
     * 文件类型
     */
    private int fileType;

    /**
     * 文件内容
     */
    private File file;
}
