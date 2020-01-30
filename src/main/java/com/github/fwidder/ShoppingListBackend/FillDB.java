package com.github.fwidder.ShoppingListBackend;

import com.github.fwidder.ShoppingListBackend.dao.ShoppingListDAO;
import com.github.fwidder.ShoppingListBackend.dao.ShoppingListItemDAO;
import com.github.fwidder.ShoppingListBackend.model.ShoppingList;
import com.github.fwidder.ShoppingListBackend.model.ShoppingListItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class FillDB
        implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    private ShoppingListDAO shoppingListDAO;

    @Autowired
    private ShoppingListItemDAO shoppingListItemDAO;

    @Override
    public void onApplicationEvent(final ApplicationReadyEvent event) {

        ShoppingListItem item1 = ShoppingListItem.builder().name("TestItem #1").quantity("TestItem #1 Menge").build();
        ShoppingListItem item2 = ShoppingListItem.builder().name("TestItem #2").quantity("TestItem #2 Menge").build();
        ShoppingListItem item3 = ShoppingListItem.builder().name("TestItem #3").quantity("TestItem #3 Menge").build();
        ShoppingListItem item4 = ShoppingListItem.builder().name("TestItem #4").quantity("TestItem #4 Menge").build();

        item1 = shoppingListItemDAO.save(item1);
        item2 = shoppingListItemDAO.save(item2);
        item3 = shoppingListItemDAO.save(item3);
        item4 = shoppingListItemDAO.save(item4);

        List<ShoppingListItem> itemList1 = Arrays.asList(item1, item2);
        List<ShoppingListItem> itemList2 = Arrays.asList(item3, item4);

        ShoppingList shoppingList1 = ShoppingList.builder().name("TestList #1").items(itemList1).build();
        ShoppingList shoppingList2 = ShoppingList.builder().name("TestList #2").items(itemList2).build();

        shoppingListDAO.save(shoppingList1);
        shoppingListDAO.save(shoppingList2);

        System.out.println("DB Init: Items: " + shoppingListItemDAO.count() + " Lists: " + shoppingListDAO.count());
    }
}