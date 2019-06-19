/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kiwong.kiwong.DaoImpl;

import com.kiwong.kiwong.Dao.orangdao;
import com.kiwong.kiwong.Model.orangmodel;
import com.kiwong.kiwong.Repository.orangrepository;
import com.kiwong.kiwong.error.errorException;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author kiwong
 */
public class orangdaoimpl extends BaseImpl implements orangdao{
    
    
    @Autowired
    private orangrepository orangrepository;

   

    @Override
    public List<orangmodel> getList() throws errorException {
        
        
        
        
      /*  CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<orangmodel> query = cb.createQuery(orangmodel.class);
        Root<orangmodel> root = query.from(orangmodel.class);
        query.select(root);
        
        TypedQuery <orangmodel> tq = em.createQuery(query);
        
        return tq.getResultList();
        */
      
      
         Query query = em.createNativeQuery(  "select * from kiwong.orang where username =:username and password=:password", orangmodel.class);
         query.setParameter("username", "a");
         query.setParameter("password", "abc");
   //String val = (String) query.getSingleResult();
        return query.getResultList();
    }
    
    
    

    
}
