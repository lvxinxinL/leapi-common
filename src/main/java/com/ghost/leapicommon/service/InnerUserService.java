package com.ghost.leapicommon.service;

import com.ghost.leapicommon.model.entity.User;

/**
 * 内部用户服务
 * @author 乐小鑫
 * @version 1.0
 * @Date 2024-02-11-21:25
 */
public interface InnerUserService {

    /**
     * 数据库中查是否已分配给用户秘钥（accessKey）
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);

}
