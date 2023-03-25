package com.axity.arquetipo.service.util;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import com.github.dozermapper.spring.DozerBeanMapperFactoryBean;

/**
 * @author guillermo.segura@axity.com
 */
@Configuration
@Component
public class DozerConfig
{
  @Bean
  public DozerBeanMapperFactoryBean dozerBeanMapperFactoryBean( @Value("classpath*:mappings/*mappings.xml")
  Resource[] resources ) throws IOException 
  {
    final var dozerBeanMapperFactoryBean = new DozerBeanMapperFactoryBean();
    dozerBeanMapperFactoryBean.setMappingFiles( resources );
    return dozerBeanMapperFactoryBean;
  }
}
