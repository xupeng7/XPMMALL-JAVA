package com.mmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mmall.common.Const;
import com.mmall.common.ServerResponse;
import com.mmall.dao.*;
import com.mmall.pojo.*;
import com.mmall.service.ICommentService;
import com.mmall.vo.CommentVo;
import com.mmall.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by xupeng
 */
@Service
public class CommentServiceImpl implements ICommentService{

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public ServerResponse<PageInfo> selectByProductId(int pageNum,int pageSize,int productId) {

        PageHelper.startPage(pageNum,pageSize);
        List<Comment> comments=commentMapper.selectByProductId(productId);
        System.out.println(comments);
        PageInfo pageResult=new PageInfo(comments);
        pageResult.setList(comments);
        return ServerResponse.createBySuccess(pageResult);
    }

    @Override
    public ServerResponse<PageInfo> findAllComment(int pageNum, int pageSize) {

        PageHelper.startPage(pageNum,pageSize);
        List<Comment> commentList=commentMapper.findAllComment();
        PageInfo pageResult=new PageInfo(commentList);
        pageResult.setList(commentList);
        return ServerResponse.createBySuccess(pageResult);

    }


}
