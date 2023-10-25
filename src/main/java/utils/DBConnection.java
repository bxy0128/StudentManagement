package utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBConnection {
    private SqlSession session;

    public DBConnection() {

    }

    public SqlSession getSession() {
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("sqlMapConfig.xml");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        session = factory.openSession(true);
        return session;
    }

    public void close() {
        if (session != null) {
            session.close();
        }
    }
}
