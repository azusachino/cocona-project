package icu.azusachino.kokona.mapper

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import icu.azusachino.kokona.entity.User
import org.apache.ibatis.annotations.Mapper

/**
 *
 * @author haru
 * @date 2024-06-13 7:44
 */
// FIXME: Invalid value type for attribute 'factoryBeanObjectType': java.lang.String
@Mapper
interface UserMapper : BaseMapper<User> {}