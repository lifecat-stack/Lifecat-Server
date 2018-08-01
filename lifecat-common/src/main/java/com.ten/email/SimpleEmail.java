package com.ten.email;

import java.io.File;
import java.util.Map;
import java.util.Set;

/**
 * simple email
 *
 * @author Administrator
 * @property accepter 收件人
 * @property subject 主题
 * @property content 正文
 * @property isHtml 正文是否是HTML
 * @property attachments 附件路径
 * @property isAttachment 是否有附件
 */
public class SimpleEmail {
    /**
     * 收件人
     */
    private Set<String> accepter;
    /**
     * 主题
     */
    private String subject;
    /**
     * 正文
     */
    private String content;
    /**
     * 正文是否是HTML
     */
    private boolean isHtml;
    /**
     * 附件路径
     */
    private Map<String, File> attachments;
    /**
     * 是否有附件
     */
    private boolean isAttachment;

    public Set<String> getAccepter() {
        return accepter;
    }

    public void setAccepter(Set<String> accepter) {
        this.accepter = accepter;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isHtml() {
        return isHtml;
    }

    public void setHtml(boolean isHtml) {
        this.isHtml = isHtml;
    }

    public Map<String, File> getAttachments() {
        return attachments;
    }

    public void setAttachments(Map<String, File> attachments) {
        this.attachments = attachments;
    }

    public boolean isAttachment() {
        return isAttachment;
    }

    public void setAttachment(boolean isAttachment) {
        this.isAttachment = isAttachment;
    }

}
