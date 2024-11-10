package many_to_one_uni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PrintPlayerNamebyPlayerId {
	public static void main(String[] args) {
		EntityManager em=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction et= em.getTransaction();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Player Id");
		int pId=sc.nextInt();
		Player p=em.find(Player.class, pId);
		if(p==null) {
			System.out.println("Invalid Player id");
		}
		
		Query q =em.createQuery("from Player");
		List<Player> p1= q.getResultList();
		for(Player t:p1)
		{
			if(p.getTeam().getId()==t.getId())
			System.out.println(p.getName());
		}
	}
}
