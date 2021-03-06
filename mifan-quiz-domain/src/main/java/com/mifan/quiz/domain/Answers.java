package com.mifan.quiz.domain;

import org.moonframework.model.mybatis.domain.BaseEntity;

/**
 * @author ZYW
 * @version 1.0
 * @since 2017-12-12
 */
public class Answers extends BaseEntity {

    public static final String TABLE_NAME = "answers";

    public static final String SESSION_ID = "session_id";
    public static final String QUESTION_ID = "question_id";
    public static final String ANSWERS = "answers";
    public static final String IS_RIGHT = "is_right";

    private static final long serialVersionUID = 3763884033459856899L;

    private Long sessionId;
    private Long questionId;
    private String answers;
    private Integer isRight;

    public Answers() {
    }

    public Answers(Long id) {
        super(id);
    }

    /**
     * @return 
     */
    public Long getSessionId() {
        return sessionId;
    }

    /**
     * @param sessionId 
     */
    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }
    /**
     * @return 问题标识
     */
    public Long getQuestionId() {
        return questionId;
    }

    /**
     * @param questionId 问题标识
     */
    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }
    /**
     * @return 用户提交的答案
     */
    public String getAnswers() {
        return answers;
    }

    /**
     * @param answers 用户提交的答案
     */
    public void setAnswers(String answers) {
        this.answers = answers;
    }
    /**
     * @return 是否答对 0：否  1：是
     */
    public Integer getIsRight() {
        return isRight;
    }

    /**
     * @param isRight 是否答对 0：否  1：是
     */
    public void setIsRight(Integer isRight) {
        this.isRight = isRight;
    }

}
