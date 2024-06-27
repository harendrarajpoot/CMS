package com.cms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MainMenu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "menuId")
	private int id;
	private String menuName;
	private String leftIcon;
	private String rightIcon;
	private String url;
	private boolean status;
	private boolean tab;

	public MainMenu() {
		super();
	}

	
	public MainMenu(String menuName, String leftIcon, String rightIcon, String url, boolean status, boolean tab) {
		super();
		this.menuName = menuName;
		this.leftIcon = leftIcon;
		this.rightIcon = rightIcon;
		this.url = url;
		this.status = status;
		this.tab = tab;
	}


	public MainMenu(int id, String menuName, String leftIcon, String rightIcon, String url, boolean status,
			boolean tab) {
		super();
		this.id = id;
		this.menuName = menuName;
		this.leftIcon = leftIcon;
		this.rightIcon = rightIcon;
		this.url = url;
		this.status = status;
		this.tab = tab;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getLeftIcon() {
		return leftIcon;
	}

	public void setLeftIcon(String leftIcon) {
		this.leftIcon = leftIcon;
	}

	public String getRightIcon() {
		return rightIcon;
	}

	public void setRightIcon(String rightIcon) {
		this.rightIcon = rightIcon;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean isTab() {
		return tab;
	}

	public void setTab(boolean tab) {
		this.tab = tab;
	}


	
	

}
