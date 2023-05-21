package com.atguigu.process.mapper;

import com.atguigu.model.process.ProcessRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 审批记录 Mapper 接口
 * </p>
 *
 * @author atguigu
 * @since 2023-03-22
 */
@Mapper
public interface OaProcessRecordMapper extends BaseMapper<ProcessRecord> {

}
