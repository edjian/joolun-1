/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.joolun.com
 * 注意：
 * 本软件为www.joolun.com开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package com.joolun.cloud.weixin.common.entity;

import cn.hutool.json.JSONObject;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.joolun.cloud.common.data.mybatis.typehandler.JsonTypeHandler;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.ibatis.type.JdbcType;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * 自定义菜单
 *
 * @author JL
 * @date 2019-03-27 16:52:10
 */
@Data
@TableName("wx_menu")
@EqualsAndHashCode(callSuper = true)
public class WxMenu extends Model<WxMenu> {
private static final long serialVersionUID = 1L;

    /**
   * 菜单ID（click、scancode_push、scancode_waitmsg、pic_sysphoto、pic_photo_or_album、pic_weixin、location_select：保存key）
   */

    @TableId(type = IdType.ASSIGN_UUID)
    private String id;
	/**
	 * 所属租户
	 */
	private String tenantId;
	/**
	 * 父菜单ID
	 */
	private String parentId;
	/**
	 * 排序值
	 */
	private Integer sort;
	/**
	 * 创建时间
	 */
	private LocalDateTime createTime;
	/**
	 * 更新时间
	 */
	private LocalDateTime updateTime;
	/**
	 * 逻辑删除标记（0：显示；1：隐藏）
	 */
	private String delFlag;
	/**
	 * 应用ID
	 */
	private String appId;
    /**
   * 菜单类型click、view、miniprogram、scancode_push、scancode_waitmsg、pic_sysphoto、pic_photo_or_album、pic_weixin、location_select、media_id、view_limited等
   */
	@NotNull(message = "菜单类型不能为空")
    private String type;
	/**
	 * 菜单名
	 */
	@NotNull(message = "菜单名不能为空")
	private String name;
    /**
   * View：保存链接到url
   */
    private String url;
    /**
   * Img、voice、News：保存mediaID
   */
    private String repMediaId;
	/**
	 * 回复消息类型（text：文本；image：图片；voice：语音；video：视频；music：音乐；news：图文）
	 */
	private String repType;
	/**
	 * 素材名、视频和音乐的标题
	 */
	private String repName;
    /**
   * Text:保存文字
   */
    private String repContent;
	/**
	 * 小程序的appid
	 */
	private String maAppId;
	/**
	 * 小程序的页面路径
	 */
	private String maPagePath;
	/**
	 * 视频和音乐的描述
	 */
	private String repDesc;
	/**
	 * 视频和音乐的描述
	 */
	private String repUrl;
	/**
	 * 高质量链接
	 */
	private String repHqUrl;
	/**
	 * 缩略图的媒体id
	 */
	private String repThumbMediaId;
	/**
	 * 缩略图url
	 */
	private String repThumbUrl;
	/**
	 * 图文消息的内容
	 */
	@TableField(typeHandler = JsonTypeHandler.class, jdbcType= JdbcType.VARCHAR)
	private JSONObject content;
}
