package com.devSuperior.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSuperior.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
