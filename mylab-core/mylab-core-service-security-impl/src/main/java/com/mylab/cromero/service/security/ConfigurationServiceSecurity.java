package com.mylab.cromero.service.security;

import com.mylab.cromero.repository.config.ConfigurationRepository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by cristianromeromatesanz on 11/10/15.
 */

@Configuration
@Import(ConfigurationRepository.class)
@ComponentScan({"com.mylab.cromero.service.security"})
public class ConfigurationServiceSecurity {
}
