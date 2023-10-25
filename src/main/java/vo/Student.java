package vo;

public class Student {
    /*
    * 学生类
    * */
    private String name, logo; // 学生名字
    private int id, s_class; // 学生id
    private Class grade; // 学生年级
    private int Acj, Bcj, Ccj, Zcj; // 三学科成绩

    public Student() {}

    public Student(String name, String logo, int id, int s_class, Class grade, int Acj, int Bcj, int Ccj, int Zcj) {
        this.name = name;
        this.logo = logo;
        this.id = id;
        this.s_class = s_class;
        this.grade = grade;
        this.Acj = Acj;
        this.Bcj = Bcj;
        this.Ccj = Ccj;
        this.Zcj = Zcj;
    }

    /**
     * 获取
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * 
     * @return logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 设置
     * 
     * @param logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * 获取
     * 
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * 
     * @return s_class
     */
    public int getS_class() {
        return s_class;
    }

    /**
     * 设置
     * 
     * @param s_class
     */
    public void setS_class(int s_class) {
        this.s_class = s_class;
    }

    /**
     * 获取
     * 
     * @return grade
     */
    public Class getGrade() {
        return grade;
    }

    /**
     * 设置
     * 
     * @param grade
     */
    public void setGrade(Class grade) {
        this.grade = grade;
    }

    /**
     * 获取
     * 
     * @return Acj
     */
    public int getAcj() {
        return Acj;
    }

    /**
     * 设置
     * 
     * @param Acj
     */
    public void setAcj(int Acj) {
        this.Acj = Acj;
    }

    /**
     * 获取
     * 
     * @return Bcj
     */
    public int getBcj() {
        return Bcj;
    }

    /**
     * 设置
     * 
     * @param Bcj
     */
    public void setBcj(int Bcj) {
        this.Bcj = Bcj;
    }

    /**
     * 获取
     * 
     * @return Ccj
     */
    public int getCcj() {
        return Ccj;
    }

    /**
     * 设置
     * 
     * @param Ccj
     */
    public void setCcj(int Ccj) {
        this.Ccj = Ccj;
    }

    /**
     * 获取
     * 
     * @return Zcj
     */
    public int getZcj() {
        return Zcj;
    }

    /**
     * 设置
     * 
     * @param Zcj
     */
    public void setZcj(int Zcj) {
        this.Zcj = Zcj;
    }

    public String toString() {
        return "Student{name = " + name + ", logo = " + logo + ", id = " + id + ", s_class = " + s_class + ", grade = "
            + grade + ", Acj = " + Acj + ", Bcj = " + Bcj + ", Ccj = " + Ccj + ", Zcj = " + Zcj + "}";
    }
}
