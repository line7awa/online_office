package com.atguigu.process.service;

import com.atguigu.model.process.ProcessType;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 审批类型 服务类
 * </p>
 *
 * @author atguigu
 * @since 2023-03-21
 */
public interface OaProcessTypeService extends IService<ProcessType> {
    List<ProcessType> findProcessType();
}
