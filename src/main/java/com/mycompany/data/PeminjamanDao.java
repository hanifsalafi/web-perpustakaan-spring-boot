package com.mycompany.data;

import com.mycompany.model.Peminjaman;
import com.mycompany.service.PeminjamanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

@Service
public class PeminjamanDao implements PeminjamanService {
    private EntityManagerFactory eMF;

    @Autowired
    public void setE(EntityManagerFactory emf){
        this.eMF = emf;
    }

    @Override
    public List<Peminjaman> listPeminjaman() {
        EntityManager em = eMF.createEntityManager();
        return em.createQuery("from Peminjaman", Peminjaman.class).getResultList();
    }

    @Override
    public Peminjaman savePeminjaman(Peminjaman peminjaman) {
        EntityManager em = eMF.createEntityManager();
        em.getTransaction().begin();
        Peminjaman saved = em.merge(peminjaman);
        em.getTransaction().commit();
        return saved;
    }

    @Override
    public Peminjaman getIdPeminjaman(Integer id_pinjam) {
        EntityManager em = eMF.createEntityManager();
        return em.find(Peminjaman.class,id_pinjam);
    }

    @Override
    public void deletePeminjaman(Integer id_pinjam) {
        EntityManager emf = eMF.createEntityManager();
        emf.getTransaction().begin();
        emf.remove(emf.find(Peminjaman.class,id_pinjam));
        emf.getTransaction().commit();
    }

    

}
