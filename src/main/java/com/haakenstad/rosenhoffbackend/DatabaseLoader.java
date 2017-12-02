package com.haakenstad.rosenhoffbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepo repo;

    @Autowired
    public DatabaseLoader(EmployeeRepo repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... strings) throws Exception {
        repo.save(new Employee("per","Spellmann","tøysebukk"));
    }
}
