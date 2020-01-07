package com.zhy.sample.bean;

import com.zhy.sample.R;

import java.util.ArrayList;
import java.util.List;

public class ChatMessage
{
	private int icon;
	private String name;
	private String content;
	private String createDate;
	private int itemType;

	public final static int RECIEVE_MSG = 0;
	public final static int SEND_MSG = 1;

	public ChatMessage(int icon, String name, String content,
			String createDate, int itemType)
	{
		this.icon = icon;
		this.name = name;
		this.content = content;
		this.createDate = createDate;
		this.itemType = itemType;
	}

	public int isItemType() {
		return itemType;
	}

	public void setItemType(int itemType) {
		this.itemType = itemType;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public int getIcon()
	{
		return icon;
	}

	public void setIcon(int icon)
	{
		this.icon = icon;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getCreateDate()
	{
		return createDate;
	}

	public void setCreateDate(String createDate)
	{
		this.createDate = createDate;
	}

	@Override
	public String toString()
	{
		return "ChatMessage [icon=" + icon + ", name=" + name + ", content="
				+ content + ", createDate=" + createDate +", itemType = "+ itemType + "]";
	}

	public static List<ChatMessage> MOCK_DATAS = new ArrayList<>();

	static {
		ChatMessage msg = null;
		msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
				null, 1);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.renma, "renma", "where are you ",
				null, 2);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
				null, 1);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.renma, "renma", "where are you ",
				null, 2);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
				null, 1);
		MOCK_DATAS.add(msg);

		msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
				null, 2);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.renma, "哈哈哈哈哈", "where are you ",
				null, 3);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
				null, 1);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.renma, "哈哈哈哈哈", "where are you ",
				null, 3);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.xiaohei, "哈哈哈哈哈", "where are you ",
				null, 3);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
				null, 1);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.renma, "renma", "where are you ",
				null, 2);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.xiaohei, "哈哈哈哈哈", "where are you ",
				null, 3);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.renma, "renma", "where are you ",
				null, 1);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
				null, 1);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
				null, 2);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.renma, "renma", "where are you ",
				null, 3);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
				null, 1);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.renma, "renma", "where are you ",
				null, 2);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
				null, 1);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
				null, 1);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.renma, "renma", "where are you ",
				null, 1);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
				null, 2);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.renma, "renma", "where are you ",
				null, 2);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.xiaohei, "哈哈哈哈哈", "where are you ",
				null, 3);
		MOCK_DATAS.add(msg);
	}


}
