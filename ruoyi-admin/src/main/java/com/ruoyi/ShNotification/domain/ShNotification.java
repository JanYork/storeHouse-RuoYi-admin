package com.ruoyi.ShNotification.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 通知对象 notification
 * 
 * @author JanYork
 * @date 2022-07-27
 */
public class ShNotification extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 通知自增 id */
    private Integer nid;

    /** 通知操作 */
    @Excel(name = "通知操作")
    private String notificationUidAction;

    /** 附带的主题 id */
    @Excel(name = "附带的主题 id")
    private Integer notificationUidSubjectId;

    /** 用户 id */
    @Excel(name = "用户 id")
    private Integer notificationUid;

    /** 发送通知者 id */
    @Excel(name = "发送通知者 id")
    private Integer notificationUidFromUid;

    /** 通知阅读时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "通知阅读时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date notificationUidReadAt;

    public void setNid(Integer nid) 
    {
        this.nid = nid;
    }

    public Integer getNid() 
    {
        return nid;
    }
    public void setNotificationUidAction(String notificationUidAction) 
    {
        this.notificationUidAction = notificationUidAction;
    }

    public String getNotificationUidAction() 
    {
        return notificationUidAction;
    }
    public void setNotificationUidSubjectId(Integer notificationUidSubjectId) 
    {
        this.notificationUidSubjectId = notificationUidSubjectId;
    }

    public Integer getNotificationUidSubjectId() 
    {
        return notificationUidSubjectId;
    }
    public void setNotificationUid(Integer notificationUid) 
    {
        this.notificationUid = notificationUid;
    }

    public Integer getNotificationUid() 
    {
        return notificationUid;
    }
    public void setNotificationUidFromUid(Integer notificationUidFromUid) 
    {
        this.notificationUidFromUid = notificationUidFromUid;
    }

    public Integer getNotificationUidFromUid() 
    {
        return notificationUidFromUid;
    }
    public void setNotificationUidReadAt(Date notificationUidReadAt) 
    {
        this.notificationUidReadAt = notificationUidReadAt;
    }

    public Date getNotificationUidReadAt() 
    {
        return notificationUidReadAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("nid", getNid())
            .append("notificationUidAction", getNotificationUidAction())
            .append("notificationUidSubjectId", getNotificationUidSubjectId())
            .append("notificationUid", getNotificationUid())
            .append("notificationUidFromUid", getNotificationUidFromUid())
            .append("notificationUidReadAt", getNotificationUidReadAt())
            .toString();
    }
}
