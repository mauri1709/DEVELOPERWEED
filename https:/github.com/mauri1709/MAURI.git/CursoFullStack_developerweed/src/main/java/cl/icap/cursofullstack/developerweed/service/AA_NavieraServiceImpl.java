package cl.icap.cursofullstack.developerweed.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.icap.cursofullstack.developerweed.model.dao.AA_NavieraDAO;
import cl.icap.cursofullstack.developerweed.model.dto.AA_NavieraDTO;

@Service
public class AA_NavieraServiceImpl implements AA_NavieraService{
	@Autowired
	AA_NavieraDAO aa_navieraDAO;

	@Override
	public List<AA_NavieraDTO> list() {
		return aa_navieraDAO.list()
				;
	}

	@Override
	public AA_NavieraDTO get(String id_naviera) {
		return aa_navieraDAO.get(id_naviera);
	}

	@Override
	public int insert(AA_NavieraDTO aa_navieraDTO) {
		return aa_navieraDAO.insert(aa_navieraDTO);
	}

	@Override
	public int update(AA_NavieraDTO aa_navieraDTO) {
		return aa_navieraDAO.update(aa_navieraDTO);
	}

	@Override
	public int delete(String id_naviera) {
		return aa_navieraDAO.delete(id_naviera);
	}

}
