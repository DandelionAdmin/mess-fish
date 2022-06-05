package club.gclmit.navigation.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import club.gclmit.chaos.core.utils.IOUtils;
import club.gclmit.chaos.web.result.ApiResult;
import club.gclmit.navigation.model.constants.Roles;
import club.gclmit.navigation.service.WebsiteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 网站配置Controller
 * </p>
 *
 * @author gclm
 * @since 2020-11-23
 */
@Slf4j
@RestController
@Api(value = "网站配置", tags = "网站配置")
public class IndexController {

    @Autowired
    private WebsiteService websiteService;

    public static final String PATH = "data" + File.separator;

    @GetMapping("/api/website")
    @ApiOperation("获取网站详情")
    public ApiResult list() {
        return ApiResult.ok(websiteService.getEnableWebsiteList());
    }

    @GetMapping("/api/menu/{id}")
    @ApiOperation(value = "获取角色菜单")
    public ApiResult menu(@PathVariable Integer id) {
        log.info("当前获取菜单的角色ID:{}",id);
        ClassPathResource resource = new ClassPathResource(PATH + Roles.getMenu(id) + ".json");
        try {
            String result = IOUtils.readUtf8(resource.getInputStream()).replaceAll("\\s*", "");
            return ApiResult.ok(result);
        } catch (IOException e) {
            return ApiResult.fail("获取菜单失败");
        }
    }

    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("redirect:/navigation/index.html");
    }

    @GetMapping("/admin")
    public ModelAndView login() {
        return new ModelAndView("redirect:/admin/pages/login.html");
    }
}
