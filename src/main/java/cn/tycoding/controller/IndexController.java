package cn.tycoding.controller;

import cn.tycoding.pojo.IndexBar;
import cn.tycoding.pojo.Question;
import cn.tycoding.service.IndexService;
import cn.tycoding.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "/index")
public class IndexController {

    @Autowired
    private IndexService indexService;

    @Autowired
    private QuestionService questionService;
    //查询bar
    @RequestMapping(value = "/home")
    public String selectBar(Model model){
        List<IndexBar> indexBars = indexService.selectBar();
        List<Question> questions = questionService.selectQuestion();
//        System.out.println(questions.get(1).getTitle()+"ahaahahhahhhahahahahahhahahahahahahaha");
        model.addAttribute("indexBars",indexBars);
        model.addAttribute("questions",questions);
        return "index";
    }

    //登录
    @RequestMapping(value = "/loginPage")
    public String getLoginPage(){

        return "backside/login";
    }

    @RequestMapping(value = "/loginAfter")
    public String loginAfter(Model model){
        List<IndexBar> indexBars = indexService.selectBar();
        List<Question> questions = questionService.selectQuestion();
        model.addAttribute("indexBars",indexBars);
        model.addAttribute("questions",questions);
        return "page/afterLogin";
    }

}
