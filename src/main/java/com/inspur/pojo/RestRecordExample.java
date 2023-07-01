package com.inspur.pojo;

import java.util.ArrayList;
import java.util.List;

public class RestRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RestRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRestIdIsNull() {
            addCriterion("rest_id is null");
            return (Criteria) this;
        }

        public Criteria andRestIdIsNotNull() {
            addCriterion("rest_id is not null");
            return (Criteria) this;
        }

        public Criteria andRestIdEqualTo(Long value) {
            addCriterion("rest_id =", value, "restId");
            return (Criteria) this;
        }

        public Criteria andRestIdNotEqualTo(Long value) {
            addCriterion("rest_id <>", value, "restId");
            return (Criteria) this;
        }

        public Criteria andRestIdGreaterThan(Long value) {
            addCriterion("rest_id >", value, "restId");
            return (Criteria) this;
        }

        public Criteria andRestIdGreaterThanOrEqualTo(Long value) {
            addCriterion("rest_id >=", value, "restId");
            return (Criteria) this;
        }

        public Criteria andRestIdLessThan(Long value) {
            addCriterion("rest_id <", value, "restId");
            return (Criteria) this;
        }

        public Criteria andRestIdLessThanOrEqualTo(Long value) {
            addCriterion("rest_id <=", value, "restId");
            return (Criteria) this;
        }

        public Criteria andRestIdIn(List<Long> values) {
            addCriterion("rest_id in", values, "restId");
            return (Criteria) this;
        }

        public Criteria andRestIdNotIn(List<Long> values) {
            addCriterion("rest_id not in", values, "restId");
            return (Criteria) this;
        }

        public Criteria andRestIdBetween(Long value1, Long value2) {
            addCriterion("rest_id between", value1, value2, "restId");
            return (Criteria) this;
        }

        public Criteria andRestIdNotBetween(Long value1, Long value2) {
            addCriterion("rest_id not between", value1, value2, "restId");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andRestStartDateIsNull() {
            addCriterion("rest_start_date is null");
            return (Criteria) this;
        }

        public Criteria andRestStartDateIsNotNull() {
            addCriterion("rest_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andRestStartDateEqualTo(String value) {
            addCriterion("rest_start_date =", value, "restStartDate");
            return (Criteria) this;
        }

        public Criteria andRestStartDateNotEqualTo(String value) {
            addCriterion("rest_start_date <>", value, "restStartDate");
            return (Criteria) this;
        }

        public Criteria andRestStartDateGreaterThan(String value) {
            addCriterion("rest_start_date >", value, "restStartDate");
            return (Criteria) this;
        }

        public Criteria andRestStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("rest_start_date >=", value, "restStartDate");
            return (Criteria) this;
        }

        public Criteria andRestStartDateLessThan(String value) {
            addCriterion("rest_start_date <", value, "restStartDate");
            return (Criteria) this;
        }

        public Criteria andRestStartDateLessThanOrEqualTo(String value) {
            addCriterion("rest_start_date <=", value, "restStartDate");
            return (Criteria) this;
        }

        public Criteria andRestStartDateLike(String value) {
            addCriterion("rest_start_date like", value, "restStartDate");
            return (Criteria) this;
        }

        public Criteria andRestStartDateNotLike(String value) {
            addCriterion("rest_start_date not like", value, "restStartDate");
            return (Criteria) this;
        }

        public Criteria andRestStartDateIn(List<String> values) {
            addCriterion("rest_start_date in", values, "restStartDate");
            return (Criteria) this;
        }

        public Criteria andRestStartDateNotIn(List<String> values) {
            addCriterion("rest_start_date not in", values, "restStartDate");
            return (Criteria) this;
        }

        public Criteria andRestStartDateBetween(String value1, String value2) {
            addCriterion("rest_start_date between", value1, value2, "restStartDate");
            return (Criteria) this;
        }

        public Criteria andRestStartDateNotBetween(String value1, String value2) {
            addCriterion("rest_start_date not between", value1, value2, "restStartDate");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("start_time like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("start_time not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andRestEndDateIsNull() {
            addCriterion("rest_end_date is null");
            return (Criteria) this;
        }

        public Criteria andRestEndDateIsNotNull() {
            addCriterion("rest_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andRestEndDateEqualTo(String value) {
            addCriterion("rest_end_date =", value, "restEndDate");
            return (Criteria) this;
        }

        public Criteria andRestEndDateNotEqualTo(String value) {
            addCriterion("rest_end_date <>", value, "restEndDate");
            return (Criteria) this;
        }

        public Criteria andRestEndDateGreaterThan(String value) {
            addCriterion("rest_end_date >", value, "restEndDate");
            return (Criteria) this;
        }

        public Criteria andRestEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("rest_end_date >=", value, "restEndDate");
            return (Criteria) this;
        }

        public Criteria andRestEndDateLessThan(String value) {
            addCriterion("rest_end_date <", value, "restEndDate");
            return (Criteria) this;
        }

        public Criteria andRestEndDateLessThanOrEqualTo(String value) {
            addCriterion("rest_end_date <=", value, "restEndDate");
            return (Criteria) this;
        }

        public Criteria andRestEndDateLike(String value) {
            addCriterion("rest_end_date like", value, "restEndDate");
            return (Criteria) this;
        }

        public Criteria andRestEndDateNotLike(String value) {
            addCriterion("rest_end_date not like", value, "restEndDate");
            return (Criteria) this;
        }

        public Criteria andRestEndDateIn(List<String> values) {
            addCriterion("rest_end_date in", values, "restEndDate");
            return (Criteria) this;
        }

        public Criteria andRestEndDateNotIn(List<String> values) {
            addCriterion("rest_end_date not in", values, "restEndDate");
            return (Criteria) this;
        }

        public Criteria andRestEndDateBetween(String value1, String value2) {
            addCriterion("rest_end_date between", value1, value2, "restEndDate");
            return (Criteria) this;
        }

        public Criteria andRestEndDateNotBetween(String value1, String value2) {
            addCriterion("rest_end_date not between", value1, value2, "restEndDate");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("end_time like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("end_time not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andRestTimeIsNull() {
            addCriterion("rest_time is null");
            return (Criteria) this;
        }

        public Criteria andRestTimeIsNotNull() {
            addCriterion("rest_time is not null");
            return (Criteria) this;
        }

        public Criteria andRestTimeEqualTo(String value) {
            addCriterion("rest_time =", value, "restTime");
            return (Criteria) this;
        }

        public Criteria andRestTimeNotEqualTo(String value) {
            addCriterion("rest_time <>", value, "restTime");
            return (Criteria) this;
        }

        public Criteria andRestTimeGreaterThan(String value) {
            addCriterion("rest_time >", value, "restTime");
            return (Criteria) this;
        }

        public Criteria andRestTimeGreaterThanOrEqualTo(String value) {
            addCriterion("rest_time >=", value, "restTime");
            return (Criteria) this;
        }

        public Criteria andRestTimeLessThan(String value) {
            addCriterion("rest_time <", value, "restTime");
            return (Criteria) this;
        }

        public Criteria andRestTimeLessThanOrEqualTo(String value) {
            addCriterion("rest_time <=", value, "restTime");
            return (Criteria) this;
        }

        public Criteria andRestTimeLike(String value) {
            addCriterion("rest_time like", value, "restTime");
            return (Criteria) this;
        }

        public Criteria andRestTimeNotLike(String value) {
            addCriterion("rest_time not like", value, "restTime");
            return (Criteria) this;
        }

        public Criteria andRestTimeIn(List<String> values) {
            addCriterion("rest_time in", values, "restTime");
            return (Criteria) this;
        }

        public Criteria andRestTimeNotIn(List<String> values) {
            addCriterion("rest_time not in", values, "restTime");
            return (Criteria) this;
        }

        public Criteria andRestTimeBetween(String value1, String value2) {
            addCriterion("rest_time between", value1, value2, "restTime");
            return (Criteria) this;
        }

        public Criteria andRestTimeNotBetween(String value1, String value2) {
            addCriterion("rest_time not between", value1, value2, "restTime");
            return (Criteria) this;
        }

        public Criteria andRestCourseIsNull() {
            addCriterion("rest_course is null");
            return (Criteria) this;
        }

        public Criteria andRestCourseIsNotNull() {
            addCriterion("rest_course is not null");
            return (Criteria) this;
        }

        public Criteria andRestCourseEqualTo(String value) {
            addCriterion("rest_course =", value, "restCourse");
            return (Criteria) this;
        }

        public Criteria andRestCourseNotEqualTo(String value) {
            addCriterion("rest_course <>", value, "restCourse");
            return (Criteria) this;
        }

        public Criteria andRestCourseGreaterThan(String value) {
            addCriterion("rest_course >", value, "restCourse");
            return (Criteria) this;
        }

        public Criteria andRestCourseGreaterThanOrEqualTo(String value) {
            addCriterion("rest_course >=", value, "restCourse");
            return (Criteria) this;
        }

        public Criteria andRestCourseLessThan(String value) {
            addCriterion("rest_course <", value, "restCourse");
            return (Criteria) this;
        }

        public Criteria andRestCourseLessThanOrEqualTo(String value) {
            addCriterion("rest_course <=", value, "restCourse");
            return (Criteria) this;
        }

        public Criteria andRestCourseLike(String value) {
            addCriterion("rest_course like", value, "restCourse");
            return (Criteria) this;
        }

        public Criteria andRestCourseNotLike(String value) {
            addCriterion("rest_course not like", value, "restCourse");
            return (Criteria) this;
        }

        public Criteria andRestCourseIn(List<String> values) {
            addCriterion("rest_course in", values, "restCourse");
            return (Criteria) this;
        }

        public Criteria andRestCourseNotIn(List<String> values) {
            addCriterion("rest_course not in", values, "restCourse");
            return (Criteria) this;
        }

        public Criteria andRestCourseBetween(String value1, String value2) {
            addCriterion("rest_course between", value1, value2, "restCourse");
            return (Criteria) this;
        }

        public Criteria andRestCourseNotBetween(String value1, String value2) {
            addCriterion("rest_course not between", value1, value2, "restCourse");
            return (Criteria) this;
        }

        public Criteria andNotesIsNull() {
            addCriterion("notes is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("notes is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("notes =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("notes <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("notes >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("notes >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("notes <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("notes <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("notes like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("notes not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("notes in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("notes not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("notes between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("notes not between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}