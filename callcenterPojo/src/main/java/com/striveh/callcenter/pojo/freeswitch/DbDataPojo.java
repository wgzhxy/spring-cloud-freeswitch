/** */
package com.striveh.callcenter.pojo.freeswitch;

import com.striveh.callcenter.common.base.pojo.BasePojo;

/**
 * @功能:【db_data 】PO
 * @项目名:callcenterPojo
 * @作者:xxx
 * @日期:2020-04-06 10:35:01
 * @说明：<pre></pre>
 */
public class DbDataPojo extends BasePojo {
	/** 序列化UID */
	private static final long serialVersionUID = 1L;
	/**  */
	private String hostname;
	/**  */
	private String realm;
	/**  */
	private String dataKey;
	/**  */
	private String data;

	
	/** @取得   */
	public String getHostname(){
		return hostname;
	}
	
	/** @设置   */
	public void setHostname(String hostname){
		this.hostname = hostname;
	}
	
	/** @取得   */
	public String getRealm(){
		return realm;
	}
	
	/** @设置   */
	public void setRealm(String realm){
		this.realm = realm;
	}
	
	/** @取得   */
	public String getDataKey(){
		return dataKey;
	}
	
	/** @设置   */
	public void setDataKey(String dataKey){
		this.dataKey = dataKey;
	}
	
	/** @取得   */
	public String getData(){
		return data;
	}
	
	/** @设置   */
	public void setData(String data){
		this.data = data;
	}

}
