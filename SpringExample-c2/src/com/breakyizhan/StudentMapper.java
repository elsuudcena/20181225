package com.breakyizhan;
 
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
 
public class StudentMapper implements RowMapper&amp;lt;Student&amp;gt; 
{
   public Student mapRow(ResultSet rs, int rowNum) throws SQLException
   {
      Student student = new Student();
      student.setId(rs.getInt("id"));
      student.setName(rs.getString("name"));
      student.setAge(rs.getInt("age"));
      
      return student;
   }
}