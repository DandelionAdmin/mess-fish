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
import club.gclmit.navigation.model.dto.query.DetailQuery;
import club.gclmit.navigation.model.pojo.WebsiteDetail;
import club.gclmit.navigation.service.WebsiteDetailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 *  站点管理
 * </p>
 *
 * @author gclm
 * @since 2020-11-23
 */
@Slf4j
@RestController
@RequestMapping("/api/website/detail")
@Api(value = "站点管理", tags = "站点管理")
public class WebsiteDetailController extends RestApiController<WebsiteDetailService, WebsiteDetail> {

    @Autowired
    private WebsiteDetailService detailService;

    @Override
    @GetMapping
    @ApiOperation(value = "分页查询", httpMethod = "GET")
    public ApiResult list(@ChaosQuery(clazz = DetailQuery.class) QueryCondition queryCondition) {
        DetailQuery query = (DetailQuery) queryCondition;
        log.info("分页查询\t:[{}]", StringUtils.toString(query));
        Page<WebsiteDetail> pages = detailService.queryList(query);
        ApiPageResult apiPageResult =
            new ApiPageResult(pages.getTotal(), pages.getRecords(), query.getPage(), query.getPageSize());
        return ApiResult.ok(apiPageResult);
    }
}
