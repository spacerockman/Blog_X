package cn.tycoding.service;

import cn.tycoding.pojo.IndexBar;

import java.util.List;

public interface IndexService extends BaseService<IndexBar> {
    public List<IndexBar> selectBar();
}
