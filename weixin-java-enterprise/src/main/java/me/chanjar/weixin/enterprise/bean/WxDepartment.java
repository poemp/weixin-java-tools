package me.chanjar.weixin.enterprise.bean;

import me.chanjar.weixin.enterprise.util.json.WxGsonBuilder;

/**
 * 微信用户分组
 * @author Daniel Qian
 *
 */
public class WxDepartment {

  private long id = -1;
  private String name;
  private long count;
  public long getId() {
    return id;
  }
  public void setId(long id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public long getCount() {
    return count;
  }
  public void setCount(long count) {
    this.count = count;
  }
  
  public static WxDepartment fromJson(String json) {
    return WxGsonBuilder.create().fromJson(json, WxDepartment.class);
  }
  
  public String toJson() {
    return WxGsonBuilder.create().toJson(this);
  }
  @Override
  public String toString() {
    return "WxGroup [id=" + id + ", name=" + name + ", count=" + count + "]";
  }
  
}
