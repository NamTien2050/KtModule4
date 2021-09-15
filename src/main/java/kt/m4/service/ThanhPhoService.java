package kt.m4.service;

import kt.m4.model.ThanhPho;
import kt.m4.repository.IThanhPhoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThanhPhoService implements IThanhPhoService {
    @Autowired
    IThanhPhoRepo iThanhPhoRepo;

    @Override
    public List<ThanhPho> findAll() {
        return (List<ThanhPho>) iThanhPhoRepo.findAll();
    }

    @Override
    public ThanhPho finById(long id) {
        return iThanhPhoRepo.findById(id).get();
    }

    @Override
    public ThanhPho save(ThanhPho thanhPho) {
        return iThanhPhoRepo.save(thanhPho);
    }

    @Override
    public void remove(ThanhPho thanhPho) {
        iThanhPhoRepo.delete(thanhPho);
    }
}
