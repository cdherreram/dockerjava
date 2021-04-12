package home.cdherreram.docker.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import home.cdherreram.docker.example.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String>{

}
