package com.zcx.myblogs.model;

import lombok.Data;

@Data
public class Article {
    /**
     * 文章id
     */
    private Integer id;
    /**
     * 标题
     */
    private String title;
    /**
     * 正文
     */
    private String content;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 修改时间
     */
    private String updateTime;
    /**
     * 发布文章的uid
     */
    private Integer uid;
    /**
     * 访问量
     */
    private Integer rcount;
    /**
     * 状态
     */
    private Integer state;
}
