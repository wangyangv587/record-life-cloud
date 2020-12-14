package com.shadow.demo.designmode.chainofresponsibility;

import java.io.File;

/**责任链设计模式模式
 * @author Shadow
 * @date 2020/12/12 17:14:02
 */
public class ChainOfResponsibilityPattern {

    public static void main(String[] args) {

        //组装责任链
        FileHandler textFileFileHandler = new TextFileFileHandler();
        FileHandler photoFileFileHandler = new PhotoFileFileHandler();
        textFileFileHandler.setNext(photoFileFileHandler);

        //创建任务对象
        FileTask fileTask = new FileTask();
        fileTask.setFileType(3);
        fileTask.setFile(new File("D://test.dll"));

        //执行任务
        textFileFileHandler.handlerRequest(fileTask);
    }
}
