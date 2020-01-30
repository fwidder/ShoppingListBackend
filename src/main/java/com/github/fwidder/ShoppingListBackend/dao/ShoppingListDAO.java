package com.github.fwidder.ShoppingListBackend.dao;

import com.github.fwidder.ShoppingListBackend.model.ShoppingList;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingListDAO extends CrudRepository<ShoppingList, Long> {
}
