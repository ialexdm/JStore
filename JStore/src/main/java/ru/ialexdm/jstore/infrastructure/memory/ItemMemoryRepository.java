package ru.ialexdm.jstore.infrastructure.memory;

import ru.ialexdm.jstore.models.repositories.ItemRepository;
import ru.ialexdm.jstore.models.Item;

import java.util.LinkedList;
import java.util.List;

public class ItemMemoryRepository implements ItemRepository {
    private final List<Item> items;

    public ItemMemoryRepository() {
        this.items = new LinkedList<>();
        this.items.add(new Item(1,"Test1","TestBook", "Test" ));
        this.items.add(new Item(2, "Test2", "TestFood", "Testing"));
        this.items.add(new Item(3,"test3","JStore","JStore"));
    }

    @Override
    public List<Item> getAllItems() {
        return items;
    }

    @Override
    public Item getItemById(int id) {
        return (Item) items.stream().filter(e -> e.id == id);
    }
}
