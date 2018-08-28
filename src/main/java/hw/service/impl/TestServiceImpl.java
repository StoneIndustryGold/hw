package hw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hw.mapper.TestMapper;
import hw.model.Test;
import hw.service.TestService;
@Service
public class TestServiceImpl implements TestService {
	private TestMapper testMapper;
	
	@Autowired
	public TestServiceImpl(TestMapper testMapper) {
		this.testMapper = testMapper;
	}


	@Override
	public List<Test> finAll() {
		
		return testMapper.finAll();
	}

}
