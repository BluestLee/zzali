package com.zz.region.domain.authority;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

/**
 * @Description  
 * @Author  WQY
 * @Date 2020-06-09 
 */
@Builder
@Data
@ApiModel(value = "菜单信息")
public class Menu  {

	@ApiModelProperty(value = "id",name = "id",dataType = "Long")
	private Long id;

	/**
	 * 菜单编号
	 */
	@ApiModelProperty(value = "菜单编号",name = "menuCode",dataType = "String")
	private String menuCode;

	/**
	 * 菜单名称
	 */
	@ApiModelProperty(value = "菜单名称",name = "menuName",dataType = "String")
	private String menuName;

	/**
	 * 路由
	 */
	@ApiModelProperty(value = "路由",name = "router",dataType = "String")
	private String router;

	/**
	 * 图标地址
	 */
	@ApiModelProperty(value = "图标地址",name = "imgsrc",dataType = "String")
	private String imgsrc;

	/**
	 * 子菜单序号
	 */
	@ApiModelProperty(value = "子菜单序号",name = "index",dataType = "String")
	private String index;

	@Tolerate
	public Menu (){}


}
