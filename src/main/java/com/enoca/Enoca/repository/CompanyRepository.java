package com.enoca.Enoca.repository;

import com.enoca.Enoca.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyRepository extends JpaRepository<Company,Long>
{

}