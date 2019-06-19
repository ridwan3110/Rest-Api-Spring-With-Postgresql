/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kiwong.kiwong.Repository;

import com.kiwong.kiwong.Model.orangmodel;
import org.springframework.data.repository.PagingAndSortingRepository;


/**
 *
 * @author kiwong
 */
public interface orangrepository extends PagingAndSortingRepository<orangmodel, Integer>{

   
    
}
