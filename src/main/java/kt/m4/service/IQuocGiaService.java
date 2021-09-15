package kt.m4.service;

import kt.m4.model.QuocGia;

import java.util.List;
import java.util.Optional;

public interface IQuocGiaService {
    List<QuocGia> findAll();

    Optional<QuocGia> findById(long id);
}
