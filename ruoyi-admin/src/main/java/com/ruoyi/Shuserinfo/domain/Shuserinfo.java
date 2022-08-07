package com.ruoyi.Shuserinfo.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户对象 userinfo
 * 
 * @author JanYork
 * @date 2022-07-27
 */
public class Shuserinfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户 id */
    private Integer uid;

    /** 昵称 */
    @Excel(name = "昵称")
    private String account;

    /** 密码 */
    @Excel(name = "密码")
    private String password;

    /** 电话号码 */
    @Excel(name = "电话号码")
    private String telephoneNumber;

    /** 头像地址 */
    @Excel(name = "头像地址")
    private String avatarAddress;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String eamil;

    /** 介绍 */
    @Excel(name = "介绍")
    private String introduce;

    /** 话题数目 */
    @Excel(name = "话题数目")
    private Integer topicCount;

    /** 评论数目 */
    @Excel(name = "评论数目")
    private Integer commentCount;

    /** nanoId唯一身份标识 */
    @Excel(name = "nanoId唯一身份标识")
    private String nanoId;

    /** 网址 */
    @Excel(name = "网址")
    private String url;

    /** 用户状态 */
    @Excel(name = "用户状态")
    private Integer userState;

    public void setUid(Integer uid) 
    {
        this.uid = uid;
    }

    public Integer getUid() 
    {
        return uid;
    }
    public void setAccount(String account) 
    {
        this.account = account;
    }

    public String getAccount() 
    {
        return account;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }
    public void setTelephoneNumber(String telephoneNumber) 
    {
        this.telephoneNumber = telephoneNumber;
    }

    public String getTelephoneNumber() 
    {
        return telephoneNumber;
    }
    public void setAvatarAddress(String avatarAddress) 
    {
        this.avatarAddress = avatarAddress;
    }

    public String getAvatarAddress() 
    {
        return avatarAddress;
    }
    public void setEamil(String eamil) 
    {
        this.eamil = eamil;
    }

    public String getEamil() 
    {
        return eamil;
    }
    public void setIntroduce(String introduce) 
    {
        this.introduce = introduce;
    }

    public String getIntroduce() 
    {
        return introduce;
    }
    public void setTopicCount(Integer topicCount) 
    {
        this.topicCount = topicCount;
    }

    public Integer getTopicCount() 
    {
        return topicCount;
    }
    public void setCommentCount(Integer commentCount) 
    {
        this.commentCount = commentCount;
    }

    public Integer getCommentCount() 
    {
        return commentCount;
    }
    public void setNanoId(String nanoId) 
    {
        this.nanoId = nanoId;
    }

    public String getNanoId() 
    {
        return nanoId;
    }
    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUrl() 
    {
        return url;
    }
    public void setUserState(Integer userState) 
    {
        this.userState = userState;
    }

    public Integer getUserState() 
    {
        return userState;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("uid", getUid())
            .append("account", getAccount())
            .append("password", getPassword())
            .append("telephoneNumber", getTelephoneNumber())
            .append("avatarAddress", getAvatarAddress())
            .append("eamil", getEamil())
            .append("introduce", getIntroduce())
            .append("createTime", getCreateTime())
            .append("topicCount", getTopicCount())
            .append("commentCount", getCommentCount())
            .append("nanoId", getNanoId())
            .append("url", getUrl())
            .append("userState", getUserState())
            .toString();
    }
}
