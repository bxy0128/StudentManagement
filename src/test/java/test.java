import com.dao.ClassMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import vo.Student;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test {
    private SqlSession session;
    private ClassMapper classMapper;
    private List<Student> list;
    @Before
    public void init() {
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("sqlMapConfig.xml");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        session = factory.openSession();

    }
    @After
    public void close(){
        if(session!=null){
            session.close();
        }
    }
    @Test
    public void Test01() {
 List<Student> list = session.selectList("com.dao.StudentMapper.SelectAllStudent");
        for (Student student : list) {
            System.out.println(student.getGrade().getCid());
        }

    }
}
