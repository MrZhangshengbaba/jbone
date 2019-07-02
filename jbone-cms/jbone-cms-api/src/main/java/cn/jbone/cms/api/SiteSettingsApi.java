package cn.jbone.cms.api;

import cn.jbone.cms.common.dataobject.BatchSaveSiteSettingDO;
import cn.jbone.cms.common.dataobject.SiteSettingsDO;
import cn.jbone.common.rpc.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@RequestMapping("/siteSettings")
public interface SiteSettingsApi {

    @RequestMapping(value = "/addOrUpdate",method = {RequestMethod.POST})
    Result<Void> addOrUpdate(@RequestBody SiteSettingsDO settingsDO);

    @RequestMapping(value = "/batchAddOrUpdate",method = {RequestMethod.POST})
    Result<Void> batchAddOrUpdate(@RequestBody BatchSaveSiteSettingDO batchSaveSettingDO);

    @RequestMapping(value = "/delete",method = {RequestMethod.DELETE})
    Result<Void> delete(@RequestParam("id") Long id);

    @RequestMapping(value = "/get",method = {RequestMethod.GET})
    Result<SiteSettingsDO> get(@RequestParam("id") Long id);

    @RequestMapping(value = "/getList",method = {RequestMethod.GET})
    Result<List<SiteSettingsDO>> getList(@RequestParam("siteId") Integer siteId);

    @RequestMapping(value = "/getMap",method = {RequestMethod.GET})
    Result<Map<String,String>> getMap(@RequestParam("siteId") Integer siteId);

}
