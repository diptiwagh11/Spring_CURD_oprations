package com.rt.Spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.Spring.Dao.JobsDao;
import com.rt.Spring.Entity.JobsEntity;

@Service
public class JobsService {
	@Autowired
	JobsDao jobDao;
	
	public boolean signup(JobsEntity js) {
		
		return jobDao.signup(js);	
	}

	public boolean delete(int id) {
		
		return jobDao.delete(id);	
	}
	
   public boolean update(JobsEntity js) {
		
		return jobDao.update(js);	
	}

   public JobsEntity select(int id) {
	
	return  jobDao.select(id);
}
   public List<JobsEntity> selectAll(){
	   
	return   jobDao.selectAll();
	   
   }

}
