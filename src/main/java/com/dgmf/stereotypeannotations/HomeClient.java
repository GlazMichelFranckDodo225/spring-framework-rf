package com.dgmf.stereotypeannotations;

import com.dgmf.stereotypeannotations.config.AppConfig;
import com.dgmf.stereotypeannotations.controller.HomeController;
import com.dgmf.stereotypeannotations.repository.HomeRepository;
import com.dgmf.stereotypeannotations.service.HomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HomeClient {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HomeController homeController = applicationContext
                .getBean(HomeController.class);
        System.out.println(homeController.hello());

        HomeService homeService = applicationContext
                .getBean(HomeService.class);
        System.out.println(homeService.hello());

        HomeRepository homeRepository = applicationContext
                .getBean(HomeRepository.class);
        System.out.println(homeRepository.hello());
    }
}
