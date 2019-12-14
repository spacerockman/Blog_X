package cn.tycoding.service;

import cn.tycoding.pojo.Question;

import java.util.List;

public interface QuestionService extends BaseService<Question> {
     List<Question> selectQuestion();
}
