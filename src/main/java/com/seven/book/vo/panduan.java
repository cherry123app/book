package com.seven.book.vo;

import com.seven.book.util.ResultUtil;
import java.util.List;
public class panduan<T> {
    private  T List;
    private T Interget;
    public static ResultBean abc(List list) {
        if (list.equals(null)||list.size()==0) {
            return ResultUtil.setError("失败",null);
        } else {
            return ResultUtil.setOK("成功",list);
        }
    }
    public static ResultBean abcd(Integer i) {
        if (i==0) {
            return ResultUtil.setOK("失败",null);
        } else {
            return ResultUtil.setError("成功",i);
        }
    }
}
