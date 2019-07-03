package com.cjc.Repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cjc.model.User;

public interface HomeRepository extends PagingAndSortingRepository<User, Integer> {

}
