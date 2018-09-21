package com.example.demo.service;

import com.example.demo.domain.Girl;
import com.example.demo.enums.ResultEnum;
import com.example.demo.exception.GirlException;
import com.example.demo.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(16);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("BBBBB");
        girlB.setAge(19);
        girlRepository.save(girlB);

    }

    public void getAge(Integer id) throws Exception{
       Girl girl =  girlRepository.findOne(id);
       Integer age = girl.getAge();
       if(age < 10){
           //返回你还在上小学
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
       }else if(age > 10 && age < 16){
           //返回你可能在上初中
           throw new GirlException(ResultEnum.MIDDLE_SCHOOL);

       }
    }
}
