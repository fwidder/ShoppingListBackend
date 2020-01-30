package com.github.fwidder.ShoppingListBackend.dao;

import com.github.fwidder.ShoppingListBackend.model.ShoppingListItem;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingListItemDAO extends CrudRepository<ShoppingListItem, Long> {
}
