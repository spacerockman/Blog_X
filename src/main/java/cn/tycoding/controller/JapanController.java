package cn.tycoding.controller;

import cn.tycoding.pojo.IndexBar;
import cn.tycoding.pojo.Japan;
import cn.tycoding.service.IndexService;
import cn.tycoding.service.JapanSecondTitlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 用户的控制层
 *
 * @author tycoding
 * @date 18-4-7下午9:00
 */
@Controller
@RequestMapping(value = "/japan")
public class JapanController {

    //注入service
    @Autowired
    private IndexService indexService;

    @Autowired
    private JapanSecondTitlesService japanSecondTitlesService;
    /**
     * 日本
     */
    @RequestMapping(value = "/dailylife")
    public String dailyLife( Model model) {

        List<IndexBar> indexBars = indexService.selectBar();
        List<Japan> japanTitles = japanSecondTitlesService.selectTitles();
        model.addAttribute("indexBars",indexBars);
        model.addAttribute("japanTitles",japanTitles);
        return "page/Japan/dailylife";
    }

    /**
     * 回到登录页
     */
    @RequestMapping(value="/")
    public String index(){
        return "index";
    }
}
