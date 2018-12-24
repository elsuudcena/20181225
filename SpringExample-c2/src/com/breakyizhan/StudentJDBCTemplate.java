package com.breakyizhan;
 
import java.util.Map;
 
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
 
public class StudentJDBCTemplate implements StudentDAO {
   private DataSource dataSource;
   private SimpleJdbcCall jdbcCall;
 
   public void setDataSource(DataSource dataSource) {
      this.dataSource = dataSource;
      this.jdbcCall =  new SimpleJdbcCall(dataSource).withProcedureName("getRecord");
   }
   public void create(String name, Integer age) {
      JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);
      String SQL = "insert into Student (name, age) values (?, ?)";
 
      jdbcTemplateObject.update( SQL, name, age);
      System.out.println("Created Record Name = " + name + " Age = " + age);
      return;
   }
   public Student getStudent(Integer id) {
      SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
      Map&amp;lt;String, Object&amp;gt; out = jdbcCall.execute(in);
 
      Student student = new Student();
      student.setId(id);
      student.setName((String) out.get("out_name"));
      student.setAge((Integer) out.get("out_age"));
      return student;
   }
   public List&lt;Student&gt; listStudents() {
      String SQL = "select * from Student";
      List &lt;Student&gt; students = jdbcTemplateObject.query(SQL, new StudentMapper());
      return students;
   }
}