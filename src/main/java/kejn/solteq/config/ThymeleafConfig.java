package kejn.solteq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

@Configuration
class ThymeleafConfig {
    private static final String prefix = "/webapp/WEB-INF/templates/";
    private static final String suffix = ".html";
    private static final String templateMode = "HTML5";
    private static final String characterEncoding = "UTF-8";
    private static final boolean cacheable = false;
    private static final boolean cache = false;

    @Bean
    public ViewResolver viewResolver() {
        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
        resolver.setTemplateEngine(templateEngine());
        resolver.setCache(cache);
        resolver.setCharacterEncoding(characterEncoding);
        return resolver;
    }

    @Bean
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine engine = new SpringTemplateEngine();
        engine.setTemplateResolver(templateResolver());
        return engine;
    }

    @Bean
    public ClassLoaderTemplateResolver templateResolver() {
        ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
        resolver.setPrefix(prefix);
        resolver.setSuffix(suffix);
        resolver.setTemplateMode(templateMode);
        resolver.setCharacterEncoding(characterEncoding);
        resolver.setCacheable(cacheable);
        return resolver;
    }

}

