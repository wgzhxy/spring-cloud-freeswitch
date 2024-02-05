/** */
package com.striveh.callcenter.common.base.service.iservice;

import com.striveh.callcenter.common.base.pojo.BasePojo;

import java.util.List;

public interface IBaseService<P extends BasePojo> {

  /**
   * 根据主键或唯一键查找数据
   *
   * @param p
   * @return
   */
  P selectUnique(P p);

  /**
   * 根据条件查询记录
   *
   * @param p
   * @return
   */
  List<P> selectList(P p);

  /**
   * 插入一条数据
   *
   * @param p
   * @return
   */
  int insert(P p);

  /**
   * 修改一条数据
   *
   * @param p
   * @return
   */
  int update(P p);

  /**
   * 批量插入数据
   *
   * @param list
   * @return
   */
  int insertList(List<P> list);

  /**
   * 批量修改数据
   *
   * @param list
   * @return
   */
  int updateList(List<P> list);
}
