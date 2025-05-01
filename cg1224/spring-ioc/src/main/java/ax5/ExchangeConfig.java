package ax5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExchangeConfig {
	
	// <bean id="xe" class="ax5.ExchangeService" />

	@Bean("xe")
	public ExchangeService get() {
		System.out.println("ExchangeService object requested");
		return new ExchangeService();
	}
}
