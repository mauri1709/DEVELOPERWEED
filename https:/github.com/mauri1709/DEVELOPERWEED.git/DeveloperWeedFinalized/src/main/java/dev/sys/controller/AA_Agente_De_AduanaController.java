package dev.sys.controller;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import dev.sys.model.dto.AA_Agente_De_AduanaDTO;
import dev.sys.service.AA_Agente_De_AduanaService;

@Controller
@RequestMapping(value="/AgenteAduana")
public class AA_Agente_De_AduanaController {
	@Autowired
	AA_Agente_De_AduanaService aa_agente_de_aduanaservice;
	@RequestMapping(value="/jist")
	public @ResponseBody List<AA_Agente_De_AduanaDTO> ajaxList(HttpServletRequest req, HttpServletResponse res) {
		List<AA_Agente_De_AduanaDTO> list = aa_agente_de_aduanaservice.list();
		return list;
	}
	@RequestMapping(value="/get")
	public @ResponseBody AA_Agente_De_AduanaDTO ajaxGet(HttpServletRequest req, HttpServletResponse res) {
		AA_Agente_De_AduanaDTO job = aa_agente_de_aduanaservice.get(req.getParameter("id_agente"));
		return job;
	}
	@RequestMapping(value="/delete")
	public @ResponseBody int ajaxDelete(HttpServletRequest req, HttpServletResponse res) {
		int rows = aa_agente_de_aduanaservice.delete(req.getParameter("id_agente"));
		return rows;
	}
	@RequestMapping(value="/insert")
	public @ResponseBody int ajaxInsert(HttpServletRequest req, HttpServletResponse res) {
		int rows=0;
		try {
			String requestData = req.getReader().lines().collect(Collectors.joining());
			AA_Agente_De_AduanaDTO job = new Gson().fromJson(requestData, AA_Agente_De_AduanaDTO.class);
			rows = aa_agente_de_aduanaservice.insert(job);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		return rows;
	}
	@RequestMapping(value="/update")
	public @ResponseBody int ajaxUpdate(HttpServletRequest req, HttpServletResponse res) {
		int rows=0;
		try {
			String requestData = req.getReader().lines().collect(Collectors.joining());
			AA_Agente_De_AduanaDTO agente = new Gson().fromJson(requestData, AA_Agente_De_AduanaDTO.class);
			rows = aa_agente_de_aduanaservice.update(agente);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		return rows;
	}
	
}
