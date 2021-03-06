package com.online.college.opt.vo;

import java.util.ArrayList;
import java.util.List;

import com.online.college.service.core.consts.domain.ConstsClassify;
import com.online.college.service.core.course.domain.Course;

/**
 *
 * @Description: TODO
 * @author majinlan
 * @date 2018-02-11 19:10
 * @version V1.0
 */
public class ConstsClassifyVO extends ConstsClassify {

    private static final long serialVersionUID = -6898939223836635781L;

    /**
     * 子分类列表
     */
    private List<ConstsClassify> subClassifyList = new ArrayList<ConstsClassify>();

    /**
     * 课程推荐列表
     */
    private List<Course> recomdCourseList;

    public List<ConstsClassify> getSubClassifyList() {
        return subClassifyList;
    }

    public void setSubClassifyList(List<ConstsClassify> subClassifyList) {
        this.subClassifyList = subClassifyList;
    }

    public List<Course> getRecomdCourseList() {
        return recomdCourseList;
    }

    public void setRecomdCourseList(List<Course> recomdCourseList) {
        this.recomdCourseList = recomdCourseList;
    }

}
