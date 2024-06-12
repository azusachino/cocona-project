package icu.azusachino.kokona.services

import com.baomidou.mybatisplus.extension.service.IService
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import icu.azusachino.kokona.entity.User
import icu.azusachino.kokona.mapper.UserMapper
import org.springframework.stereotype.Service

/**
 * KokonaService
 *
 * @author haru
 * @since 2024/06/12
 */
class KokonaService {
}

@Service("userService")
class UserService : ServiceImpl<UserMapper, User>(), IService<User> {

}