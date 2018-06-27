package kejn.solteq.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({MvcConfig.class, ThymeleafConfig.class})
public class WebAppConfig {
}
