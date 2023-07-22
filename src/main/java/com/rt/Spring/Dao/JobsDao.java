package com.rt.Spring.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rt.Spring.Entity.JobsEntity;

@Repository
public class JobsDao {
	@Autowired
	JdbcTemplate template;

	public boolean signup(JobsEntity js) {
		try {
			Object[] args = { js.getName(), js.getEmail(), js.getCountrycode(), js.getMobile(), js.getJobs(),
					js.getPassword(), js.getRepassword() };
			int data = template.update(
					"insert into empdata(`name`,`email`,`countrycode`,`mobile`,`jobs`,`password`,`repassword`) values(?,?,?,?,?,?,?)",
					args);
			if (data == 1) {
				return true;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	public boolean delete(int id) {

		try {
			Object[] args = { id };
			int data = template.update("delete from empdata where id=?", args);
			if (data == 1) {
				return true;
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return false;
	}

	public boolean update(JobsEntity js) {
		try {
			Object[] args = { js.getName(), js.getEmail(), js.getCountrycode(), js.getMobile(), js.getJobs(),
					js.getPassword(), js.getRepassword(), js.getId() };
			int data = template.update(
					"update empdata set name=?,email=?,countrycode=?,mobile=?,jobs=?,password=?,repassword=? where id=?",
					args);
			if (data == 1) {
				return true;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	public JobsEntity select(int id) {
		JobsEntity js = null;

		try {

			Object[] args = { id };
			js = template.queryForObject("select * from empdata  where id = ?", args, new RowMapper<JobsEntity>() {

				public JobsEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
					return new JobsEntity(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
				}
			});

		} catch (Exception e) {
			System.out.println(e);
		}
		return js;

	}

	public List<JobsEntity> selectAll() {

		List<JobsEntity> js = null;

		try {

			js = template.query("select * from empdata  ", new RowMapper<JobsEntity>() {

				public JobsEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
					return new JobsEntity(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
				}
			});

		} catch (Exception e) {
			System.out.println(e);
		}
		return js;

	}

}
