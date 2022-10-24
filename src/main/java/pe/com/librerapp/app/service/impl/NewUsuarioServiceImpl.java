package pe.com.librerapp.app.service.impl;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.librerapp.app.domain.Usuario;
import pe.com.librerapp.app.repository.IRepositoryUser;
import pe.com.librerapp.app.service.IMethodFlagService;

import java.util.List;

@Log4j2
@Service
public class NewUsuarioServiceImpl implements IMethodFlagService {

    @Autowired
    public IRepositoryUser repo;

    @Override
    public List<Usuario> listUser() {
        log.info("------------------------------");
        log.info("Este es el metodo listar nuevo");
        log.info("------------------------------");
        return repo.findAll();
    }
}
