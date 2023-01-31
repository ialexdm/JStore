package ru.ialexdm.jstore.models.repositories;

import ru.ialexdm.jstore.models.Item;

import java.util.List;

public interface ItemRepository {
    List<Item> getAllItems();
    Item getItemById(int id);
}
