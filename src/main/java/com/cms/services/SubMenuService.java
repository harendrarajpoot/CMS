package com.cms.services;

import java.util.List;

import com.cms.entities.SubMenu;

public interface SubMenuService {

	public int saveMenu(SubMenu subMenu);
	public void delete(int id);
	public int update(SubMenu subMenu);
	public List<SubMenu>getAllMainMenu();
}
