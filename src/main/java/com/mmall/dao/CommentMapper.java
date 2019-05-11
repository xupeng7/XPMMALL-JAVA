package com.mmall.dao;

import com.mmall.pojo.Comment;
import com.mmall.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentMapper {
   List<Comment> selectByProductId(Integer productId);

   List<Comment> findAllComment();

   Comment selectByPrimaryKey(Integer id);
}