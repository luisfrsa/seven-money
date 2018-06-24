package com.luis.sevenmoney.repository;

import java.util.List;
import java.util.TreeMap;

public interface RepositoryInterface<T> {

    List<T> getAll();
    List<T> set(List<T> registers);
    /*TODO in future versions, create delete and update methods*/
}
