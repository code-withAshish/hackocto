package org.example.backend.controller;

import org.example.backend.dto.CertificateDTO;
import org.example.backend.service.CertificateService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/certificates")
public class CertificateController {
    private final CertificateService certificateService;

    public CertificateController(CertificateService certificateService) {
        this.certificateService = certificateService;
    }

    @PostMapping("/issue")
    public String issueCertificate(@RequestParam String studentId, @RequestParam String studentName, @RequestParam String course) throws Exception {
        return certificateService.issueCertificate(studentId, studentName, course);
    }

    @GetMapping("/verify")
    public CertificateDTO verifyCertificate(@RequestParam String studentId) throws Exception {
        return certificateService.verifyCertificate(studentId);
    }
}
