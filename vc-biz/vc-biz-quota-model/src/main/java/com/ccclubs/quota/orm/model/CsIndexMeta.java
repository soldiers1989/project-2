package com.ccclubs.quota.orm.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class CsIndexMeta implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_index_meta.index_id
     *
     * @mbg.generated
     */
    private Long indexId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_index_meta.index_name
     *
     * @mbg.generated
     */
    private String indexName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_index_meta.index_comment
     *
     * @mbg.generated
     */
    private String indexComment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_index_meta.min_value
     *
     * @mbg.generated
     */
    private BigDecimal minValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_index_meta.max_value
     *
     * @mbg.generated
     */
    private BigDecimal maxValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_index_meta.normal_value
     *
     * @mbg.generated
     */
    private BigDecimal normalValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cs_index_meta
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_index_meta.index_id
     *
     * @return the value of cs_index_meta.index_id
     *
     * @mbg.generated
     */
    public Long getIndexId() {
        return indexId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_index_meta.index_id
     *
     * @param indexId the value for cs_index_meta.index_id
     *
     * @mbg.generated
     */
    public void setIndexId(Long indexId) {
        this.indexId = indexId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_index_meta.index_name
     *
     * @return the value of cs_index_meta.index_name
     *
     * @mbg.generated
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_index_meta.index_name
     *
     * @param indexName the value for cs_index_meta.index_name
     *
     * @mbg.generated
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName == null ? null : indexName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_index_meta.index_comment
     *
     * @return the value of cs_index_meta.index_comment
     *
     * @mbg.generated
     */
    public String getIndexComment() {
        return indexComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_index_meta.index_comment
     *
     * @param indexComment the value for cs_index_meta.index_comment
     *
     * @mbg.generated
     */
    public void setIndexComment(String indexComment) {
        this.indexComment = indexComment == null ? null : indexComment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_index_meta.min_value
     *
     * @return the value of cs_index_meta.min_value
     *
     * @mbg.generated
     */
    public BigDecimal getMinValue() {
        return minValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_index_meta.min_value
     *
     * @param minValue the value for cs_index_meta.min_value
     *
     * @mbg.generated
     */
    public void setMinValue(BigDecimal minValue) {
        this.minValue = minValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_index_meta.max_value
     *
     * @return the value of cs_index_meta.max_value
     *
     * @mbg.generated
     */
    public BigDecimal getMaxValue() {
        return maxValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_index_meta.max_value
     *
     * @param maxValue the value for cs_index_meta.max_value
     *
     * @mbg.generated
     */
    public void setMaxValue(BigDecimal maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_index_meta.normal_value
     *
     * @return the value of cs_index_meta.normal_value
     *
     * @mbg.generated
     */
    public BigDecimal getNormalValue() {
        return normalValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_index_meta.normal_value
     *
     * @param normalValue the value for cs_index_meta.normal_value
     *
     * @mbg.generated
     */
    public void setNormalValue(BigDecimal normalValue) {
        this.normalValue = normalValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_index_meta
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CsIndexMeta other = (CsIndexMeta) that;
        return (this.getIndexId() == null ? other.getIndexId() == null : this.getIndexId().equals(other.getIndexId()))
            && (this.getIndexName() == null ? other.getIndexName() == null : this.getIndexName().equals(other.getIndexName()))
            && (this.getIndexComment() == null ? other.getIndexComment() == null : this.getIndexComment().equals(other.getIndexComment()))
            && (this.getMinValue() == null ? other.getMinValue() == null : this.getMinValue().equals(other.getMinValue()))
            && (this.getMaxValue() == null ? other.getMaxValue() == null : this.getMaxValue().equals(other.getMaxValue()))
            && (this.getNormalValue() == null ? other.getNormalValue() == null : this.getNormalValue().equals(other.getNormalValue()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_index_meta
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        result = prime * result + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        result = prime * result + ((getIndexComment() == null) ? 0 : getIndexComment().hashCode());
        result = prime * result + ((getMinValue() == null) ? 0 : getMinValue().hashCode());
        result = prime * result + ((getMaxValue() == null) ? 0 : getMaxValue().hashCode());
        result = prime * result + ((getNormalValue() == null) ? 0 : getNormalValue().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_index_meta
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", indexId=").append(indexId);
        sb.append(", indexName=").append(indexName);
        sb.append(", indexComment=").append(indexComment);
        sb.append(", minValue=").append(minValue);
        sb.append(", maxValue=").append(maxValue);
        sb.append(", normalValue=").append(normalValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}