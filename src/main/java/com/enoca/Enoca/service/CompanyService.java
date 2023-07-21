package com.enoca.Enoca.service;

import com.enoca.Enoca.entity.Company;
import com.enoca.Enoca.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService
{
    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }
    // Şirket Ekleme
    public Company addCompany(Company company) {
        return companyRepository.save(company);
    }

    // Şirket Güncelleme
    public Company updateCompany(Long companyId, Company updatedCompany) {
        Company company = companyRepository.findById(companyId)
                .orElseThrow(() -> new IllegalArgumentException("Şirket bulunamadı: " + companyId));

        company.setName(updatedCompany.getName());


        return companyRepository.save(company);
    }

    // Şirket Silme
    public void deleteCompany(Long companyId) {
        companyRepository.deleteById(companyId);
    }

    // Tüm Şirketleri Listeleme
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

}
