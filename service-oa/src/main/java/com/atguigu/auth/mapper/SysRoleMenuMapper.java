package com.atguigu.auth.mapper;

//import com.atguigu.auth.entity.SysRoleMenu;
import com.atguigu.model.system.SysRoleMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 角色菜单 Mapper 接口
 * </p>
 *
 * @author atguigu
 * @since 2023-03-09
 */
@Repository
@Mapper
public interface SysRoleMenuMapper extends BaseMapper<SysRoleMenu> {

}
