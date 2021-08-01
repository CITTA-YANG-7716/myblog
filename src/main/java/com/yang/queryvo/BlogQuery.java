package com.yang.queryvo;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.yang.entity.Type;
import lombok.Data;

import java.util.Date;
@Data
/**
 * 主键（id）、
 * 标题（title）、
 * 更新时间（updateTime）、
 * 是否推荐（recommend）、
 * 是否发布（published）、
 * 分类id（typeId）、
 * 分类（type）
 */
public class BlogQuery {

    private Long id;
    private String title;
    private Date updateTime;
    private Boolean recommend;
    private Boolean published;
    private Long typeId;
    private Type type;

}
