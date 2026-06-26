package sn.l2gl.warriors.daara;

import org.hibernate.Session;
import sn.l2gl.warriors.daara.util.HibernateUtil;

public class AppTest {
    public static void main(String[] args) {
        System.out.println("Test de connexion Hibernate...");
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            System.out.println("✅ Connexion réussie !");
        } catch (Exception e) {
            System.out.println("❌ Erreur : " + e.getMessage());
        } finally {
            HibernateUtil.fermer();
        }
    }
}