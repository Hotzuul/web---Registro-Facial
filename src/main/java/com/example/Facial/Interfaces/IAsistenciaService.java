package com.example.Facial.Interfaces;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

import com.example.Facial.Clases.Asistencia;
public interface IAsistenciaService {
    public List<Asistencia> Listar();
    public Optional<Asistencia> ConsultarId(int id);
    public void Guardar(Asistencia depar);
    public void Eliminar(int id);
    public List<Asistencia> buscarPorFecha(Date fechaInicio, Date fechaFin);
}
