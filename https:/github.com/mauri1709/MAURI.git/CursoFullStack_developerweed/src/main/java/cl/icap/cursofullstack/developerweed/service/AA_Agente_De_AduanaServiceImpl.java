package cl.icap.cursofullstack.developerweed.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.icap.cursofullstack.developerweed.model.dao.AA_Agente_De_AduanaDAO;
import cl.icap.cursofullstack.developerweed.model.dto.AA_Agente_De_AduanaDTO;

@Service
public class AA_Agente_De_AduanaServiceImpl implements AA_Agente_De_AduanaService{
	@Autowired
	AA_Agente_De_AduanaDAO aa_agente_de_aduanaDAO;
	@Override
	public List<AA_Agente_De_AduanaDTO>list(){
		return aa_agente_de_aduanaDAO.list();
	}
	@Override
	public AA_Agente_De_AduanaDTO get(String id_agente) {
		return aa_agente_de_aduanaDAO.get(id_agente);
	}
	@Override
	public int delete(String id_agente) {
		return aa_agente_de_aduanaDAO.delete(id_agente);	
	}
	@Override
	public int insert(AA_Agente_De_AduanaDTO aa_agente_de_aduanaDTO) {
		return aa_agente_de_aduanaDAO.insert(aa_agente_de_aduanaDTO);
		
	} 
	@Override
	public int update(AA_Agente_De_AduanaDTO aa_agente_de_aduanaDTO) {
		return aa_agente_de_aduanaDAO.update(aa_agente_de_aduanaDTO);
	}
}
