package bj.formation.sigrhp.training;

import bj.formation.sigrhp.training.proxy.CardProxy;
import bj.formation.sigrhp.training.proxy.DepositAccount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingApplication.class, args);
		DepositAccount account = new DepositAccount();
		account.setBalance(9087.0);
		CardProxy cardProxy = new CardProxy(account);
		cardProxy.buy(239);
		cardProxy.provisioning(90);
		cardProxy.buy(2345);
		System.out.println(cardProxy.getBalance());
	}

}
