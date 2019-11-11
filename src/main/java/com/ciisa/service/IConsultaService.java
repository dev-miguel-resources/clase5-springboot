package com.ciisa.service;

import com.ciisa.dto.ConsultaListaExamenDTO;
import com.ciisa.model.Consulta;

public interface IConsultaService extends ICRUD<Consulta>{

	Consulta registrarTransaccional(ConsultaListaExamenDTO dto);
}
