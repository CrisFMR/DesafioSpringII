package cl.praxis.HospitalPostPandemia.model.service;

import cl.praxis.HospitalPostPandemia.model.dto.Paciente;

import java.util.List;

public interface PacienteService {
    List<Paciente> findAll();
    Paciente findOne(int id);
    boolean create(Paciente b);
    boolean update(Paciente b);
    boolean delete(int id);
}
