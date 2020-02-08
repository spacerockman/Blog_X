package cn.tycoding.service.impl;

import cn.tycoding.mapper.JapanMapper;
import cn.tycoding.pojo.Japan;
import cn.tycoding.service.JapanSecondTitlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JapanSecondTitlesServiceImpl implements JapanSecondTitlesService {

    @Autowired
    private JapanMapper japanMapper;

    @Override
    public List<Japan> selectTitles() {
        return japanMapper.selectTitles();
    }

    @Override
    public List<Japan> findAll() {
        return null;
    }

    @Override
    public Japan findById(Long id) {
        return null;
    }

    @Override
    public void create(Japan japan) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Japan japan) {

    }
}
