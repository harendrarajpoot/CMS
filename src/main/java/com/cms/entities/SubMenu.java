package com.cms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SubMenu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "subMenuId")
	private int id;
	private String subMenu;
	private String leftIcon;
	private String url;

	public SubMenu() {
		super();
	}

	public SubMenu(String subMenu, String leftIcon, String url) {
		super();
		this.subMenu = subMenu;
		this.leftIcon = leftIcon;
		this.url = url;
	}

	public SubMenu(int id, String subMenu, String leftIcon, String url) {
		super();
		this.id = id;
		this.subMenu = subMenu;
		this.leftIcon = leftIcon;
		this.url = url;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubMenu() {
		return subMenu;
	}

	public void setSubMenu(String subMenu) {
		this.subMenu = subMenu;
	}

	public String getLeftIcon() {
		return leftIcon;
	}

	public void setLeftIcon(String leftIcon) {
		this.leftIcon = leftIcon;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
