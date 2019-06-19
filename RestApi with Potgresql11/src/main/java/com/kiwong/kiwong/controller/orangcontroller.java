/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kiwong.kiwong.controller;

import com.kiwong.kiwong.Dao.orangdao;
import com.kiwong.kiwong.Model.orangmodel;
import com.kiwong.kiwong.dto.CommonResponse;
import com.kiwong.kiwong.dto.orangdto;
import com.kiwong.kiwong.error.errorException;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kiwong
 */

@RestController
@RequestMapping("/orang")
@SuppressWarnings("rawtypes")
public class orangcontroller {
    
    
    private static final Logger LOGGER = LoggerFactory.getLogger(orangcontroller.class);
    
    @Autowired
    private orangdao orangdao;
    
    @Autowired
	private ModelMapper modelmapper; 
    
    @GetMapping(value="/getlist")
    public CommonResponse getlist(@RequestParam(name="orang", defaultValue="")String orang) throws errorException{
        try {
        LOGGER.info("orang get list, param : {}", orang);
        
        List<orangmodel> list = orangdao.getList();
			return new CommonResponse<List<orangdto>>(list.stream().map(cust -> modelmapper.map(cust, orangdto.class)).collect(Collectors.toList()));
        } catch (errorException e) {
			throw e;
		} catch(NumberFormatException e) {
			return new CommonResponse("01", e.getMessage());
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			return new CommonResponse("06", e.getMessage());
		}
    }
            
    
}
