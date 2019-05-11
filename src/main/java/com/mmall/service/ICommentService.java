package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.vo.OrderVo;

import java.util.Map;

/**
 * Created by xupeng
 */
public interface ICommentService {


    ServerResponse<PageInfo> selectByProductId(int pageNum,int pageSize,int productId);



}
