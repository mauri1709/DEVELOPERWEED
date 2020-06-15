package cl.icap.cursofullstack.developerweed.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.icap.cursofullstack.developerweed.model.dao.AA_RegionDAO;
import cl.icap.cursofullstack.developerweed.model.dto.AA_RegionDTO;

@Service
public class AA_RegionServiceImpl implements AA_RegionService{

	@Autowired
	AA_RegionDAO aa_regionDAO;

	@Override
	public List<AA_RegionDTO> list() {
		return aa_regionDAO.list();
	}

	@Override
	public AA_RegionDTO get(String id_region) {
		return aa_regionDAO.get(id_region);
	}

	@Override
	public int insert(AA_RegionDTO aa_regionDTO) {
		return aa_regionDAO.insert(aa_regionDTO);
	}

	@Override
	public int update(AA_RegionDTO aa_regionDTO) {
		return aa_regionDAO.update(aa_regionDTO);
	}

	@Override
	public int delete(String id_region) {
		return aa_regionDAO.delete(id_region);
	}
}
