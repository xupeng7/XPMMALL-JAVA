package com.mmall.controller.portal;

import com.mmall.common.ServerResponse;
import com.mmall.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/comment/")
public class CommentController {

    @Autowired
    private ICommentService iCommentService;

    @RequestMapping("list.do")
    public ServerResponse list(
            @RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize",defaultValue = "10") int pageSize,
            @RequestParam(value = "productId") int productId
    ){
        System.out.println("jinlail");
       return iCommentService.selectByProductId(pageNum,pageSize,productId);
    }
}
