package com.ecommerce.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ecommerce.entity.EProductEntity;   

public class EProductDAO {

        JdbcTemplate temp;    
            
        public void setTemp(JdbcTemplate temp) {    
            this.temp = temp;    
        }    
        
        public List<EProductEntity> getProducts(){    
            return temp.query("select * from eproduct",new RowMapper<EProductEntity>(){    
                public EProductEntity mapRow(ResultSet rs, int row) throws SQLException {    
                	EProductEntity e=new EProductEntity();    
                    e.setID(rs.getInt(1));    
                    e.setName(rs.getString(2));    
                    e.setPrice(rs.getBigDecimal(3));    
                    e.setDateAdded(rs.getDate(4));    
                    return e;    
                }    
            });    
        }    
}
