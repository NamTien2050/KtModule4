package kt.m4.repository;

import kt.m4.model.ThanhPho;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IThanhPhoRepo extends PagingAndSortingRepository<ThanhPho, Long> {
}
