package hello.itemservice.repository.mybatis;

import hello.itemservice.domain.Item;
import hello.itemservice.repository.ItemRepository;
import hello.itemservice.repository.ItemSearchCond;
import hello.itemservice.repository.ItemUpdateDto;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class MyBatisItemRepository implements ItemRepository {

  private final ItemMapper itemMapper;

  @Override
  public Item save(Item item) {
    itemMapper.save(item);
    return item;
  }

  @Override
  public void update(Long itemId, ItemUpdateDto updateParam) {
    itemMapper.update(itemId, updateParam);
  }

  @Override
  public Optional<Item> findById(Long id) {
    return itemMapper.findById(id);
  }

  @Override
  public List<Item> findAll(ItemSearchCond cond) {
    return itemMapper.findAll(cond);
  }
}
