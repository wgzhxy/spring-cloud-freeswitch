/** */
package com.striveh.callcenter.freeswitch.freeswitch.service;

import com.striveh.callcenter.freeswitch.freeswitch.service.iservice.ISipDialogsService;
import org.springframework.stereotype.Service;
import com.striveh.callcenter.common.base.service.BaseService;
import com.striveh.callcenter.freeswitch.freeswitch.dao.SipDialogsDao;
import com.striveh.callcenter.pojo.freeswitch.SipDialogsPojo;

/**
 * @功能:【sip_dialogs 】Service
 * @项目名:callcenterFreeswitch
 * @作者:xxx
 * @日期:2020-04-06 10:35:31
 * @说明：<pre></pre>
 */
@Service
public class SipDialogsService extends BaseService<SipDialogsPojo, SipDialogsDao> implements ISipDialogsService {

}
