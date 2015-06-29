package org.hotsix.mento;

import java.util.List;

import org.hotsix.page.Criteria;
import org.hotsix.page.PageMaker;

public interface MentoService {
	
	public List<MentoVO> listMento(Criteria cri)throws Exception;
	
	public PageMaker totalCount(Criteria cri)throws Exception;
	
	public void registMento(MentoVO mvo)throws Exception;

}
