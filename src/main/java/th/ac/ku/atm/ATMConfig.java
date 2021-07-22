package th.ac.ku.atm;

import org.springframework.context.annotation.Bean;
import th.ac.ku.atm.ATM;
import th.ac.ku.atm.AtmUI;

public class ATMConfig {
    @Bean
    public DataSource dataSource(){
        return new DataSourceFile("customers.txt");
    }

    @Bean
    public Bank bank(){
        return new Bank("Ku Bank", dataSource());
    }

    @Bean
    public ATM atm(){
        return new ATM(bank());
    }

    @Bean
    public AtmUI atmUI(){
        return new AtmUI(atm());
    }
}
