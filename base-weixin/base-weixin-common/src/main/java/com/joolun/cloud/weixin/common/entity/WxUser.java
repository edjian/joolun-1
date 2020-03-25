/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.joolun.com
 * 注意：
 * 本软件为www.joolun.com开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package com.joolun.cloud.weixin.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.joolun.cloud.common.data.mybatis.typehandler.ArrayLongTypeHandler;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.ibatis.type.JdbcType;

import java.time.LocalDateTime;

/**
 * 微信用户
 *
 * @author JL
 * @date 2019-03-25 15:39:39
 */
@Data
@TableName("wx_user")
@EqualsAndHashCode(callSuper = true)
public class WxUser extends Model<WxUser> {
private static final long serialVersionUID = 1L;

    /**
   * 主键
   */
    @TableId(type = IdType.ASSIGN_UUID)
    private String id;
    /**
   * 创建者
   */
    private String createId;
    /**
   * 创建时间
   */
    private LocalDateTime createTime;
    /**
   * 更新者
   */
    private String updateId;
    /**
   * 更新时间
   */
    private LocalDateTime updateTime;
    /**
   * 备注信息
   */
    private String remark;
    /**
   * 逻辑删除标记（0：显示；1：隐藏）
   */
    private String delFlag;
	/**
	 * 所属租户
	 */
	private String tenantId;
    /**
   * 公众号配置ID、小程序AppID
   */
    private String appId;
    /**
   * 应用类型(1:小程序，2:公众号)
   */
    private String appType;
    /**
   * 是否订阅（0：是；1：否；2：网页授权用户）
   */
    private String subscribe;
    /**
   * 返回用户关注的渠道来源，ADD_SCENE_SEARCH 公众号搜索，ADD_SCENE_ACCOUNT_MIGRATION 公众号迁移，ADD_SCENE_PROFILE_CARD 名片分享，ADD_SCENE_QR_CODE 扫描二维码，ADD_SCENEPROFILE LINK 图文页内名称点击，ADD_SCENE_PROFILE_ITEM 图文页右上角菜单，ADD_SCENE_PAID 支付后关注，ADD_SCENE_OTHERS 其他
   */
    private String subscribeScene;
    /**
   * 关注时间
   */
    private LocalDateTime subscribeTime;
    /**
   * 关注次数
   */
    private Integer subscribeNum;
    /**
   * 取消关注时间
   */
    private LocalDateTime cancelSubscribeTime;
    /**
   * 用户标识
   */
    private String openId;
    /**
   * 昵称
   */
    private String nickName;
    /**
   * 性别（1：男，2：女，0：未知）
   */
    private String sex;
    /**
   * 所在城市
   */
    private String city;
    /**
   * 所在国家
   */
    private String country;
    /**
   * 所在省份
   */
    private String province;
    /**
   * 手机号码
   */
    private String phone;
    /**
   * 用户语言
   */
    private String language;
    /**
   * 头像
   */
    private String headimgUrl;
    /**
   * union_id
   */
    private String unionId;
    /**
   * 用户组
   */
    private String groupId;
    /**
   * 标签列表
   */
	@TableField(typeHandler = ArrayLongTypeHandler.class, jdbcType= JdbcType.VARCHAR)
    private Long[] tagidList;
	/**
	 * 二维码扫码场景
	 */
	private String qrSceneStr;
	/**
	 * 地理位置纬度
	 */
	private Double latitude;
	/**
	 * 地理位置经度
	 */
	private Double longitude;
	/**
	 * 地理位置精度
	 */
	@TableField(value = "`precision`")
	private Double precision;
    /**
   * 会话密钥
   */
    private String sessionKey;

	/**
	 * 商城用户ID
	 */
	private String mallUserId;
}
