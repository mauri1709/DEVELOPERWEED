package cl.icap.cursofullstack.developerweed.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.icap.cursofullstack.developerweed.model.dao.AA_Tipo_De_ProveedorDAO;
import cl.icap.cursofullstack.developerweed.model.dto.AA_Tipo_De_ProveedorDTO;

@Service
public class AA_Tipo_De_ProveedorServiceImpl implements AA_Tipo_De_ProveedorService{
	@Autowired
	AA_Tipo_De_ProveedorDAO aa_tipo_de_ProveedorDAO;

	@Override
	public List<AA_Tipo_De_ProveedorDTO> list() {
		return aa_tipo_de_ProveedorDAO.list();
	}

	@Override
	public AA_Tipo_De_ProveedorDTO get(String id_tproveedor) {
		return aa_tipo_de_ProveedorDAO.get(id_tproveedor);
	}

	@Override
	public int insert(AA_Tipo_De_ProveedorDTO aa_tipo_de_proveedorDTO) {
		return aa_tipo_de_ProveedorDAO.insert(aa_tipo_de_proveedorDTO);
	}

	@Override
	public int update(AA_Tipo_De_ProveedorDTO aa_tipo_de_proveedorDTO) {
		return aa_tipo_de_ProveedorDAO.update(aa_tipo_de_proveedorDTO);
	}

	@Override
	public int delete(String AA_Tipo_De_ProveedorDTO) {
		return aa_tipo_de_ProveedorDAO.delete(AA_Tipo_De_ProveedorDTO);
	}

}
