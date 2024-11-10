package many_to_one_uni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletePlayerByTeamId {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EntityManager em=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction et =em.getTransaction();
	}
}
