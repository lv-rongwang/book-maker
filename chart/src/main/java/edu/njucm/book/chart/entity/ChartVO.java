package edu.njucm.book.chart.entity;

import java.io.Serializable;
import java.util.Date;

public class ChartVO implements Serializable {
    /**
     * 图表id
     */
    private Long chartId;

    /**
     * 对应书的id
     */
    private Long bookId;

    /**
     * 章
     */
    private String chapter;

    /**
     * 节
     */
    private String section;

    /**
     * 段落
     */
    private String paragraph;

    /**
     * 知识点
     */
    private String knowledge;

    /**
     * 习题
     */
    private String exercise;

    /**
     * 图表位置
     */
    private String position;

    /**
     * 图表名
     */
    private String chartName;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 更新人
     */
    private Long updatePerson;

    /**
     * 内容类型,1:图片,2:表格
     */
    private Short dataType;
    /**
     * 图片或表格的内容
     */
    private Object content;

    public Long getChartId() {
        return chartId;
    }

    public void setChartId(Long chartId) {
        this.chartId = chartId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getParagraph() {
        return paragraph;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

    public String getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(String knowledge) {
        this.knowledge = knowledge;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getChartName() {
        return chartName;
    }

    public void setChartName(String chartName) {
        this.chartName = chartName;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdatePerson() {
        return updatePerson;
    }

    public void setUpdatePerson(Long updatePerson) {
        this.updatePerson = updatePerson;
    }

    public Short getDataType() {
        return dataType;
    }

    public void setDataType(Short dataType) {
        this.dataType = dataType;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
