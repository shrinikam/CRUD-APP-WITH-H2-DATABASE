package repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import antlr.collections.List;
import entities.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    
    List findByName(String name);
    
}