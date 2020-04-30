package com.zhoushiya.bootlaunch.generator.testdb.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 书
 * </p>
 *
 * @author zhoushiya
 * @since 2020-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userId;

    private String name;

    private LocalDateTime createTime;


}
