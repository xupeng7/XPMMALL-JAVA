package com.mmall.pojo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class Comment implements Serializable {


    private Integer id;
    private Integer product_id;
    private String content;
    private Integer user_id;
    private String images;
    private Date create_time;
    private String user_name;



    public Comment() {
          super();
    }

    public Comment(Integer id, Integer product_id, String content, Integer user_id, String images, Date create_time, String user_name) {
        this.id = id;
        this.product_id = product_id;
        this.content = content;
        this.user_id = user_id;
        this.images = images;
        this.create_time = create_time;
        this.user_name = user_name;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", product_id=" + product_id +
                ", content='" + content + '\'' +
                ", user_id=" + user_id +
                ", images='" + images + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
