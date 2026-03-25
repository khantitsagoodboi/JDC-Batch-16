package com.jdc.akk.test.synchronizecallbacklistener;

import org.junit.jupiter.api.Test;

import com.jdc.akk.entity.Transfer;
import com.jdc.akk.test.JpaFactory;

public class A_SynchronizationTest extends JpaFactory {
	@Test
	void test() throws InterruptedException {
		var ope1 = operationOne(5000);
		var ope2 = operationTwo(5000);
		
		ope1.start();
		ope2.start();
		
		Thread.sleep(1500);
	}
	
	private Thread operationOne(int i) {
		return new Thread(
				() -> {
					var em = emf.createEntityManager();
					var transfer = em.find(Transfer.class, 1);
					em.getTransaction().begin();
					System.out.println("=============== First Operation Start ===============");
					System.out.println("=============== Before First Operation Balance : "+ transfer + " ===============");
					try {
						Thread.sleep(900);	
						em.refresh(transfer);
						transfer.setBalance(transfer.getBalance() - i);
						em.flush();
						System.out.println("=============== After First Operation Balance : " + transfer +" ===============");
						em.getTransaction().commit();
					} catch (Exception e) {
						e.printStackTrace();
					}
				});
	}

	private Thread operationTwo(int i) {
		return new Thread(
				() -> {
					var em = emf.createEntityManager();
					var transfer = em.find(Transfer.class, 1);
					em.getTransaction().begin();
					System.out.println("=============== Second Operation Start ===============");
					System.out.println("=============== Before Second Operation Balance" + transfer +" ===============");
					try {
						Thread.sleep(700);		
						em.refresh(transfer);
						transfer.setBalance(transfer.getBalance() + i);
						em.flush();
						System.out.println("=============== After Second Operation Balance"+ transfer +" ===============");
						em.getTransaction().commit();
					} catch (Exception e) {
						e.printStackTrace();
					}
				});
	}
}
