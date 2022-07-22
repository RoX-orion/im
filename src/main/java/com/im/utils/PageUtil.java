package com.im.utils;

import lombok.Data;

import java.util.List;

@Data
public class PageUtil {

    private long totalCount;

    /**
     * 列表数据
     */
    private List<?> list;

    public PageUtil(List<?> list, long totalCount){
        this.list = list;
        this.totalCount = totalCount;
    }
}
