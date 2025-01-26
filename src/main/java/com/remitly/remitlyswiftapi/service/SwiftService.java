package com.remitly.remitlyswiftapi.service;

import com.remitly.remitlyswiftapi.model.Swift;
import com.remitly.remitlyswiftapi.repository.SwiftRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SwiftService {
    private final SwiftRepository repository;

    public SwiftService(SwiftRepository repository) {
        this.repository = repository;
    }

    public Optional<Swift> getBySwiftCode(String swiftCode) {
        return repository.findBySwiftCode(swiftCode);
    }
}
