package com.ghost.leapicommon.service;

import com.ghost.leapicommon.model.entity.InterfaceInfo;

/**
 * 内部接口信息服务
 * @author 乐小鑫
 * @version 1.0
 * @Date 2024-02-11-21:24
 */
public interface InnerInterfaceInfoService {

    /**
     * 查询模拟接口是否存在
     * @param path
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
}
