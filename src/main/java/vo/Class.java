package vo;

import java.util.List;

public class Class {
    /*年级类
    */
    private int cid;
    private String cname;
    private List<Student> studentList;

    public Class() {}

    public Class(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public Class(int cid, String cname, List<Student> studentList) {
        this.cid = cid;
        this.cname = cname;
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    /**
     * 获取
     * 
     * @return cid
     */
    public int getCid() {
        return cid;
    }

    /**
     * 设置
     * 
     * @param cid
     */
    public void setCid(int cid) {
        this.cid = cid;
    }

    /**
     * 获取
     * 
     * @return cname
     */
    public String getCname() {
        return cname;
    }

    /**
     * 设置
     * 
     * @param cname
     */
    public void setCname(String cname) {
        this.cname = cname;
    }

    public String toString() {
        return "Class{cid = " + cid + ", cname = " + cname + "}";
    }
}
