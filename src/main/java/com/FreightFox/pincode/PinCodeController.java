package com.FreightFox.pincode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pincode")
public class PinCodeController {

    @Autowired
    private PinCodeRepository pinCodeRepository;

    @GetMapping
    public List<PinCode> getAllPinCodes() {
        return pinCodeRepository.findAll();
    }

    @GetMapping("/{code}")
    public PinCode getPinCode(@PathVariable String code) {
        return pinCodeRepository.findByCode(code);
    }

    @PostMapping
    public PinCode createPinCode(@RequestBody PinCode pinCode) {
        return pinCodeRepository.save(pinCode);
    }
}
