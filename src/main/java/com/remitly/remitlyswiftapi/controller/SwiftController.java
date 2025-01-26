package com.remitly.remitlyswiftapi.controller;


import com.remitly.remitlyswiftapi.model.Swift;
import com.remitly.remitlyswiftapi.service.SwiftService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(path = "/v1/swift-codes")
public class SwiftController {

    private final SwiftService service;

    public SwiftController(SwiftService service) {
        this.service = service;
    }

    @GetMapping("/{swiftCode}")
    public ResponseEntity<Object> getSwiftCodeByCode(@PathVariable String swiftCode) {
        Optional<Swift> swift = service.getBySwiftCode(swiftCode);
        if (swift.isEmpty()) {
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("error", "Swift code not found: " + swiftCode);
            return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(swift, HttpStatus.OK);
    }

}
