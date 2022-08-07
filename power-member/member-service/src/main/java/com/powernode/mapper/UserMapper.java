package com.powernode.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.powernode.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 信息描述
 * @author DuBo
 * @createDate 2022/8/4 17:47
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}