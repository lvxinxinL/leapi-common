package com.ghost.leapicommon.service;

/**
 * 内部用户-接口信息关联服务
 * @author 乐小鑫
 * @version 1.0
 * @Date 2024-02-11-21:25
 */
public interface InnerUserInterfaceService {

    /**
     * 接口调用次数 + 1
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);

}
