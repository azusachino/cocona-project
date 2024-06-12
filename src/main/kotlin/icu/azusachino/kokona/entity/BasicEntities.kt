package icu.azusachino.kokona.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName

/**
 *
 * @author haru
 * @date 2024-06-13 7:40
 */
@TableName("tb_user")
class User(@TableId private var id: Long, private var name: String, private var surname: String) {

}