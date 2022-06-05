package club.gclmit.navigation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import club.gclmit.chaos.core.utils.StringUtils;
import club.gclmit.chaos.web.annotation.ChaosQuery;
import club.gclmit.chaos.web.controller.QueryCondition;
import club.gclmit.chaos.web.controller.RestApiController;
import club.gclmit.chaos.web.result.ApiPageResult;
import club.gclmit.chaos.web.result.ApiResult;
import club.gclmit.navigation.model.dto.query.EngineQuery;
import club.gclmit.navigation.model.pojo.SearchEngine;
import club.gclmit.navigation.service.SearchEngineService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 搜索引擎
 * </p>
 * xwwwx
 *
 * @author gclm
 * @since 2020-11-23
 */
@Slf4j
@RestController
@RequestMapping("/api/engine")
@Api(value = "搜索引擎", tags = "搜索引擎")
public class SearchEngineController extends RestApiController<SearchEngineService, SearchEngine> {

    @Autowired
    private SearchEngineService engineService;

    @Override
    @GetMapping
    @ApiOperation(value = "分页查询", httpMethod = "GET")
    public ApiResult list(@ChaosQuery(clazz = EngineQuery.class) QueryCondition query) {
        EngineQuery engineQuery = (EngineQuery) query;
        log.info("分页查询\t:[{}]", StringUtils.toString(engineQuery));
        Page<SearchEngine> pages = engineService.queryList(engineQuery);
        ApiPageResult apiPageResult =
            new ApiPageResult(pages.getTotal(), pages.getRecords(), query.getPage(), query.getPageSize());
        return ApiResult.ok(apiPageResult);
    }

    @GetMapping("/enable")
    public ApiResult enableEngine() {
        return ApiResult.ok(engineService.getEnableEngineList());
    }
}