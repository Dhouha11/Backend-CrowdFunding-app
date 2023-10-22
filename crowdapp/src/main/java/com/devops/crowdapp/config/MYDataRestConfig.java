package com.devops.crowdapp.config;

import com.devops.crowdapp.entity.Project;
import com.devops.crowdapp.entity.ProjectCategory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class MYDataRestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config, cors);

        HttpMethod[] theUnsuppotedActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};

        // disable Http methods for PUT, POST, DELETE
        config.getExposureConfiguration()
                .forDomainType(Project.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsuppotedActions))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsuppotedActions));


        // disable Http methods for PUT, POST, DELETE
        config.getExposureConfiguration()
                .forDomainType(ProjectCategory.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsuppotedActions))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsuppotedActions));


    }




}
