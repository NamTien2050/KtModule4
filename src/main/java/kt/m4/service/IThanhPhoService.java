package kt.m4.service;

import kt.m4.model.ThanhPho;

import java.util.List;

public interface IThanhPhoService {
    public List<ThanhPho> findAll();

    public ThanhPho finById(long id);

    public ThanhPho save(ThanhPho thanhPho);

    public void remove(ThanhPho thanhPho);
}
