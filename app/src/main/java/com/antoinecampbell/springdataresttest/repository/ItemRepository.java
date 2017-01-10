package com.antoinecampbell.springdataresttest.repository;

import com.antoinecampbell.springdataresttest.model.Item;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Antoine
 */
@SuppressWarnings("unused")
public interface ItemRepository extends PagingAndSortingRepository<Item, Long> {

}
