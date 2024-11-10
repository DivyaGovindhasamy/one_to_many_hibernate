package many_to_one_uni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AddPlayerForExistingTeam {
	public static void main(String[] args) {
		EntityManager em= Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Team id");
		int tId =sc.nextInt();
		Team team = em.find(Team.class, tId);
		if(team==null) {
			System.err.println("Invalid Team Id");
			return;
		}
		System.out.println("Enter Player Name");
		String name=sc.next();
		System.out.println("Enter Jersey No");
		int jerseyNo=sc.nextInt();
		
		Player p=new Player(0,name,jerseyNo,team);
		et.begin();
		em.persist(p);
		et.commit();
		System.out.println("Done");
}
}
