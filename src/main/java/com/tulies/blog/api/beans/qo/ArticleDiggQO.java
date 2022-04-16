package com.tulies.blog.api.beans.qo;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @Author: 王嘉炀
 * @Description:
 * @Date: Created in 14:52 2022/04/05
 */
@Data
public class ArticleDiggQO {
    @NotBlank(message = "内容ID不能为空")
    private String articleId;
    @NotBlank(message = "用户ID不能为空")
    private String uid;

    private Integer pageNum = 1;
    private Integer pageSize = 20;
    private String sorter;
}
