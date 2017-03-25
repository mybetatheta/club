/**
 * 请勿将俱乐部专享资源复制给其他人，保护知识产权即是保护我们所在的行业，进而保护我们自己的利益
 * 即便是公司的同事，也请尊重 JFinal 作者的努力与付出，不要复制给同事
 * 
 * 如果你尚未加入俱乐部，请立即删除该项目，或者现在加入俱乐部：http://jfinal.com/club
 * 
 * 俱乐部将提供 jfinal-club 项目文档与设计资源、专用 QQ 群，以及作者在俱乐部定期的分享与答疑，
 * 价值远比仅仅拥有 jfinal club 项目源代码要大得多
 * 
 * JFinal 俱乐部是五年以来首次寻求外部资源的尝试，以便于有资源创建更加
 * 高品质的产品与服务，为大家带来更大的价值，所以请大家多多支持，不要将
 * 首次的尝试扼杀在了摇篮之中
 */

package com.jfinal.club.common.model;

import com.jfinal.club.common.model.base.BaseNewsFeed;

/**
 * NewsFeed
 * 
 * id
 * accountId         发布该动态的用户
 * refType             动态引用类型
 * refId                 动态引用所关联的 id，与 refType 配合，可唯一确定是某个表中的某条记录
 * refParentType   refId 对象的父对象，例如 share_reply 的父对象是 share
 * refParentId       refId 对象的父对象的 id
 * createAt
 */
@SuppressWarnings("serial")
public class NewsFeed extends BaseNewsFeed<NewsFeed> {

	public static final int REF_TYPE_PROJECT = 1;                    // 项目动态
	public static final int REF_TYPE_PROJECT_REPLY = 2;         // 项目回复动态，暂时不用

	public static final int REF_TYPE_SHARE = 3;                       // 分享动态
	public static final int REF_TYPE_SHARE_REPLY = 4;            // 分享回复动态

	public static final int REF_TYPE_FEEDBACK = 5;                 // 反馈动态
	public static final int REF_TYPE_FEEDBACK_REPLY = 6;      // 反馈回复动态

	public boolean isRefTypeProject() {
		return getRefType() == REF_TYPE_PROJECT;
	}

	public boolean isRefTypeProjectReply() {
		return getRefType() == REF_TYPE_PROJECT_REPLY;
	}

	public boolean isRefTypeShare() {
		return getRefType() == REF_TYPE_SHARE;
	}

	public boolean isRefTypeShareReply() {
		return getRefType() == REF_TYPE_SHARE_REPLY;
	}

	public boolean isRefTypeFeedback() {
		return getRefType() == REF_TYPE_FEEDBACK;
	}

	public boolean isRefTypeFeedbackReply() {
		return getRefType() == REF_TYPE_FEEDBACK_REPLY;
	}
}