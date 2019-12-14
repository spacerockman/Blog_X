package cn.tycoding.service.impl;

import cn.tycoding.mapper.IndexBarMapper;
import cn.tycoding.pojo.IndexBar;
import cn.tycoding.pojo.Question;
import cn.tycoding.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    private IndexBarMapper indexBarMapper;

    @Override
    public List<IndexBar> selectBar() {
        return indexBarMapper.selectBar();
    }

    @Override
    public List<IndexBar> findAll() {
        return null;
    }

    @Override
    public IndexBar findById(Long id) {
        return null;
    }

    @Override
    public void create(IndexBar indexBar) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(IndexBar indexBar) {

    }
}
