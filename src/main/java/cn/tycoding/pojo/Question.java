package cn.tycoding.pojo;

import java.io.Serializable;
import java.util.Date;

public class Question implements Serializable {
    private int id;
    //标题
    private String title;
    //问题
    private String question;
    //回答
    private String answer;
    //时间
    private Date createTime;

    public Date getCreateTime() {return createTime; }

    public void setCreateTime() {this.createTime = createTime; }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
