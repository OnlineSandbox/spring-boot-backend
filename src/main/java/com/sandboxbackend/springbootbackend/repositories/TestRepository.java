package com.sandboxbackend.springbootbackend.repositories;

import com.sandboxbackend.springbootbackend.baseclasses.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TestRepository extends JpaRepository<Test, UUID> {}
