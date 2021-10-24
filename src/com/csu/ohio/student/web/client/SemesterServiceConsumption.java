package com.csu.ohio.student.web.client;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.csu.ohio.student.bean.SemesterBean;
import com.csu.ohio.student.exceptions.MicroServiceException;

@Service
public class SemesterServiceConsumption {

	
	@Value("${SemesterServiceConsumption.serviceURL}")
	private String serviceURL;
	
	@Value("${SemesterServiceConsumption.apiURL}")
	private String apiURL;
	
	private List<SemesterBean> semesterBeanList;
	
	private Map<String, SemesterBean> semesterMap;
	
	private RestTemplate restTemplate;	
	
	
	public List<SemesterBean> getSemesterBeanList() throws MicroServiceException {
		if(semesterBeanList == null) {
			hitGetSemesterDetails();
		}
		return semesterBeanList;
	}	

	public Map<String, SemesterBean> getSemesterMap() {
		if(semesterMap == null) {		
			semesterMap = new HashMap<String, SemesterBean>();
			for(SemesterBean bean : semesterBeanList) {				
				semesterMap.put(bean.getSemester(), bean);
			}			
		}
		return semesterMap;
	}



	public SemesterServiceConsumption(){
		restTemplate =  new RestTemplate();
	}

	private void hitGetSemesterDetails() throws MicroServiceException{
		
		try{
			//TODO
			SemesterBean[] semesterConsumptionBeans=restTemplate.getForObject(serviceURL+apiURL, SemesterBean[].class);			
			semesterBeanList=Arrays.asList(semesterConsumptionBeans);
			System.out.println(semesterBeanList);	
			
		}catch(Exception exception){
			throw new MicroServiceException();
		}
	}

}
