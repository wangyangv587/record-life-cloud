package com.shadow.demo.designmode.chainofresponsibility;

/**
 * 抽象的处理者
 * @author Shadow
 * @date 2020/12/12 17:14:44
 */
public abstract class FileHandler {

    /**
     * 下一个处理者
     */
    private FileHandler next;

    public FileHandler getNext() {
        return next;
    }

    public void setNext(FileHandler next) {
        this.next = next;
    }

    /**
     * 处理请求
     * @param fileTask 处理任务对象
     */
    public abstract void handlerRequest(FileTask fileTask);
}
