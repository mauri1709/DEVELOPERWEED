package cl.icap.cursofullstack.developerweed.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.icap.cursofullstack.developerweed.model.dao.AA_DocumentosDAO;
import cl.icap.cursofullstack.developerweed.model.dto.AA_DocumentosDTO;

@Service
public class AA_DocumentosServiceImpl implements AA_DocumentosService{

	@Autowired
	AA_DocumentosDAO aa_documentosDAO;

	@Override
	public List<AA_DocumentosDTO> list() {
		return aa_documentosDAO.list();
	}

	@Override
	public AA_DocumentosDTO get(String id_doc) {
		return aa_documentosDAO.get(id_doc);
	}

	@Override
	public int insert(AA_DocumentosDTO aa_documentosDTO) {
		return aa_documentosDAO.insert(aa_documentosDTO);
	}

	@Override
	public int update(AA_DocumentosDTO aa_documentosDTO) {
		return aa_documentosDAO.update(aa_documentosDTO);
	}

	@Override
	public int delete(String id_doc) {
		return aa_documentosDAO.delete(id_doc);
	}
}
