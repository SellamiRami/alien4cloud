package alien4cloud.webconfiguration;

import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CacheConfiguration {

    @Bean
    public FilterRegistrationBean cacheFilterRegistration(ServletRegistrationBean dispatcherRegistration) {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new CacheFilter());
        registrationBean.addUrlPatterns("/img/*");
        return registrationBean;
    }
}