package cl.icap.cursofullstack.developerweed.model.dao;

import java.util.List;

import cl.icap.cursofullstack.developerweed.model.dto.AA_Tipo_De_TransporteDTO;

public interface AA_Tipo_De_TransporteDAO {
	
	public List<AA_Tipo_De_TransporteDTO> list();
	public AA_Tipo_De_TransporteDTO get(String id_transporte);
	public int insert(AA_Tipo_De_TransporteDTO aa_tipo_de_transporteDTO);
	public int update(AA_Tipo_De_TransporteDTO aa_tipo_de_transporteDTO);
	public int delete(String id_transporte);

}
