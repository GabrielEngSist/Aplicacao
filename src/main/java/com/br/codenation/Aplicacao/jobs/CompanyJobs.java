package com.br.codenation.Aplicacao.jobs;

import com.br.codenation.Aplicacao.services.CompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CompanyJobs {

    private Logger logger = LoggerFactory.getLogger(CompanyJobs.class);

    @Autowired
    CompanyService _companyService;

    @Scheduled(fixedRate = 10000)
    public void countCompanys(){
        logger.info("#### START VERIFY COUNT COMPANIES");
        Long count = _companyService.countCompanies();
        logger.info("#### FOUND {} COMPANIES", count);
        logger.info("#### END VERIFY COUNT COMPANIES");
    }

}
