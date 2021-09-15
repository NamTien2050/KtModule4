package kt.m4.service;

import kt.m4.model.QuocGia;
import kt.m4.repository.IQuocGiaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuocGiaService implements IQuocGiaService {
    @Autowired
    IQuocGiaRepo iQuocGiaRepo;

    @Override
    public List<QuocGia> findAll() {
        return (List<QuocGia>) iQuocGiaRepo.findAll();
    }

    @Override
    public Optional<QuocGia> findById(long id) {
        return iQuocGiaRepo.findById(id);
    }
}
