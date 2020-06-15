package cl.icap.cursofullstack.developerweed.service;

import java.util.List;

import cl.icap.cursofullstack.developerweed.model.dto.AA_Tipo_De_ContainerDTO;

public interface AA_Tipo_De_ContainerService {
	
	public List<AA_Tipo_De_ContainerDTO> list();
	public AA_Tipo_De_ContainerDTO get(String id_agente);
	public int insert(AA_Tipo_De_ContainerDTO aa_tipo_de_containerDTO);
	public int update(AA_Tipo_De_ContainerDTO aa_tipo_de_containerDTO);
	public int delete(String id_agente);

}
