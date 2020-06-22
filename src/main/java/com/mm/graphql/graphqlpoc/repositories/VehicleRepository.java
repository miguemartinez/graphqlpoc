package com.mm.graphql.graphqlpoc.repositories;


import com.mm.graphql.graphqlpoc.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
