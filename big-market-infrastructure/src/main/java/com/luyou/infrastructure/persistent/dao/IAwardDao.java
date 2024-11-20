package com.luyou.infrastructure.persistent.dao;

import com.luyou.infrastructure.persistent.po.Award;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 鹿又笑
 * @create 2024/11/20-18:03
 * @description
 */
@Mapper
public interface IAwardDao {

    List<Award> queryAwardList();

}
