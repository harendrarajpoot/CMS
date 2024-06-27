package com.cms.services;

import java.util.List;

import com.cms.entities.MainMenu;

public interface MainMenuService {

	public int saveMenu(MainMenu mainMenu);
	public void delete(int id);
	public int update(MainMenu mainMenu);
	public List<MainMenu>getAllMainMenu();
}
