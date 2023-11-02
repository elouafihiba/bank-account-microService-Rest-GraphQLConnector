package org.iir.bankaccountservice.repositories;

import org.iir.bankaccountservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

public interface CustomerRepository extends JpaRepository<Customer,Long>{

}
