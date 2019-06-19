/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kiwong.kiwong.Dao;

import com.kiwong.kiwong.Model.orangmodel;
import com.kiwong.kiwong.error.errorException;
import java.util.List;

/**
 *
 * @author kiwong
 */
public interface orangdao {
    
    
    List<orangmodel> getList() throws errorException;
    
    
    
}
