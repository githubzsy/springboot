package com.zhoushiya.bootlaunch.controller;

import com.zhoushiya.bootlaunch.model.AjaxResponse;
import com.zhoushiya.bootlaunch.model.Article;
import com.zhoushiya.bootlaunch.service.ArticleRestService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Slf4j
@RestController
@RequestMapping("/rest")
public class ArticleRestController {

    @Resource(name = "articleRestJDBCService")
    ArticleRestService articleRestService;

    /**
     * 增加一篇文章
     *
     * @param article
     * @return
     */
    @ApiOperation(value = "添加文章", notes = "添加新文章", httpMethod = "POST")
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = AjaxResponse.class),
            @ApiResponse(code = 400, message = "用户输入错误", response = AjaxResponse.class),
            @ApiResponse(code = 500, message = "系统内部错误", response = AjaxResponse.class),
    })
    // @RequestMapping(value = "/article", method = RequestMethod.POST, produces = "application/json")
    @PostMapping("/article")
    public AjaxResponse saveArticle(@RequestBody Article article) {
        articleRestService.saveArticle(article);
        return AjaxResponse.success(article);
    }

    // 删除一篇Article，使用DELETE方法，参数是id
    // @RequestMapping(value = "/article/{id}", method = DELETE, produces = "application/json")
    @DeleteMapping("/article/{id}")
    public AjaxResponse deleteArticle(@PathVariable Long id) {
        articleRestService.deleteArticle(id);
        return AjaxResponse.success(id);
    }

    // 更新一篇Article，使用PUT方法，以id为主键进行更新
    // @RequestMapping(value = "/article/{id}", method = PUT, produces = "application/json")
    @PutMapping("/article/{id}")
    public AjaxResponse updateArticle(@PathVariable Long id, @RequestBody Article article) {
        articleRestService.updateArticle(article);
        return AjaxResponse.success(article);
    }

    /**
     * 获取一篇Article，使用GET方法
     */
    // @RequestMapping(value = "/article/{id}", method = GET, produces = "application/json")
    @GetMapping("/article/{id}")
    public AjaxResponse getArticle(@PathVariable Long id) {
        Article article = articleRestService.getArticle(id);
        return AjaxResponse.success(article);
    }

    /**
     * 获取所有Article，使用GET方法
     */
    @GetMapping("/article")
    public AjaxResponse getAllArticle() {
        List<Article> articles = articleRestService.getAll();
        return AjaxResponse.success(articles);
    }
}
