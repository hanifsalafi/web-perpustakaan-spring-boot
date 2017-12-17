package com.mycompany.data;

import com.mycompany.repository.BukuRepository;
import com.mycompany.service.BukuService;
import com.mycompany.model.Buku;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.Iterator;
import java.util.List;

@Service
public class BukuDao implements BukuService {

    private EntityManagerFactory entityMF;

    @Autowired
    public void setE(EntityManagerFactory emf){
        this.entityMF = emf;
    }

    @Override
    public List<Buku> listBuku() {
        EntityManager em = entityMF.createEntityManager();
        return em.createQuery("from Buku", Buku.class).getResultList();
    }

    @Override
    public Buku simpanBuku(Buku buku) {
        EntityManager em = entityMF.createEntityManager();
        em.getTransaction().begin();
        Buku saved = em.merge(buku);
        em.getTransaction().commit();
        return saved;
    }

    @Override
    public Buku getIdBuku(Integer id_buku) {
        EntityManager em = entityMF.createEntityManager();
        return em.find(Buku.class,id_buku);
    }

    @Override
    public void deleteBuku(Integer id_buku) {
        EntityManager em = entityMF.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.find(Buku.class,id_buku));
        em.getTransaction().commit();
    }

}
