package icu.azusachino.kokona.config

import org.mybatis.spring.annotation.MapperScan
import org.springframework.context.annotation.Configuration

/**
 * Config
 *
 * @author haru
 * @since 2024/06/12
 */
@Configuration
class SecurityConfig {

}

@Configuration
@MapperScan(basePackages = ["icu.azusachino.kokona.mapper"])
class WebConfig {

}