package com.zhoushiya.bootlaunch.generator.testdb.service.impl;

import com.zhoushiya.bootlaunch.generator.testdb.entity.Book;
import com.zhoushiya.bootlaunch.generator.testdb.mapper.BookMapper;
import com.zhoushiya.bootlaunch.generator.testdb.service.IBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 书 服务实现类
 * </p>
 *
 * @author zhoushiya
 * @since 2020-04-30
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

}
