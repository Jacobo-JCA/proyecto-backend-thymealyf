package com.proyectoFinal.sistema.bibliotecario.servicio;

import com.proyectoFinal.sistema.bibliotecario.entity.Afiliado;
import com.proyectoFinal.sistema.bibliotecario.interfazService.ILibroService;
import com.proyectoFinal.sistema.bibliotecario.repository.IAfiliadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AfiliadoService implements ILibroService<Afiliado> {

    @Autowired
    private IAfiliadoRepository afiliadoRepository;

    @Override
    public List<Afiliado> listarLibros() {
        return (List<Afiliado>)afiliadoRepository.findAll();
    }

    @Override
    public Optional<Afiliado> editarId(int id) {
        return afiliadoRepository.findById(id);
    }

    @Override
    public int save(Afiliado afiliado) {
        int respuesta = 0;
        Afiliado afiliado1 = afiliadoRepository.save(afiliado);
        if (!afiliado1.equals(null)) {
            respuesta = 1;
        }
        return respuesta;
    }

    @Override
    public void delete(int id) {
        afiliadoRepository.deleteById(id);
    }
}
