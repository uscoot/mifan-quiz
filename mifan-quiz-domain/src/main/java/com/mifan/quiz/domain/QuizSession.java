package com.mifan.quiz.domain;

import org.moonframework.model.mybatis.domain.BaseEntity;

/**
 * @author ZYW
 * @version 1.0
 * @since 2017-12-12
 */
public class QuizSession extends BaseEntity {

    public static final String TABLE_NAME = "quiz_session";

    public static final String SESSION_CODE = "session_code";
    public static final String QUIZ_ID = "quiz_id";
    public static final String ANSWER_NUM = "answer_num";
    public static final String RIGHT_NUM = "right_num";
    public static final String ALL_DONE = "all_done";

    private static final long serialVersionUID = -4799041271117063057L;

    private String sessionCode;
    private Long quizId;
    private Integer answerNum;
    private Integer rightNum;
    private Integer allDone;

    public QuizSession() {
    }

    public QuizSession(Long id) {
        super(id);
    }

    /**
     * @return session编码
     */
    public String getSessionCode() {
        return sessionCode;
    }

    /**
     * @param sessionCode session编码
     */
    public void setSessionCode(String sessionCode) {
        this.sessionCode = sessionCode;
    }
    /**
     * @return 试卷ID
     */
    public Long getQuizId() {
        return quizId;
    }

    /**
     * @param quizId 试卷ID
     */
    public void setQuizId(Long quizId) {
        this.quizId = quizId;
    }
    /**
     * @return 答题个数
     */
    public Integer getAnswerNum() {
        return answerNum;
    }

    /**
     * @param answerNum 答题个数
     */
    public void setAnswerNum(Integer answerNum) {
        this.answerNum = answerNum;
    }
    /**
     * @return 答对个数
     */
    public Integer getRightNum() {
        return rightNum;
    }

    /**
     * @param rightNum 答对个数
     */
    public void setRightNum(Integer rightNum) {
        this.rightNum = rightNum;
    }
    /**
     * @return 是否全部答完 0：否  1：是
     */
    public Integer getAllDone() {
        return allDone;
    }

    /**
     * @param allDone 是否全部答完 0：否  1：是
     */
    public void setAllDone(Integer allDone) {
        this.allDone = allDone;
    }

}
