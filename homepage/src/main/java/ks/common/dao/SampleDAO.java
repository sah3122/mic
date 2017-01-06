package ks.common.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository("sampleDAO")
public class SampleDAO extends AbstractDAO{

	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("sampledao");
		return (List<Map<String, Object>>)selectList("sample.selectBoardList", map);
	}

}
