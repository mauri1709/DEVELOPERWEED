package cl.icap.cursofullstack.developerweed.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.icap.cursofullstack.developerweed.model.dao.AA_Tipo_De_CargaDAO;
import cl.icap.cursofullstack.developerweed.model.dto.AA_Tipo_De_CargaDTO;

@Service
public class AA_Tipo_De_CargaServiceImpl implements AA_Tipo_De_CargaService{
	@Autowired
	AA_Tipo_De_CargaDAO aa_tipo_de_carga;

	@Override
	public List<AA_Tipo_De_CargaDTO> list() {
		return aa_tipo_de_carga.list();
	}

	@Override
	public AA_Tipo_De_CargaDTO get(String id_agente) {
		return aa_tipo_de_carga.get(id_agente);
	}

	@Override
	public int insert(AA_Tipo_De_CargaDTO aa_tipo_de_cargaDTO) {
		return aa_tipo_de_carga.insert(aa_tipo_de_cargaDTO);
	}

	@Override
	public int update(AA_Tipo_De_CargaDTO aa_tipo_de_cargaDTO) {
		return aa_tipo_de_carga.update(aa_tipo_de_cargaDTO);
	}

	@Override
	public int delete(String id_agente) {
		return aa_tipo_de_carga.delete(id_agente);
	}

}
