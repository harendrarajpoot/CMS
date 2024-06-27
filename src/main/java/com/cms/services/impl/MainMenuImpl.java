package com.cms.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.entities.MainMenu;
import com.cms.repository.MainMenuRepo;
import com.cms.services.MainMenuService;

@Service
public class MainMenuImpl implements MainMenuService {

	
	@Autowired
	private MainMenuRepo menuRepo;
	@Override
	public int saveMenu(MainMenu mainMenu) {
		// TODO Auto-generated method stub
		return menuRepo.save(mainMenu).getId();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int update(MainMenu mainMenu) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<MainMenu> getAllMainMenu() {
		return menuRepo.findAll();
	}

}
