package com.ibank.dao;

import java.io.Serializable;
import java.util.List;

public abstract interface IBaseDAO
{
  public abstract boolean create(Object object);

  /**更新一条记录*/
  public abstract boolean update(Object object);

  /**删除一条记录*/
  public abstract boolean delete(Object object);

  /**直接查询出一条结果*/
  public abstract Object find(Class<? extends Object> paramClass, Serializable paramSerializable);

  /**查询一条记录到缓存*/
  public abstract Object load(Class<? extends Object> paramClass, Serializable paramSerializable);

  /**查询组结果*/
  public abstract List<Object> list(String paramString);
  
  /**分页查询一页记录
   * hql SQL语句
   * offset 从第几条记录开始
   * length 查询几条记录 */
  public  abstract List<?> getListForPage(String hql, int offset, int length);
  
  /**查询总记录数*/
  public  abstract int getAllRowCount(String hql) ;
}