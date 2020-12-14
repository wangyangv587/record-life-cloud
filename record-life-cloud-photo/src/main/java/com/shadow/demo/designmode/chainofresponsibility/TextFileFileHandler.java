package com.shadow.demo.designmode.chainofresponsibility;

/**
 * 文本文件处理器
 * @author Shadow
 * @date 2020/12/12 17:18:12
 */
public class TextFileFileHandler extends FileHandler {

    @Override
    public void handlerRequest(FileTask fileTask) {
        if (FileTypeConstant.TEXT == fileTask.getFileType()) {
            System.out.println("文本文件处理器处理文件：" + fileTask);
        } else if (getNext() != null) {
            getNext().handlerRequest(fileTask);
        }else{
            System.out.println("无法处理的文件：" + fileTask);
        }
    }
}
