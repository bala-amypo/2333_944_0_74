package com.example.demo.newservice.newserviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.newentity.NewfileEntity;
import com.example.demo.newrepository.NewfileRepo;
import com.example.demo.newservice.NewfileService;

@Service
public class NewfileServiceImpl implements NewfileService {

    private final NewfileRepo rep;

    // Constructor Injection
    public NewfileServiceImpl(NewfileRepo rep) {
        this.rep = rep;
    }

    @Override
    public NewfileEntity savedata(NewfileEntity newfile) {
        return rep.save(newfile);
    }





    @Override
    public NewfileEntity getidval(Long id) {
        return rep
    }

    @Override
    public List<NewfileEntity> getall() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getall'");
    }

    @Override
    public NewfileEntity update(Long id, NewfileEntity newfile) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    @Override
public void delete(Long id) {
    
}

}
