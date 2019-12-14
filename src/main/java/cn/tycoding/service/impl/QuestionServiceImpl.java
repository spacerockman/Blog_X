package cn.tycoding.service.impl;

import cn.tycoding.mapper.QuestionMapper;
import cn.tycoding.pojo.Question;
import cn.tycoding.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionMapper questionMapper;


    @Override
    public List<Question> selectQuestion() {
        return questionMapper.selectQuestion();
    }


    @Override
    public List<Question> findAll() {
        return null;
    }

    @Override
    public Question findById(Long id) {
        return null;
    }

    @Override
    public void create(Question question) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Question question) {

    }

}
