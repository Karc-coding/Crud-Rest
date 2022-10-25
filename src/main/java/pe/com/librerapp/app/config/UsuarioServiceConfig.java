package pe.com.librerapp.app.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import pe.com.librerapp.app.service.IMethodFlagService;
import pe.com.librerapp.app.service.impl.NewUsuarioServiceImpl;
import pe.com.librerapp.app.service.impl.UsuarioServiceImpl;

@Configuration
public class UsuarioServiceConfig {

    @Bean
    @Primary
    @ConditionalOnProperty(
            name = "feature-flags.is-new-user-service-enabled",
            havingValue = "false",
            matchIfMissing = true
    )
    public IMethodFlagService userDefaultService() {
        return new UsuarioServiceImpl();
    }

    @Bean
    @Primary
    @ConditionalOnProperty(
            name = "feature-flags.is-new-user-service-enabled",
            havingValue = "true"
    )
    public IMethodFlagService usernewService() {
        return new NewUsuarioServiceImpl();
    }


}
