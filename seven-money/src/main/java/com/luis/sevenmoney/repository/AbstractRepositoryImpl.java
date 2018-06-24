package com.luis.sevenmoney.repository;

import com.luis.sevenmoney.Exception.ApplicationException;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;

public abstract class AbstractRepositoryImpl<T> implements RepositoryInterface<T> {

    private List<T> registers = new ArrayList<>();

    @Override
    public List<T> getAll() {
        return registers;
    }

    @Override
    public List<T> set(List<T> registers) {
        this.registers = registers;
        return this.registers;
    }


}
