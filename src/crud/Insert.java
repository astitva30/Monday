package crud;

import hib.dto.Batch;
import hib.dto.Teacher;
import hib.dto.Student;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Session;
public class Insert {
    
    public static void main(String...args){
        
        Configuration c1 = new Configuration();
        Configuration c2 = c1.configure(); //cfg file
        SessionFactory sf = c2.buildSessionFactory();
        
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        Teacher teacher1 = new Teacher("astitva32_","Astitva@123","Astitva Deshpande","8827499656",4);
        Student stu1 = new Student(0,"astitva30_","Astitva@123","Astitva Deshpande","Male","java67","47,bijliNagar","8827499656");
        
        session.save(teacher1);
        session.save(stu1);
        tx.commit();
        session.close();  // connection close
        System.out.println("record inserted");
    }
    
}
