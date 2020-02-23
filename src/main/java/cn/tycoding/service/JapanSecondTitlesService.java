package cn.tycoding.service;

import cn.tycoding.pojo.Japan;

import java.util.List;

public interface JapanSecondTitlesService extends BaseService<Japan>{
   public List<Japan> selectTitles();
}
