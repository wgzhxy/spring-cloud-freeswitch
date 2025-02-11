/** */
package com.striveh.callcenter.freeswitch.freeswitch.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.striveh.callcenter.freeswitch.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.striveh.callcenter.pojo.freeswitch.TiersPojo;
import com.striveh.callcenter.freeswitch.freeswitch.service.iservice.ITiersService;

/**
 * @功能:【tiers 】controller @项目名:callcenterFreeswitch @作者:xxx @日期:2020-04-13 21:59:26 @说明：
 *
 * <pre></pre>
 */
@RestController
@RequestMapping("/tiers")
public class TiersController extends BaseController<TiersPojo> {
  
  /** tiers service */
  @Autowired private ITiersService tiersService;

  /**
   * get
   *
   * @param tiers
   * @param request
   * @param response
   */
  @RequestMapping("/get")
  public void get(TiersPojo tiers, HttpServletRequest request, HttpServletResponse response) {}
}
