package com.mycompany.data;

import com.mycompany.model.Anggota;
import com.mycompany.repository.AnggotaRepository;
import com.mycompany.service.AnggotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;


@Service
public class AnggotaDao implements AnggotaService {

    private EntityManagerFactory emf;
    private AnggotaRepository anggotaRepository;

    @Autowired
    public void setEmf(EntityManagerFactory emf){
        this.emf = emf;
    }

    @Autowired
    public void setAnggotaRepository(AnggotaRepository anggotaRepository){
        this.anggotaRepository = anggotaRepository;
    }

    @Override
    public List<Anggota> listAnggota() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("from Anggota", Anggota.class).getResultList();
    }

    @Override
    public Anggota saveAnggota(Anggota anggota) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Anggota saved = em.merge(anggota);
        em.getTransaction().commit();
        return saved;
    }

    @Override
    public Anggota getIdAnggota(Integer id) {
        EntityManager em = emf.createEntityManager();
        return  em.find(Anggota.class,id);
    }

    @Override
    public void deleteAnggota(Integer id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.find(Anggota.class,id));
        em.getTransaction().commit();
    }

    @Override
    public Iterable<Anggota> listAnggotabyId(Integer id) {
        return anggotaRepository.findById(id);
    }


}
