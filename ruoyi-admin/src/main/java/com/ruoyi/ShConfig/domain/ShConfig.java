package com.ruoyi.ShConfig.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 配置对象 config
 * 
 * @author JanYork
 * @date 2022-07-27
 */
public class ShConfig extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 标签 id */
    private Integer cid;

    /** smtp 账户 */
    @Excel(name = "smtp 账户")
    private String smtpEamil;

    /** smtp 密码 */
    @Excel(name = "smtp 密码")
    private String smtpPwd;

    /** 百度文本识别的 appkey */
    @Excel(name = "百度文本识别的 appkey")
    private String baiduAppKey;

    /** 百度文本识别的 secretkey */
    @Excel(name = "百度文本识别的 secretkey")
    private String baiduSecretKey;

    /** 极验Id */
    @Excel(name = "极验Id")
    private String geetestId;

    /** 极验Key */
    @Excel(name = "极验Key")
    private String geetestKey;

    public void setCid(Integer cid) 
    {
        this.cid = cid;
    }

    public Integer getCid() 
    {
        return cid;
    }
    public void setSmtpEamil(String smtpEamil) 
    {
        this.smtpEamil = smtpEamil;
    }

    public String getSmtpEamil() 
    {
        return smtpEamil;
    }
    public void setSmtpPwd(String smtpPwd) 
    {
        this.smtpPwd = smtpPwd;
    }

    public String getSmtpPwd() 
    {
        return smtpPwd;
    }
    public void setBaiduAppKey(String baiduAppKey) 
    {
        this.baiduAppKey = baiduAppKey;
    }

    public String getBaiduAppKey() 
    {
        return baiduAppKey;
    }
    public void setBaiduSecretKey(String baiduSecretKey) 
    {
        this.baiduSecretKey = baiduSecretKey;
    }

    public String getBaiduSecretKey() 
    {
        return baiduSecretKey;
    }
    public void setGeetestId(String geetestId) 
    {
        this.geetestId = geetestId;
    }

    public String getGeetestId() 
    {
        return geetestId;
    }
    public void setGeetestKey(String geetestKey) 
    {
        this.geetestKey = geetestKey;
    }

    public String getGeetestKey() 
    {
        return geetestKey;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("cid", getCid())
            .append("smtpEamil", getSmtpEamil())
            .append("smtpPwd", getSmtpPwd())
            .append("baiduAppKey", getBaiduAppKey())
            .append("baiduSecretKey", getBaiduSecretKey())
            .append("geetestId", getGeetestId())
            .append("geetestKey", getGeetestKey())
            .toString();
    }
}
