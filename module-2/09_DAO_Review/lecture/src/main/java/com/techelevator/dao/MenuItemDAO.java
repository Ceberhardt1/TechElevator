package com.techelevator.dao;


import com.techelevator.model.MenuItem;

import java.util.List;

public interface MenuItemDAO {

        MenuItem retrieveMenuItemById(int id);
        MenuItem retrieveMenuItemByName(String name);

        List<MenuItem> retrieveMenuItems();

        MenuItem createMenuItem(MenuItem newItem);

        MenuItem updateMenuItem(MenuItem itemToUpdate);

        void deleteMenuItem(int menuId);


    }
