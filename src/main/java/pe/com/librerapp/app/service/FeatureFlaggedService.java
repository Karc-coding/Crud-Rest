package pe.com.librerapp.app.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pe.com.librerapp.app.domain.Usuario;
import pe.com.librerapp.app.flag.FeatureFlagService;
import pe.com.librerapp.app.service.impl.NewUsuarioServiceImpl;
import pe.com.librerapp.app.service.impl.UsuarioServiceImpl;

import java.util.List;

@Primary
public class FeatureFlaggedService implements IMethodFlagService {

    private final FeatureFlagService featureFlagService;
    private final NewUsuarioServiceImpl newUsuarioService;
    private final UsuarioServiceImpl usuarioService;

    public FeatureFlaggedService(FeatureFlagService featureFlagService, NewUsuarioServiceImpl newUsuarioService, UsuarioServiceImpl usuarioService) {
        this.featureFlagService = featureFlagService;
        this.newUsuarioService = newUsuarioService;
        this.usuarioService = usuarioService;
    }

    @Override
    public List<Usuario> listUser() {
        if (featureFlagService.isNewServiceEnabled()) {
            return newUsuarioService.listUser();
        } else {
            return usuarioService.listUser();
        }
    }
}
