package com.atguigu.process.mapper;

import com.atguigu.model.process.ProcessTemplate;
//import com.atguigu.process.entity.OaProcessTemplate;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 审批模板 Mapper 接口
 * </p>
 *
 * @author atguigu
 * @since 2023-03-21
 */
@Mapper
public interface OaProcessTemplateMapper extends BaseMapper<ProcessTemplate> {

}
